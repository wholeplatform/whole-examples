module Microsoft.M.Grammar {
    import Language;
    import Microsoft.Languages;
    export MGrammar;

    language MGrammar {    
        syntax Main 
          = cu:CompilationUnit => cu;

        interleave Skippable
          = Base.Whitespace+ 
          | Language.Grammar.Comment;

        syntax Attributes 
          = attr:AttributeSectionDefList => attr;
        
        syntax AttributeSectionDefList 
          = item:AttributeSectionDef => AttributeSectionDefList[item]
          | list:AttributeSectionDefList item:AttributeSectionDef => AttributeSectionDefList[valuesof(list), item];
        
        syntax AttributeSectionDef 
          = "@{" list:AttributeList "}" => AttributeSectionDef[list];
        
        syntax AttributeList 
          = item:Attribute => AttributeList[item]
          | list:AttributeList "," item:Attribute => AttributeList[valuesof(list), item];
        
        syntax Attribute 
          = label:Label "[" lit:LiteralList? "]" => Attribute[label, lit];
        
        syntax LiteralList
          = item:Literal => LiteralList[item]
          | list:LiteralList "," item:Literal => LiteralList[valuesof(list), item];
            
        syntax Literal 
          = lit:BooleanLiteral => Literal[lit]
          | lit:IntegerLiteral => Literal[lit]
          | lit:RealLiteral => Literal[lit]
          | lit:StringLiteral => Literal[lit]
          | lit:NullLiteral => Literal[lit];
                
        syntax GrammarReference(TypeArgument) 
          = id:BaseTypes.Identifier => ScopeExpression[id]
          | prefix:GrammarReference(TypeArgument) "." id:BaseTypes.Identifier => ScopeExpression[prefix, id]
          | prefix:GrammarReference(TypeArgument) "." id:BaseTypes.Identifier "(" genParams:TypeArguments(TypeArgument) ")" => ScopeExpression[prefix, id, genParams]
          | id:BaseTypes.Identifier "(" genParams:TypeArguments(TypeArgument) ")" => GenericScopeExpression[id, genParams];   

        syntax TypeArguments(TypeArgument) 
          = item:TypeArgument => TypeArguments[item]
          | list:TypeArguments(TypeArgument) "," item:TypeArgument => TypeArguments[valuesof(list), item];
        
        syntax TokenTypeArgument
          = primary:TokenPrimary => TokenTypeArgument[primary];
                                                      
        syntax SyntaxTypeArgument 
          = primary:SyntaxPrimary => SyntaxTypeArgument[primary];
        
        syntax Action
          = "=>" action:TermConstructionBlock => TermConstruction[action];
        
        syntax Name 
          = id:BaseTypes.Identifier => Name[id];
        
        syntax TermPrecedence 
          = mod:TermModifier "(" prec:IntegerLiteral ")" => TermPrecedence[mod, prec];
        
        syntax TermModifier 
          = "left" => TermModifier["Left"]
          | "right" => TermModifier["Right"];
        
        syntax DefinitionParameters 
          = "(" list:TypeParameterList ")" => TypeTemplate[TypeParameters[list]];
        
        syntax TypeParameterList 
          = item:TypeParameter => TypeParameterList[item]
          | list:TypeParameterList "," item:TypeParameter => TypeParameterList[valuesof(list), item];
        
        syntax TypeParameter
          = id:BaseTypes.Identifier => TypeParameter[id];

        syntax LanguageDeclaration
          = attributes:Attributes? modifiers:MemberModifiers? "language" name:Name body:ParserBody 
            => LanguageDeclaration[attributes, modifiers, name, body];
        
        @{Nest[]}
        syntax ParserBody 
          = "{" decls:ParserMemberDeclarationList? "}" => DeclarationBody[decls];

        syntax ParserMemberDeclarationList 
          = item:ParserMemberDeclaration => DeclarationList[item]
          | list:ParserMemberDeclarationList item:ParserMemberDeclaration => DeclarationList[valuesof(list), item];

        syntax ParserMemberDeclaration 
          = decl:SyntaxDeclaration => decl
          | decl:TokenDeclaration => decl
          | decl:InterleaveDeclaration =>decl;

        checkpoint syntax InterleaveDeclaration
          = attributes:Attributes? "interleave" name:Name body:InterleaveBody? ";"
            => InterleaveDeclaration[attributes, name, body];
        
        syntax InterleaveBody
          = "=" productions:InterleaveProductionDeclarations => InterleaveProductionDeclarationBody[productions];
        
        syntax InterleaveProductionDeclarations
          = list:InterleaveProductionDeclarationList => ProductionDeclarations[list];

        syntax InterleaveProductionDeclarationList 
          = item:InterleaveProductionDeclaration => ProductionDeclarationList[item]
          | list:InterleaveProductionDeclarationList "|" item:InterleaveProductionDeclaration => ProductionDeclarationList[valuesof(list), item];
        
        syntax InterleaveProductionDeclaration
          = pat:TokenPatternDeclaration => InterleaveProductionDeclaration[pat];
        
        checkpoint syntax TokenDeclaration
         = attributes:Attributes? modifiers:MemberModifiers? "token" name:Name typeTemplate:DefinitionParameters? body:TokenBody? ";"
           => TokenDeclaration[attributes, modifiers, name, typeTemplate, body];
        
        syntax TokenBody 
          = "=" productions:TokenProductionDeclarations => TokenProductionDeclarationBody[productions];
        
        syntax TokenProductionDeclarations
          = list:TokenProductionDeclarationList => ProductionDeclarations[list];

        syntax TokenProductionDeclarationList
          = item:TokenProductionDeclaration => ProductionDeclarationList[item]
          | list:TokenProductionDeclarationList "|" item:TokenProductionDeclaration => ProductionDeclarationList[valuesof(list), item];
        
        syntax TokenProductionDeclaration
          = pat:TokenPatternDeclaration => ProductionDeclaration[pat];
        
        syntax TokenPatternDeclaration
          = terms:TokenTermDeclarations? => PatternDeclaration[terms];
        
        syntax TokenTermDeclarations
          = list:TokenTermDeclarationList? => TermDeclarations[list];
        
        syntax TokenTermDeclarationList
          = item:TokenTermDeclaration => TermDeclarationList[item]
          | list:TokenTermDeclarationList item:TokenTermDeclaration => TermDeclarationList[valuesof(list), item];

        syntax TokenTermDeclaration
          = attributes:Attributes? mod:TermPrecedence? name:VariableBinding? primary:TokenPrimary
            => TermDeclaration[attributes, mod, name, primary];
        
        syntax TokenPrimary
          = primary:GrammarReference(TokenTypeArgument) => primary
          | primary:StringPrimary => primary
          | primary:TokenCollectionPrimary => primary
          | primary:CharacterClassPrimary => primary
          | primary:InlineTokenRulePrimary => primary
          | primary:WildcardPrimary => primary
          | primary1:TokenPrimary left(10) "-" primary2:TokenPrimary => TokenDifference[primary1, primary2]
          | primary1:TokenPrimary left(20) "&" primary2:TokenPrimary => TokenIntersect[primary1, primary2]
          | left(50) "^" primary:TokenPrimary => TokenInverse[primary];
        
        syntax TokenCollectionPrimary
          = elementType:TokenPrimary range:Range => CollectionPrimary[elementType, range]
          | elementType:TokenPrimary range:CollectionRanges => CollectionPrimary[elementType, range];
        
        syntax InlineTokenRulePrimary
          = "(" productions:TokenProductionDeclarations ")" => InlineTokenRulePrimary[productions];

        checkpoint syntax SyntaxDeclaration
          = attributes:Attributes? modifiers:MemberModifiers? "syntax" name:Name typeTemplate:DefinitionParameters? body:SyntaxBody? ";"
            => SyntaxDeclaration[attributes, modifiers, name, typeTemplate, body];
        
        syntax SyntaxBody
          = "=" productions:SyntaxProductionDeclarations => ProductionDeclarationBody[productions];
        
        syntax SyntaxProductionDeclarations 
          = list:SyntaxProductionDeclarationList => ProductionDeclarations[list];
        
        syntax SyntaxProductionDeclarationList
          = item:SyntaxProductionDeclaration => ProductionDeclarationList[item]
          | list:SyntaxProductionDeclarationList "|" item:SyntaxProductionDeclaration => ProductionDeclarationList[valuesof(list), item];
        
        syntax SyntaxProductionDeclaration
          = prec:ProductionPrecedence? pat:SyntaxPatternDeclaration action:Action?
            => ProductionDeclaration[pat, action, prec];

        syntax ProductionPrecedence
          = "precedence" prec:IntegerLiteral ":" => ProductionPrecedence[prec];
        
        syntax SyntaxPatternDeclaration
          = terms:SyntaxTermDeclaration => PatternDeclaration[terms]
          | "empty" => PatternDeclaration["empty"];
        
        syntax SyntaxTermDeclarations
          = list:SyntaxTermDeclarationList? => TermDeclarations[list];
        
        syntax SyntaxTermDeclarationList
          = item:SyntaxTermDeclaration => TermDeclarationList[item]
          | list:SyntaxTermDeclarationList item:SyntaxTermDeclaration 
            => TermDeclarationList[valuesof(list), item];

        syntax SyntaxTermDeclaration
          = "error" => TermDeclaration["error"]
          | attributes:Attributes? mod:TermPrecedence? name:VariableBinding? primary:SyntaxPrimary
            => TermDeclaration[attributes, mod, name, primary];
        
        syntax SyntaxPrimary
          = primary:GrammarReference(SyntaxTypeArgument) => primary
          | primary:StringPrimary => primary
          | primary:SyntaxCollectionPrimary => primary
          | primary:InlineSyntaxRulePrimary => primary
          | primary:CharacterClassPrimary => primary
          | primary:WildcardPrimary => primary;

        syntax SyntaxCollectionPrimary
          = elementType:SyntaxPrimary range:Range => CollectionPrimary[elementType, range];
        
        syntax InlineSyntaxRulePrimary
          = "(" productions:SyntaxProductionDeclarations ")"
            => InlineSyntaxRulePrimary[productions];

        syntax WildcardPrimary
          = "any" => WildcardPrimary["any"];
        
        syntax VariableBinding
          = name:Name ":" => VariableBinding[name];
        
        syntax Range
          = left(40) "?" => Range["?"]
          | left(40) "*" => Range["*"]
          | left(40) "+" => Range["+"];
        
        syntax CollectionRanges
          = left(40) "#" lit:IntegerLiteral => Ranges[lit, lit]
          | left(40) "#" min:IntegerLiteral ".." max:IntegerLiteral? => Ranges[min, max];
        
        syntax CharacterClassPrimary
          = begin:StringLiteral ".." end:StringLiteral => CharacterRangePrimary[begin, end];
        
        syntax StringPrimary
          = lit:StringLiteral => LiteralPrimary[lit];
        
        syntax StringLiteral
          = val:Language.Grammar.TextLiteral => StringLiteral[val];
        
        syntax IntegerPrimary
          = lit:IntegerLiteral => LiteralPrimary[lit];
        
        syntax IntegerLiteral
          = val:Language.Grammar.Integer => IntegerLiteral[val]
          | "-" val:Language.Grammar.Integer => IntegerLiteral["-", val];
        
        syntax RealPrimary
          = lit:RealLiteral => LiteralPrimary[lit];
        
        syntax RealLiteral
          = val:Language.Grammar.Decimal => RealLiteral[val];
        
        syntax BooleanPrimary
          = lit:BooleanLiteral => LiteralPrimary[lit];
        
        syntax BooleanLiteral
          = "true" => BooleanLiteral["true"]
          | "false" => BooleanLiteral["false"];
        
        syntax NullLiteral
          = "null" => NullLiteral["null"];
        
        syntax TermConstructionBlock
          = node:TopLevelNode => TermConstructionBlock[node];
        
        syntax NodeList
          = node:Node => NodeList[node]
          | list:NodeList "," node:Node => NodeList[valuesof(list), node];
        
        syntax TopLevelNode
          = item:TopLevelAtom => item
          | item:OrderedTerm => item
          | item:UnorderedTerm => item;
        
        syntax Node
          = item:Atom => item
          | item:OrderedTerm => item
          | item:UnorderedTerm => item;
          
        syntax OrderedTerm
          = label:Label? "[" list:NodeList? "]" => OrderedTerm[label, list];
        
        syntax UnorderedTerm
          = label:Label? "{" list:NodeList? "}" => UnorderedTerm[label, list];
        
        syntax Label
          = label:BaseTypes.Identifier => Label[label]
          | "id" "(" atom:Atom ")" => LabelAtom[atom];
        
        syntax Atom
          = a:TopLevelAtom => a
          | "valuesof" "(" id:BaseTypes.Identifier ")" => TermValuesOf[id];
        
        syntax TopLevelAtom
          = lit:StringLiteral => lit
          | lit:RealLiteral => lit
          | lit:BooleanLiteral => lit
          | lit:IntegerLiteral => lit
          | lit:NullLiteral => lit
          | lit:BaseTypes.Identifier => IdentifierAtom[lit]
          | "labelof" "(" id:BaseTypes.Identifier ")" => TermLabelOf[id];
        
        syntax MemberModifiers
          = modifiers:GMemberModifierList => MemberModifiers[modifiers];
        
        syntax GMemberModifierList
          = item:GMemberModifier => MemberModifierList[item]
          | list:GMemberModifierList item:GMemberModifier => MemberModifierList[valuesof(list), item];

        syntax GMemberModifier 
          = "final" => GMemberModifier["ModFinal"];
        
        syntax CompilationUnit
          = decls:ModuleMemberDeclarationList? => CompilationUnit[decls];

        syntax ModuleMemberDeclarationList
          = item:ModuleDeclaration => ModuleMemberDeclarationList[item]
          | list:ModuleMemberDeclarationList item:ModuleDeclaration => ModuleMemberDeclarationList[valuesof(list), item];
        
        syntax ModuleDeclaration
          = "module" name:ModuleName body:ModuleBody ";"? => ModuleDeclaration[name, body];
        
        syntax ModuleName
          = name:BaseTypes.Identifier => ModuleName[name]
          | prefix:ModuleName "." name:BaseTypes.Identifier => ModuleName[prefix, name];
        
        @{Nest[]}
        syntax ModuleBody
          = "{" imports:ImportDirectiveList? exports:ExportDirectiveList? decls:ModuleBodyMemberDeclarationList? "}" 
            => ModuleBody[imports, exports, decls];
            
        syntax ModuleBodyMemberDeclarationList
          = item:LanguageDeclaration => ModuleMemberDeclarationList[item]
          | list:ModuleBodyMemberDeclarationList item:LanguageDeclaration => ModuleMemberDeclarationList[valuesof(list), item];
        
        syntax ImportDirectiveList
          = item:ImportDirective => ImportDirectiveList[item]
          | list:ImportDirectiveList item:ImportDirective => ImportDirectiveList[valuesof(list), item];
        
        syntax ImportDirective
          = dir:ImportModuleDirective => dir
          | dir:ImportAliasDirective => dir
          | dir:ImportModuleScopeDirective => dir;

        syntax ImportModuleDirective
          = "import" name:ModuleName ";" => ImportDirective[name];
        
        syntax ImportAliasDirective 
          = "import" typeRef:ModuleReference id:ImportAlias ";" => ImportDirective[typeRef, id];
        
        syntax ImportAlias
          = "as" id:BaseTypes.Identifier => ImportAlias[id];
            
        syntax ImportModuleScopeDirective
          = "import" typeRef:ModuleReference "{" members:ImportMembers "}" ";" => ImportModuleScopeDirective[typeRef, members];
        
        syntax ImportMembers
          = item:ImportMember => ImportMembers[item]
          | list:ImportMembers "," item:ImportMember => ImportMembers[valuesof(list),item];

        syntax ImportMember
          = member:BaseTypes.Identifier alias:ImportAlias? => ImportMember[member,alias];
        
        syntax ExportDirective
          = "export" identifiers:IdentifierList ";" => ExportDirective[identifiers];
        
        syntax ExportDirectiveList
          = item:ExportDirective => ExportDirectiveList[item]
          | list:ExportDirectiveList item:ExportDirective => ExportDirectiveList[valuesof(list), item];
        
        syntax IdentifierList
          = name:BaseTypes.Identifier => IdentifierList[name]
          | list:IdentifierList "," name:BaseTypes.Identifier => IdentifierList[valuesof(list), name];
                
        syntax ModuleReference
          =  id:BaseTypes.Identifier => ScopeExpression[id]
          |  prefix:ModuleReference "." id:BaseTypes.Identifier => ScopeExpression[prefix, id];        
        
        syntax ModuleReferenceList
          = item:ModuleReference => GrammarReferenceList[item]
          | list:ModuleReference "," item:ModuleReference => GrammarReferenceList[valuesof(list), item];
        
        /* Keywords */
        @{Classification["Keyword"]} final token TAny = "any";
        @{Classification["Keyword"]} final token TError = "error";
        @{Classification["Keyword"]} final token TToken = "token";
        @{Classification["Keyword"]} final token TSyntax = "syntax";
        @{Classification["Keyword"]} final token TLanguage = "language";
        @{Classification["Keyword"]} final token TModule = "module";
        @{Classification["Keyword"]} final token TLeft = "left";
        @{Classification["Keyword"]} final token TRight = "right";
        @{Classification["Keyword"]} final token TNew = "new";
        @{Classification["Keyword"]} final token TOverride = "override";
        @{Classification["Keyword"]} final token TVirtual = "virtual";
        @{Classification["Keyword"]} final token TPartial = "partial";
        @{Classification["Keyword"]} final token TIdentifier = "identifier";
        @{Classification["Keyword"]} final token TKeyword = "keyword";
        @{Classification["Keyword"]} final token TCheckpoint = "checkpoint";
        @{Classification["Keyword"]} final token TInterleave = "interleave";
        @{Classification["Keyword"]} final token TNest = "nest";
        @{Classification["Keyword"]} final token TTrue = "true";
        @{Classification["Keyword"]} final token TFalse = "false";
        @{Classification["Keyword"]} final token TPrecedence = "precedence";
        @{Classification["Keyword"]} final token TEmpty = "empty";
        @{Classification["Keyword"]} final token TNull = "null";
        @{Classification["Keyword"]} final token TImport = "import";
        @{Classification["Keyword"]} final token TExport = "export";
        @{Classification["Keyword"]} final token TFinal = "final";
        @{Classification["Keyword"]} token TId = "id";
        @{Classification["Keyword"]} token TLabelOf = "labelof";
        @{Classification["Keyword"]} token TValuesOf = "valuesof";
        
        /* Delimiters */
        @{Classification["Delimiter"]} token TLeftBracket = "[";
        @{Classification["Delimiter"]} token TRightBracket = "]";
        @{Classification["Delimiter"]} token TLeftBrace = "{";
        @{Classification["Delimiter"]} token TRightBrace = "}";
        @{Classification["Delimiter"]} token TLeftParen = "(";
        @{Classification["Delimiter"]} token TRightParen = ")";
    }
}

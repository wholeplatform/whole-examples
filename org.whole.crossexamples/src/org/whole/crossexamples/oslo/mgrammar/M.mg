//------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All rights reserved.
//------------------------------------------------------------

module Microsoft.M
{
    language MParser
    {
        syntax Main = CompilationUnit;

        interleave Skippable = Whitespace | Comment;
        interleave Whitespace = WhitespaceToken+;
        interleave Comment = CommentToken;

        syntax CompilationUnit 
            = decls:ModuleDeclaration* 
              => 
                id("Microsoft.M.CompilationUnit") 
                {
                    Modules { decls }
                };
        
        
        syntax ExportDirective 
            = "export" members:ParsedIdentifiers ";"
              => 
              id("Microsoft.M.ExportDirective")
              {
                  Names { members }
              };   
        
        syntax ImportAlias 
            = "as" alias:ParsedIdentifier
              => alias;

        
        syntax ImportDirective 
            = "import" imports:ImportModules ";" 
              => 
              id("Microsoft.M.ModuleImportDirective")
              {
                  Modules { imports }
              }
                      | "import" targetModule:MemberAccessExpression "{" members:ImportMembers "}" ";" 
                => 
                id("Microsoft.M.MemberImportDirective")
                {
                    ModuleName { targetModule },
                    Members { members }
                };
        
        syntax ImportMember 
            = member:ParsedIdentifier alias:ImportAlias?
                => id("Microsoft.M.ImportedName")
                {
                    Name { member },
                    Alias { alias }
                };
        
        syntax ImportMembers 
            = item:ImportMember
                => [item]
            | list:ImportMembers "," item:ImportMember
                => [valuesof(list), item];
        
        syntax ImportModule 
            = targetModule:MemberAccessExpression alias:ImportAlias?
                => id("Microsoft.M.ImportedName")
                {
                    Name { targetModule },
                    Alias { alias }
                };
        
        syntax ImportModules 
            = item:ImportModule
                => [item]
            | list:ImportModules "," item:ImportModule
                => [valuesof(list), item];
        
        
        syntax ModuleDeclaration 
            = "module" name:MemberAccessExpression "{" imports:ImportDirective* exports:ExportDirective* decls:ModuleMemberDeclaration* "}"  ";"?
                => id("Microsoft.M.ModuleDeclaration")
                {
                    Name { name }, 
                    Imports { imports }, 
                    Exports { exports }, 
                    Members { decls }
                }
            | "module" name:MemberAccessExpression "{" imports:ImportDirective* exports:ExportDirective* decls:ModuleMemberDeclaration* error
                => id("Microsoft.M.ModuleDeclaration")
                {
                    Name { name }, 
                    Imports { imports }, 
                    Exports { exports }, 
                    Members { decls }
                };

        syntax ModuleMemberDeclaration 
            = FieldDeclaration 
            | ComputedValueDeclaration 
            | TypeDeclaration;
            
        syntax Parameter 
            = name:ParsedIdentifier t:TypeAscription?
                => 
                id("Microsoft.M.ParameterDeclaration")
                {
                    Name { name },
                    Type { t }
                };
        
        syntax Parameters 
            = item:Parameter 
                => [item]
            | list:Parameters "," item:Parameter
                => [list, item];
        
        
        syntax ParenthesizedParameters 
            = "(" parameters:Parameters? ")" 
                => parameters;
        

        syntax TypeAscription 
            = ":" type:Expression
                => type;
        
        syntax TypeDeclaration 
            = "type" name:ParsedIdentifier ";"
                => id("Microsoft.M.TypeDeclaration") {
                    Name { name }, 
                    Type { null }, 
                    Bases { [] }
                }
            | precedence  1: "type"  name:ParsedIdentifier type:InitializationExpression OptionalSemicolon
                => id("Microsoft.M.TypeDeclaration") {
                    Name { name }, 
                    Type { type }, 
                    Bases { []  }
                }
            | precedence  2: "type"  name:ParsedIdentifier type:EntityTypeExpression OptionalSemicolon
                => id("Microsoft.M.TypeDeclaration") {
                    Name { name }, 
                    Type { type }, 
                    Bases { [] }
                }
            | "type"  name:ParsedIdentifier type:EntityTypeExpression right(5) "where" constraints:WhereExpressions ";" 
                => id("Microsoft.M.TypeDeclaration") {
                    Name { name }, 
                    Type { id("Microsoft.M.Where")[type, constraints] }, 
                    Bases { [] }
                }
                                
            // TypeReference list 
            | "type"  name:ParsedIdentifier ":" type:Expression ";" 
                => id("Microsoft.M.TypeDeclaration") {
                    Name { name }, 
                    Type { type }, 
                    Bases { [] }
                }
            | "type"  name:ParsedIdentifier ":" firstBase:MemberAccessExpression "," otherBases:TypeReferences ";"
                => id("Microsoft.M.TypeDeclaration") {
                    Name { name }, 
                    Type { null }, 
                    Bases { [firstBase, valuesof(otherBases)] }
                }
            | "type"  name:ParsedIdentifier ":" firstBase:MemberAccessExpression type:EntityTypeExpression OptionalSemicolon
                => id("Microsoft.M.TypeDeclaration") {
                    Name { name }, 
                    Type { type }, 
                    Bases { [firstBase] }
                }
            | "type"  name:ParsedIdentifier ":" firstBase:MemberAccessExpression type:EntityTypeExpression right(5) "where" constraints:WhereExpressions ";" 
                => id("Microsoft.M.TypeDeclaration") {
                    Name { name }, 
                    Type { id("Microsoft.M.Where")[type, constraints] }, 
                    Bases { [firstBase] }
                }
            | "type"  name:ParsedIdentifier ":" firstBase:MemberAccessExpression "," otherBases:TypeReferences type:EntityTypeExpression OptionalSemicolon
                => id("Microsoft.M.TypeDeclaration") {
                    Name { name }, 
                    Type { type }, 
                    Bases { [firstBase, valuesof(otherBases)] }
                }
            | "type"  name:ParsedIdentifier ":"firstBase:MemberAccessExpression "," otherBases:TypeReferences type:EntityTypeExpression right(5) "where" constraints:WhereExpressions ";" 
                => id("Microsoft.M.TypeDeclaration") {
                    Name { name }, 
                    Type { id("Microsoft.M.Where")[type, constraints] }, 
                    Bases { [firstBase, valuesof(otherBases)] }
                };
        
        syntax OptionalSemicolon 
            = ";"?
                => Dummy[];
        
        syntax TypeReferences 
            = item:MemberAccessExpression
                => [item]
            | list:TypeReferences "," item:MemberAccessExpression
                => [valuesof(list), item];

        
        syntax Expression 
            = expr : WhereExpression
                => expr
            | leftArg:Expression left(1) "|" rightArg:Expression
                => id("Microsoft.M.Or")[leftArg, rightArg]
            | leftArg:Expression left(2) "^" rightArg:Expression
                => id("Microsoft.M.ExclusiveOr")[leftArg, rightArg]
            | leftArg:Expression left(3) "&" rightArg:Expression
                => id("Microsoft.M.And")[leftArg, rightArg]
            | type:Expression right(4) "select" constraints:Expression
                => id("Microsoft.M.Select")[type, constraints];
            
        syntax WhereExpression 
            = expr : QueryExpression => expr
            | type:QueryExpression right(5) "where" constraints:WhereExpressions
                => id("Microsoft.M.Where")[type, constraints];

        syntax WhereExpressions 
            = item:WhereExpression
                => item
            | list:WhereExpressions right(7) "," item:WhereExpression
                => id("Microsoft.M.AndAlso")[list, item];
        
        syntax QueryExpression 
            = ConditionalExpression
            | FromExpression
            | IntoExpression;
        
        syntax IntoExpression 
            = "from" fname:ParsedIdentifier "in" init:ConditionalExpression fbody:QueryBody "into" iname:ParsedIdentifier ibody:QueryBody
                => id("Microsoft.M.From") {
                    VariableName { iname },
                    Initializer { 
                        id("Microsoft.M.From") {
                            VariableName { fname },
                            Initializer { init },
                            Body { fbody }
                        }                     
                    },
                    Body { ibody }
                };
        
        syntax FromExpression 
            = "from" fname:ParsedIdentifier "in" init:ConditionalExpression fbody:QueryBody
                => id("Microsoft.M.From") {
                    VariableName { fname },
                    Initializer { init },
                    Body { fbody }
                };
        
        syntax QueryBody 
            = FromExpression
            | JoinIntoExpression
            | JoinExpression
            | WhereClause
            | LetExpression
            | QueryConstructor;

        syntax QueryGenerator = QueryBody;
        
        syntax JoinExpression 
            = "join" name:ParsedIdentifier "in" inExpr:ConditionalExpression "on" onExpr:Expression "equals" eqExpr:ConditionalExpression body:QueryGenerator
                => id("Microsoft.M.Join") {
                    VariableName { name },
                    Initializer { inExpr },
                    Body { body },
                    LeftKey { onExpr },
                    RightKey { eqExpr }
                };
        
        syntax JoinIntoExpression 
            = "join" name:ParsedIdentifier "in" inExpr:ConditionalExpression "on" onExpr:Expression "equals" eqExpr:ConditionalExpression "into"
 intoName:ParsedIdentifier body:QueryGenerator
                => id("Microsoft.M.Join") {
                    VariableName { name },
                    Initializer { inExpr },
                    Body { body },
                    LeftKey { onExpr },
                    RightKey { eqExpr },
                    IntoName { intoName }
                };
        
        syntax LetExpression 
            = "let" name:ParsedIdentifier "=" expr:ConditionalExpression body:QueryGenerator
                => id("Microsoft.M.Let") {
                    VariableName { name },
                    Initializer { expr },
                    Body { body }
                };

        syntax WhereClause 
            = right(6) "where" predicate:ConditionalExpression body:QueryGenerator
                => id("Microsoft.M.WhereClause") {
                    Predicate { predicate },
                    Body { body }
                };

        syntax QueryConstructor 
            = SelectClause
            | AccumulateClause;

        syntax GroupByClause 
            = "group" projection:Expression "by" discriminator:ConditionalExpression                 => id("Microsoft.M.GroupByClause") {
                    Projection { projection },
                    Discriminator { discriminator }
                };
        
        syntax SelectClause 
            = left(6) "select" expr:ConditionalExpression 
                => id("Microsoft.M.SelectClause") {
                    Projection { expr }
                };
        
        syntax AccumulateClause 
            = "let" seedName:ParsedIdentifier "=" seedExpression:ConditionalExpression "accumulate" accumulator:ConditionalExpression
                => id("Microsoft.M.AccumulateClause") {
                    SeedName { seedName },
                    SeedInitializer { seedExpression },
                    Accumulator { accumulator }
                };
        
        syntax ConditionalExpression 
            = expr : NullCoalescingExpression
                => expr
            | test:NullCoalescingExpression right(7) "?" ifTrue:ConditionalExpression right(13) ":" ifFalse:ConditionalExpression
                => id("Microsoft.M.Conditional")[test, ifTrue, ifFalse];

        syntax NullCoalescingExpression 
            = expr : PrimaryExpression
                => expr
            | leftArg:NullCoalescingExpression left(9) "??" rightArg:NullCoalescingExpression
                => id("Microsoft.M.Coalesce")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(10) "||" rightArg:NullCoalescingExpression
                => id("Microsoft.M.OrElse")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(11) "&&" rightArg:NullCoalescingExpression
                => id("Microsoft.M.AndAlso")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(12) "==" rightArg:NullCoalescingExpression
                => id("Microsoft.M.Equal")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(12) "!=" rightArg:NullCoalescingExpression
                => id("Microsoft.M.NotEqual")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(13) "<" rightArg:NullCoalescingExpression
                => id("Microsoft.M.LessThan")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(13) ">" rightArg:NullCoalescingExpression
                => id("Microsoft.M.GreaterThan")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(13) "<=" rightArg:NullCoalescingExpression
                => id("Microsoft.M.LessThanOrEqual")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(13) ">=" rightArg:NullCoalescingExpression
                => id("Microsoft.M.GreaterThanOrEqual")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(13) "in" rightArg:NullCoalescingExpression
                => id("Microsoft.M.In")[leftArg, rightArg]
            | expr:NullCoalescingExpression left(13) ":" type:NullCoalescingExpression
                => id("Microsoft.M.TypeAscription")[expr, type]
            | leftArg:NullCoalescingExpression left(14) "<<" rightArg:NullCoalescingExpression
                => id("Microsoft.M.LeftShift")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(14) ">>" rightArg:NullCoalescingExpression
                => id("Microsoft.M.RightShift")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(15) "+" rightArg:NullCoalescingExpression
                => id("Microsoft.M.Add")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(15) "-" rightArg:NullCoalescingExpression
                => id("Microsoft.M.Subtract")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(16) "*" rightArg:NullCoalescingExpression
                => id("Microsoft.M.Multiply")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(16) "/" rightArg:NullCoalescingExpression
                => id("Microsoft.M.Divide")[leftArg, rightArg]
            | leftArg:NullCoalescingExpression left(16) "%" rightArg:NullCoalescingExpression
                => id("Microsoft.M.Modulo")[leftArg, rightArg]
            | type:PrimaryExpression left(17) "?"
                => id("Microsoft.M.CollectionType") {
                    ElementType { type },
                    MinimumCount { 0 },
                    MaximumCount { 1 }
                }
            | type:PrimaryExpression left(17) "+"
                => id("Microsoft.M.CollectionType") {
                    ElementType { type },
                    MinimumCount { 1 },
                    MaximumCount { null }
                }
            | type:PrimaryExpression left(17) "*"
                => id("Microsoft.M.CollectionType") {
                    ElementType { type },
                    MinimumCount { 0 },
                    MaximumCount { null }
                }
            | expr:PrimaryExpression left(17) "#"
                => id("Microsoft.M.Count")[expr]
            | type:PrimaryExpression left(17) "#" count:IntegerLiteral
                => id("Microsoft.M.CollectionType") {
                      ElementType { type },
                      MinimumCount { count },
                      MaximumCount { count }
                }
            | type:PrimaryExpression left(17) "#" min:IntegerLiteral ".."
                => id("Microsoft.M.CollectionType") {
                    ElementType { type },
                    MinimumCount { min },
                    MaximumCount { null }
                }
            | type:PrimaryExpression left(17) "#" min:IntegerLiteral ".." max:IntegerLiteral
                => id("Microsoft.M.CollectionType") {
                    ElementType { type },
                    MinimumCount { min },
                    MaximumCount { max }
                }
            | right(18) "+" expr:PrimaryExpression
                => id("Microsoft.M.UnaryPlus")[expr]
            | right(18) "-" expr:PrimaryExpression
                => id("Microsoft.M.Negate")[expr]
            | right(18) "!" expr:PrimaryExpression
                => id("Microsoft.M.Not")[expr]
            | right(18) "~" expr:PrimaryExpression
                => id("Microsoft.M.Complement")[expr]
            | right(18) dot:"." expr:PrimaryExpression
                => null             
            | expr : IdentityExpression
                => expr
            | expr : UniqueExpression
                => expr;

        syntax PrimaryExpression 
            = PrimaryCreationExpression;
        
        syntax PrimaryCreationExpression 
            = EntityTypeExpression
            | Literal
            | InitializationExpression
            | InvocationExpression
            | ItemAccessExpression
            | MemberAccessExpression
            | ParenthesizedExpression 
            | ThisAccessExpression
            | ValueAccessExpression;
        
        syntax EntityTypeExpression 
            = "{"  decls:EntityMemberDeclarations "}" 
                => id("Microsoft.M.EntityType") {
                    Members { decls }
                };    
        
        syntax InitializationExpression 
            = "{" successors:GraphExpressions?  "}"
                => id("Microsoft.M.Graph") {
                        DeclaredWithEqualsSign { false },
                        Successors { successors }
                    }
            | "{" successors:GraphExpressions "," "}"
                => id("Microsoft.M.Graph") {
                        DeclaredWithEqualsSign { false },
                        Successors { successors }
                    };
        
        syntax InvocationExpression 
            = expr:PrimaryExpression args:InvocationExpressionArguments 
                => id("Microsoft.M.Call")[expr, args];
        
        
        syntax InvocationExpressionArguments 
            = "(" args:Arguments? ")" 
                => args;
        
        syntax Argument 
            = Expression;
        
        syntax Arguments 
            = item:Argument
                => [item]
            | list:Arguments "," item:Argument 
                => [valuesof(list), item];    

        syntax ItemAccessExpression 
            = "item"
                => id("Microsoft.M.ItemAccess") {}; 
        
        syntax MemberAccessExpression 
            = s:SimpleName => s
            | expr:PrimaryExpression dot:"." member:MemberName
                => id("Microsoft.M.MemberAccess"){
                    Target { expr },
                    MemberName { member },
                    Dot { dot }
               }
            | expr:PrimaryExpression dot:"." error
                => id("Microsoft.M.MemberAccess"){
                    Target { expr },
                    MemberName { null },
                    Dot { null }
               }; 


        syntax SimpleName 
            = id : ParsedIdentifier  
                => id("Microsoft.M.DeclarationReference"){
                    Name { id }
                }; 
        
        
        syntax ParenthesizedExpression 
            = "(" expr:Expression ")" 
                => expr; 
        
        syntax ThisAccessExpression 
            = "this"
                => id("Microsoft.M.ThisAccess")[]; 

        syntax ValueAccessExpression 
            = "value"
                => id("Microsoft.M.ValueAccess")[]; 


        
        syntax ComputedValueBody 
            = "{" expr:Expression ";"? "}" 
                => expr
            | "{" expr:Expression error
                => expr;

        syntax ComputedValueDeclaration 
            = name:ParsedIdentifier parameters:ParenthesizedParameters type:TypeAscription? body:ComputedValueBody
                => id("Microsoft.M.ComputedValueDeclaration") {
                        Name { name },
                        Body { body },
                        Type { type },
                        Parameters { parameters }
                    }
            | name:ParsedIdentifier  parameters:ParenthesizedParameters type:TypeAscription? ";"
                => id("Microsoft.M.ComputedValueDeclaration") {
                        Name { name },
                        Body { null },
                        Type { type },
                        Parameters { parameters }
                    };    
        
        syntax EntityMemberDeclaration 
            = FieldDeclaration
            | ComputedValueDeclaration;    
        
        syntax EntityMemberDeclarations 
            = item:EntityMemberDeclaration
                => [item]
            | list:EntityMemberDeclarations item:EntityMemberDeclaration
                => [valuesof(list), item];    
        
        
        // This marker adds an extra indent to the initial value of a field. This helps visually distinguish
        // between a field with a collection initial value (the collection will be indented) and a computed property (the
        // body will be flush left)
        
        checkpoint syntax FieldDeclaration 
            = 
            name:ParsedIdentifier type:TypeAscription? "=" initialValue:Expression ";" 
                => id("Microsoft.M.ExtentDeclaration") {
                        Name { name },
                        InitialValue { initialValue },
                        Type { type }
                    }
            | name:ParsedIdentifier type:TypeAscription? initialValue:InitializationExpression ";"?
                => id("Microsoft.M.ExtentDeclaration") {
                        Name { name },
                        InitialValue { initialValue },
                        Type { type }
                    }
            | name:ParsedIdentifier type:TypeAscription? ";"
                => id("Microsoft.M.ExtentDeclaration") {
                        Name { name },
                        InitialValue { null },
                        Type { type }
                    };

        syntax GraphExpression 
            = precedence 1: expr:Expression
                => expr
            | precedence 2: name:ParsedIdentifier type:TypeAscription? "=" successor:Expression
                => id("Microsoft.M.Graph") {
                        Name { name },
                        DeclaredWithEqualsSign { true },
                        Successors { [ successor ] },
                        Type { type }
                    }
            | precedence  2: name:ParsedIdentifier type:TypeAscription? InitializationExpression
                => id("Microsoft.M.Graph") {
                        Name { name },
                        DeclaredWithEqualsSign { false },
                        Successors { [ ] },
                        Type { type }
                    };

        syntax GraphLabel 
            = id:MemberAccessExpression
                => id
            | "." id:MemberAccessExpression
                => LeadingDot { id };
        
                syntax GraphExpressions 
            = item:GraphExpression
                => [item]
            | list:GraphExpressions "," item:GraphExpression
                => [valuesof(list), item];

        syntax IdentityExpression 
            = "identity" name:ParsedIdentifier
                => id("Microsoft.M.IdentityConstraint") {
                        Names { [name] }
                    }
            | "identity" "(" names:ParsedIdentifiers ")"
                => id("Microsoft.M.IdentityConstraint") {
                        Names { names }
                    };
        
        syntax MemberName = 
            id:ParsedIdentifier 
                => id("Microsoft.M.DeclarationReference"){
                    Name { id }
                };

                
        syntax UniqueExpression 
            = "unique" name:ParsedIdentifier
                => id("Microsoft.M.UniquenessConstraint") {
                        Names { [name] }
                    }
            | "unique" "(" names:ParsedIdentifiers ")"
                => id("Microsoft.M.UniquenessConstraint") {
                        Names { names }
                    };
  
        syntax Literal 
            = Decimal
            | Integer
            | Scientific
            | DateTime
            | DateTimeOffset
            | Date
            | Time
            | CharacterValue
            | TextValue
            | Binary
            | Guid
            | Logical
            | Null;
 
        syntax Decimal 
            = text : DecimalLiteral
                => id("Microsoft.M.Literal") {
                    Kind { "Decimal" },
                    Text { text }
                };
        
        syntax Integer 
            = text : IntegerLiteral
                => id("Microsoft.M.Literal") {
                    Kind { "Integer" },
                    Text { text }
                };
        
        syntax Scientific 
            = text : ScientificLiteral
                => id("Microsoft.M.Literal") {
                    Kind { "Scientific" },
                    Text { text }
                };
                
        syntax DateTime = 
            text : DateTimeLiteral
                => id("Microsoft.M.Literal") {
                    Kind { "DateTime" },
                    Text { text }
                };
        syntax DateTimeOffset = 
            text : DateTimeOffsetLiteral
                => id("Microsoft.M.Literal") {
                    Kind { "DateTimeOffset" },
                    Text { text }
                };
        syntax Date = 
            text : DateLiteral
                => id("Microsoft.M.Literal") {
                    Kind { "Date" },
                    Text { text }
                };
        syntax Time = 
            text : TimeLiteral
                => id("Microsoft.M.Literal") {
                    Kind { "Time" },
                    Text { text }
                };
        syntax CharacterValue = 
            text : CharacterLiteral
                => id("Microsoft.M.Literal") {
                    Kind { "Decimal" },
                    Text { text }
                };
        syntax TextValue = 
            text : TextLiteral
                => id("Microsoft.M.Literal") {
                    Kind { "Text" },
                    Text { text }
                };
        syntax Binary = 
            text : BinaryLiteral
                => id("Microsoft.M.Literal") {
                    Kind { "Binary" },
                    Text { text }
                };
            
        syntax Guid = 
            text : GuidLiteral
                => id("Microsoft.M.Literal") {
                    Kind { "Guid" },
                    Text { text }
                };
            
        syntax Logical = 
            "true" 
                => id("Microsoft.M.Literal") {
                    Kind { "Logical" },
                    Text { "true" }
                }
            
            | "false" 
                => id("Microsoft.M.Literal") {
                    Kind { "Logical" },
                    Text { "false" }
                };
        
        syntax Null 
            = "null" => id("Microsoft.M.NullLiteral")
            {
                Kind { "Null" },
                Text { "null" }
            };
        
        
        token ErrorErrorError = "__Error";
        
        
        token BinaryLiteral 
            = "0x" HexDigits? 
            | "0X" HexDigits?;
        
        token Character 
            = CharacterSimple 
            | CharacterEscapeHex
            | CharacterEscapeSimple
            | CharacterEscapeUnicode;
        token CharacterEscapeHex 
            = CharacterEscapeHexPrefix HexDigit 
            | CharacterEscapeHexPrefix HexDigit HexDigit
            | CharacterEscapeHexPrefix HexDigit HexDigit HexDigit
            | CharacterEscapeHexPrefix HexDigit HexDigit HexDigit HexDigit;
        token CharacterEscapeHexPrefix = "\\x" | "\\X";
        token CharacterEscapeSimple = '\u005C' /* Backslash */ CharacterEscapeSimpleCharacter;
        token CharacterEscapeSimpleCharacter 
            = "'"        // Single Quote
            | '"'      // Double Quote
            | '\u005C' // Backslash
            | '0'      // Null
            | 'a'      // Alert
            | 'b'      // Backspace
            | 'f'      // Form Feed
            | 'n'      // New Line
            | 'r'      // Carriage Return
            | 't'      // Horizontal Tab
            | 'v';     // Vertical Tab
        token CharacterEscapeUnicode 
            = "\\u"  HexDigit  HexDigit  HexDigit  HexDigit
            | "\\U"  HexDigit  HexDigit  HexDigit  HexDigit HexDigit  HexDigit  HexDigit  HexDigit;
        
        
        token CharacterLiteral = 
            "'" Character "'";
        token Characters = Character+;
        token CharacterSimple = ^(
                 '\u0027' // Single Quote
              |  '\u005C' // Backslash
              |  '\u000A' // New Line
              |  '\u000D' // Carriage Return
              |  '\u0085' // Next Line
              |  '\u2028' // Line Separator
              |  '\u2029'); // Paragraph Separator
        
        
        token CommentToken 
            = CommentDelimited
            | CommentLine;
        token CommentDelimited = "/*" CommentDelimitedContent* "*/";
        token CommentDelimitedContent = 
            ^('*')
            | '*'  ^('/');
        token CommentLine = "//" CommentLineContent*;
                token CommentLineContent = ^(
                 '\u000A' // New Line
              |  '\u000D' // Carriage Return
              |  '\u0085' // Next Line
              |  '\u2028' // Line Separator
              |  '\u2029'); // Paragraph Separator
        
        token DateDay 
            = "01" | "02" | "03" | "04" | "05" | "06" | "07" | "08" | "09" | "10" | "11" | "12" | "13" | "14" | "15" |
            "16" | "17" | "18" | "19" | "20" | "21" | "22" | "23" | "24" | "25" | "26" | "27" | "28" | "29" | "30" |
            "31";
        
        token DateLiteral = Sign? DateYear "-" DateMonth "-" DateDay;
        token DateMonth = "01" | "02" | "03" | "04" | "05" | "06" | "07" | "08" | "09" | "10" | "11" | "12";
        token DateYear = DecimalDigit DecimalDigit DecimalDigit DecimalDigit;
        token DateTimeLiteral = DateLiteral "T" TimeLiteral;
        token DateTimeOffsetLiteral = DateLiteral "T" TimeLiteral TimeZone;
        
        token DecimalDigits = DecimalDigit+;
        token DecimalDigit =  '0'..'9';
        
        
        token DecimalLiteral = IntegerLiteral "." DecimalDigit DecimalDigits?;
        
        
        token GuidLiteral = 
            "#" "["
            HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit "-"
            HexDigit HexDigit HexDigit HexDigit "-"
            HexDigit HexDigit HexDigit HexDigit "-"
            HexDigit HexDigit HexDigit HexDigit "-"
            HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit 
            "]";

        token HexDigit = '0'..'9' | 'a'..'f' | 'A'..'F';
        token HexDigits = HexDigit+;
        

        
        identifier token IdentifierName = IdentifierBegin IdentifierCharacters?;
        
        syntax ParsedIdentifier = 
            id:IdentifierVerbatim => id("Microsoft.M.VerbatimIdentifier")[id]
            | id:IdentifierName => id("Microsoft.M.Identifier")[id];
        syntax ParsedIdentifiers 
            = item:ParsedIdentifier
                => [item]
            | list:ParsedIdentifiers "," item:ParsedIdentifier
                => [ valuesof(list), item ];

        token IdentifierBegin = '_' | Letter;
                token IdentifierCharacter 
            = IdentifierBegin
            | '$'
            | DecimalDigit;
        token IdentifierCharacters = IdentifierCharacter+;
        token IdentifierVerbatim = '[' IdentifierVerbatimCharacters ']';
        token IdentifierVerbatimCharacter 
            = ^( ']' )
            | IdentifierVerbatimEscape;
        token IdentifierVerbatimCharacters = IdentifierVerbatimCharacter+;
        token IdentifierVerbatimEscape = "\\\\" | "\\]";
        
        
        token IntegerLiteral = DecimalDigits;
        
        token Letter = 'a'..'z' | 'A'..'Z';
        
        token NewLineCharacter 
            = '\u000A' // New Line
            | '\u000D' // Carriage Return
            | '\u0085' // Next Line
            | '\u2028' // Line Separator
            | '\u2029'; // Paragraph Separator
        
        
        token ScientificLiteral 
            = DecimalLiteral "e" Sign? DecimalDigit DecimalDigits? 
            | DecimalLiteral "E" Sign? DecimalDigit DecimalDigits?;
        
        token Sign = "+" | "-";
        
        
        token TextLiteral 
            = '"' TextCharacters? '"' 
            | '@' '"' TextVerbatimCharacters? '"';
        
        token TextCharacter 
            = TextSimple 
            | CharacterEscapeHex 
            | CharacterEscapeSimple 
            | CharacterEscapeUnicode;
        token TextCharacters = TextCharacter+;
                token TextSimple = ^(
                '"'
              | '\u005C' // Backslash
              | '\u000A' // New Line
              | '\u000D' // Carriage Return
              | '\u0085' // Next Line
              | '\u2028' // Line Separator
              | '\u2029'); // Paragraph Separator
        token TextVerbatimCharacter 
            = ^('"')
            | TextVerbatimCharacterEscape;
        token TextVerbatimCharacterEscape = '"' '"';
        token TextVerbatimCharacters = TextVerbatimCharacter+;
        
        token TimeHour 
            = "00" | "01" | "02" | "03" | "04" | "05" | "06" | "07" | "08" | "09" | "10" | "11" |
            "12" | "13" | "14" | "15" | "16" | "17" | "18" | "19" | "20" | "21" | "22" | "23";
        token TimeHourMinute = TimeHour ":" TimeMinute;
        
        
        token TimeLiteral = TimeHourMinute ":" TimeSecond;
        token TimeMinute 
            = "0" DecimalDigit 
            | "1" DecimalDigit 
            | "2" DecimalDigit 
            | "3" DecimalDigit
            | "4" DecimalDigit
            | "5" DecimalDigit;
        token TimeSecond 
            = "0" DecimalDigit TimeSecondDecimalPart?
            | "1" DecimalDigit TimeSecondDecimalPart?
            | "2" DecimalDigit TimeSecondDecimalPart?
            | "3" DecimalDigit TimeSecondDecimalPart?
            | "4" DecimalDigit TimeSecondDecimalPart?
            | "5" DecimalDigit TimeSecondDecimalPart?
            | "60" TimeSecondDecimalPart?;
        token TimeSecondDecimalPart = "." DecimalDigits;
        token TimeZone 
            = Sign TimeHourMinute
            | "Z";
        
        
        token WhitespaceToken = WhitespaceCharacter+;
                token WhitespaceCharacter 
            = '\u0009'   // Horizontal Tab
            | '\u000B' // Vertical Tab
            | '\u000C' // Form Feed
            | '\u0020' // Space
            | NewLineCharacter;

        token Ampersand = "&";
        token AmpersandAmpersand = "&&";
        token Asterisk = "*";
        token CircumflexAccent = "^";
        token EqualsSign = "=";
        token EqualsSignEqualsSign = "==";
        token ExclamationMark = "!";
        token ExclamationMarkEqualsSign = "!=";
        token GreaterThanSign = ">";
        token GreaterThanSignEqualsSign = ">=";
        token HyphenMinus = "-";
        token LessThanSign = "<";
        token LessThanSignEqualsSign = "<=";
        token LessThanSignLessThanSign = "<<";
        token PercentSign = "%";
        token PlusSign = "+";
        token QuestionMark = "?";
        token QuestionMarkQuestionMark = "??";
        token Solidus = "/";
        token Tilde = "~";
        token VerticalLine = "|";
        token VerticalLineVerticalLine = "||";
        
        token Colon = ":";
        token Comma = ",";
        token FullStop = ".";
        token LeftCurlyBracket = "{";
        token LeftParentheses = "(";
        token LeftSquareBracket = "[";
        token RightCurlyBracket = "}";
        token RightParentheses = ")";
        token RightSquareBracket = "]";
        token Semicolon = ";";
        
        token AccumulateKeyword = "accumulate";
        token AsKeyword = "as";
        token ByKeyword = "by";
        token EqualsKeyword = "equals";
        token ExportKeyword = "export";
        token FalseKeyword = "false";
        token FromKeyword = "from";
        token GroupKeyword = "group";
        token IdentityKeyword = "identity";
        token ImportKeyword = "import";
        token InKeyword = "in";
        token IntoKeyword = "into";
        token ItemKeyword = "item";
        token JoinKeyword = "join";
        token LetKeyword = "let";
        token ModuleKeyword = "module";
        token NullKeyword = "null";
        token OnKeyword = "on";
        token SelectKeyword = "select";
        token ThisKeyword = "this";
        token TrueKeyword = "true";
        token TypeKeyword = "type";
        token UniqueKeyword = "unique";
        token ValueKeyword = "value";
        token WhereKeyword = "where";
    }
}
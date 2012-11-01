//------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All rights reserved.
//------------------------------------------------------------

// A is a new grammar for writing programs to define applications.

module Microsoft.M.Grammar.Samples
{
    language A {

        token Whitespace = (' ' | '\r' | '\n');
        token Integer = ('0'..'9')+;
        token Identifier = ('A'..'Z' | 'a'..'z' | '.')+ - (As | End | Use | With | Application | Model | Controller);

        interleave Skippable = Whitespace;
        
        syntax Main = "Application" name:Identifier autoview:AutoView? autoservice:AutoService? modelref:ModelRef* "End" "Application" 
            => application[name, autoview, autoservice, modelref];
        
        syntax AutoView = "With" "AutoView" => autoview[true];
        syntax AutoService = "With" "AutoService" => autoservice[true];
        syntax ModelRef = "Use" "Model" sourcename:Identifier "As" name:Identifier controllerref:ControllerRef*   => modelref[sourcename, name, controllerref];
        syntax ControllerRef = "With" "Controller" sourcename:Identifier "As" name:Identifier  => controllerref[sourcename, name];
        @{Classification["Keyword"]} token As = "As";
        @{Classification["Keyword"]} token End = "End";
        @{Classification["Keyword"]} token Use = "Use";
        @{Classification["Keyword"]} token With = "With";
        @{Classification["Keyword"]} token Application = "Application";
        @{Classification["Keyword"]} token Model = "Model";
        @{Classification["Keyword"]} token Controller = "Controller";
            
        //use later when we define models in situ
        //syntax Model = "Model " name:Identifier fields:Fields* "End Model" => model[name, fields];
        //syntax Fields = identifer:Identifer "As " fieldType:Text => Field[identifer, fieldType];
        
    }
}
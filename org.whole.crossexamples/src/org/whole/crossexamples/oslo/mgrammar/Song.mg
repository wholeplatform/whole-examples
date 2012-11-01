/*
    The Song language allows a songwriter to compose a song 
    that starts with "Music" and is followed by zero or more "-"
    characters or characters for the range of notes "Ab" to "G#",
    delimited by the "," character.
    
    Additionally, whitespace characters can now be included in
    input and will be ignored during processing unless the
    RestOrNote token rule is being matched.

    Finally, a song is defined as having zero or more bars where each bar
    contains a combination of four rests and notes.
*/
module SongSample
{
    // Make the Common language (and its rules) visible to languages 
    // in other modules that share the SongSample namespace
    export Common;

    language Common
    {
        // Parameterized List rule        
        syntax List(element) 
            = n:element => [n] 
            | n:element l:List(element) => [n, valuesof(l)];
        
        syntax List(element, separator) 
            = n:element => [n] 
            | n:element separator l:List(element, separator) => [n, valuesof(l)];
            
        // Whitespace
        syntax LF = "\u000A";
        syntax CR = "\u000D";
        syntax Space = "\u0020";
        syntax Whitespace = LF | CR | Space;
    }
    
    language NotSoCommon {}
}

module Languages
{
    /*
        Only make the Common language (and its rules) from the MSGrammar 
        module visible to languages in this module scope. Specify an alias
        for the Common language that rules in languages in this module use 
       to reference the rules in the Common language with.
    */
    import SongSample { Common as C };


    language Song
    {         
        // Notes
        token Rest = "-";
        token Note = "A".."G";
        token Sharp = "#";
        token Flat = "b";

        token RestOrNote = Rest | Note (Sharp | Flat)?;
       
        // Keywords
        syntax Music = "Music";
     
        // A song can have zero or more bars, where each bar
        // contains a combination of four rests and notes.
        syntax Bar = RestOrNote RestOrNote RestOrNote RestOrNote;
        syntax Bars = b:C.List(Bar) => Bars[valuesof(b)];
 
        // Initial rule
        syntax Main = m:Music b:Bars => Song[b];
        
        // Ignore whitespace
        interleave Whitespace = C.LF | C.CR | C.Space;
    }
    
    language AnotherLanguageThatNeedsLists
    {
        // Reference List rule in Common language
        syntax ListOfAs = C.List("A");
    }
}
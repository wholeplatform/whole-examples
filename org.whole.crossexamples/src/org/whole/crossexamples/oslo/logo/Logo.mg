/*        
	Logo sample application in Mg. 
	Written by Jason Hogg.

    In the early 1980's a programming language called Turtle Graphics 
    used to be taught as a way of introducing people to programming on 
    the BBC Microcomputer. Its goal was to provide an introduction to 
    programming using a language that provided instant visual gratification.
    
    This Turtle Graphics like language called Logo allows the programmer to 
    specify a direction with which to rotate the turle, and then the ability to 
    move the turtle in that direction by a certain distance.
    
    The following commands are supported:
    - Loops - Sets of instructions which are executde iteratively. Syntax: 
        Loop n { [Command] }*
    - Commands - Commands perform actions such as moving or rotating.
        Rotate n     - Rotate 'n' degrees
        Draw n       - Draw a line 'n' pixels long
        MoveAbs x, y - Move to an absolute position
        Move x,y     - Move to a position relative to last move / draw command
*/
module LogoCommon
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
        syntax Comma = ",";
        syntax Whitespace = LF | CR | Space | Comma;
    }
}

module Languages
{
    import LogoCommon { Common as C };

    // To make the language case insensitive uncomment the line below
    //@{CaseSensitive[false]}
    language Logo
    {         
        // Define our tokens for Logo
        token Rotate = "Rotate";
        token Draw = "Draw";
        token Loop = "Loop";
        token MoveAbs = "MoveAbs";
        token Move = "Move";
        
        token Distance = ('0'..'9')+;
        token LoopCount = ('0'..'9')+;
        token PositiveInteger = ('0'..'9')+;
        token Integer = ('-')? ('0'..'9')+;
        token Comments = "//" ('A'..'Z' | 'a'..'z' | ' ' | '0'..'9' | '(' | ')' |'!' )+ ;
              
        // Keywords

        // A command consists of an instruction and a parameter. A LogoProgram program can contain
        // multiple commands all of which are inside a loop which contains 0..n values.
        syntax Command = (Rotate Integer)  | 
                         (Draw Distance) | 
                         (MoveAbs PositiveInteger PositiveInteger)  |
                         (Move Integer Integer) ;
        syntax Commands = b:C.List(Command) => Commands[valuesof(b)];
        syntax CommandLoop = (Loop LoopCount) "{" Commands "}" |
                             (Loop LoopCount) "{" Commands? CommandLoop Commands?"}"; 
               
        syntax LoopInternals =  Commands |
                                Commands? (CommandLoop Commands?)+;

        syntax Program = LoopInternals;

        // Initial rule
        syntax Main = b:Program => Logo[b];
        
        // Ignore whitespace
        interleave Whitespace = C.LF | C.CR | C.Space | C.Comma | Comments;
    }
}

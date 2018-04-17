grammar grammarFile;

SPACE :   [ \n\t\r]+ -> skip;
NAME : [a-z][a-zA-Z0-9]*;
NUMBER : [0-9]+;
STRING : '"'(.)+?'"';

OPEN_BRACKET : '(';
CLOSE_BRACKET : ')';
OPEN_CURLY_BRACKET : '{';
CLOSE_CURLY_BRACKET : '}';

DOT : '.';
COMMA : ',';
ASSIGNMENT : '=';
SEMICOLON : ';';
COLON : ':';

MAIN : 'main';
VOID : 'void';
RETURN : 'return';

CLEAR : 'clear';
ADD : 'add';
GET : 'get';
REMOVE : 'remove';
IS_EMPTY : 'isEmpty';
CONTAINS : 'contains';

ELEMENT : 'Element';
LIST : 'List';

PRINT : 'print';

FOR : 'for';

IF : 'if';
ELSE : 'else';
AND : '&&';
OR : '||';

EQUAL : '==';
NEGATION : '!';

type : LIST | ELEMENT;
blockOfCode : OPEN_CURLY_BRACKET content* CLOSE_CURLY_BRACKET;
returnBlockOfCode : OPEN_CURLY_BRACKET content* RETURN NAME SEMICOLON CLOSE_CURLY_BRACKET;

program : MAIN blockOfCode (voidFunction | returnFunction)*;
functionSignature : OPEN_BRACKET type NAME (COMMA type NAME)* CLOSE_BRACKET;
voidFunction : VOID NAME (functionSignature | (OPEN_BRACKET CLOSE_BRACKET)) blockOfCode;
returnFunction : type NAME (functionSignature | (OPEN_BRACKET CLOSE_BRACKET)) returnBlockOfCode;

inputFunctionParameters : OPEN_BRACKET NAME (COMMA NAME)* CLOSE_BRACKET;
functionCall : NAME (inputFunctionParameters | (OPEN_BRACKET CLOSE_BRACKET)) SEMICOLON;

callClear : NAME DOT CLEAR OPEN_BRACKET CLOSE_BRACKET SEMICOLON;
callAdd : NAME DOT ADD OPEN_BRACKET (NAME | (NUMBER COMMA NAME)) CLOSE_BRACKET SEMICOLON;
callGet : NAME DOT GET OPEN_BRACKET NUMBER CLOSE_BRACKET SEMICOLON;
callRemove : NAME DOT REMOVE OPEN_BRACKET (NUMBER | NAME) CLOSE_BRACKET SEMICOLON;
callIsEmpty : NAME DOT IS_EMPTY OPEN_BRACKET CLOSE_BRACKET;
callContains : NAME DOT CONTAINS OPEN_BRACKET NAME CLOSE_BRACKET;

elementDeclaration : ELEMENT? NAME ASSIGNMENT (STRING | functionCall | callGet) SEMICOLON;
listDeclaration : LIST? NAME ASSIGNMENT (functionCall | NAME | (OPEN_CURLY_BRACKET CLOSE_CURLY_BRACKET) | (OPEN_CURLY_BRACKET (STRING | NAME) (COMMA (STRING | NAME))* CLOSE_CURLY_BRACKET)) SEMICOLON;

callPrint : OPEN_BRACKET (STRING | NAME) CLOSE_BRACKET SEMICOLON;

forCycle : FOR OPEN_BRACKET ELEMENT NAME COLON NAME CLOSE_BRACKET blockOfCode;

compare : (NAME EQUAL NAME) | (NAME EQUAL STRING) | (callIsEmpty) | (callContains) | (NEGATION OPEN_BRACKET NAME EQUAL NAME CLOSE_BRACKET) | (NEGATION OPEN_BRACKET NAME EQUAL STRING CLOSE_BRACKET) | (NEGATION callIsEmpty) | ( NEGATION callContains);

ifBlock : IF OPEN_BRACKET compare ((AND compare) | (OR compare))* CLOSE_BRACKET blockOfCode elseBlock?;
elseBlock : ELSE blockOfCode;

content : functionCall | callClear | callAdd | callGet | callRemove | elementDeclaration | listDeclaration | callPrint | forCycle | ifBlock;
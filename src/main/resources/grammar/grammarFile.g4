grammar grammarFile;

SPACE : [ \n\t\r]+ -> skip;
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

MAIN : 'main';
VOID : 'void';
RETURN : 'return';

CLEAR : 'clear';
ADD : 'add';
GET : 'get';
REMOVE : 'remove';
IS_EMPTY : 'isEmpty';
SIZE : 'size';
CONTAINS : 'contains';

ELEMENT : 'element';
LIST : 'list';

PRINT : 'print';
IF : 'if';
ELSE : 'else';
FOR : 'for';

PLUS : '+';
MINUS  : '-';
MULTIPLY : '*';
DIVIDE : '/';

AND : '&&';
OR : '||';
NEGATION : '!';
EQUAL : '==';
NON_EQUAL : '!=';
GT : '>';
GE : '>=';
LT : '<';
LE : '<=';

type : LIST | ELEMENT;
blockOfCode : OPEN_CURLY_BRACKET content* CLOSE_CURLY_BRACKET;
returnBlockOfCode : OPEN_CURLY_BRACKET content* RETURN NAME SEMICOLON CLOSE_CURLY_BRACKET;

program : MAIN OPEN_BRACKET CLOSE_BRACKET blockOfCode (voidFunction | returnFunction)*;
functionSignature : OPEN_BRACKET type NAME (COMMA type NAME)* CLOSE_BRACKET;
voidFunction : VOID NAME (functionSignature | (OPEN_BRACKET CLOSE_BRACKET)) blockOfCode;
returnFunction : type NAME (functionSignature | (OPEN_BRACKET CLOSE_BRACKET)) returnBlockOfCode;

callClear : NAME DOT CLEAR OPEN_BRACKET CLOSE_BRACKET SEMICOLON;
callAdd : NAME DOT ADD OPEN_BRACKET (NAME | (NUMBER COMMA NAME)) CLOSE_BRACKET SEMICOLON;
callGet : NAME DOT GET OPEN_BRACKET NUMBER CLOSE_BRACKET SEMICOLON;
callRemove : NAME DOT REMOVE OPEN_BRACKET (NUMBER | NAME) CLOSE_BRACKET SEMICOLON;
callIsEmpty : NAME DOT IS_EMPTY OPEN_BRACKET CLOSE_BRACKET SEMICOLON;
callSize : NAME DOT SIZE OPEN_BRACKET CLOSE_BRACKET SEMICOLON;
callContains : NAME DOT CONTAINS OPEN_BRACKET NAME CLOSE_BRACKET SEMICOLON;
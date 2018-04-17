grammar Grammar;

SPACE : [ \t\n\r]+ -> skip;
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
CONTAINS : 'contains';
PRINT : 'print';

ELEMENT : 'Element';
LIST : 'List';

FOR : 'for';

IF : 'if';
ELSE : 'else';
AND : '&&';
OR : '||';
EQUAL : '==';
NEGATION : '!';

program : MAIN OPEN_BRACKET CLOSE_BRACKET block (voidFunction | returnFunction)*;
block : OPEN_CURLY_BRACKET content* CLOSE_CURLY_BRACKET;
returnBlock : OPEN_CURLY_BRACKET content* RETURN NAME SEMICOLON CLOSE_CURLY_BRACKET;

type : LIST | ELEMENT;
functionSignature : OPEN_BRACKET type NAME (COMMA type NAME)* CLOSE_BRACKET;
voidFunction : VOID NAME (functionSignature | (OPEN_BRACKET CLOSE_BRACKET)) block;
returnFunction : type NAME (functionSignature | (OPEN_BRACKET CLOSE_BRACKET)) returnBlock;

functionParameters : OPEN_BRACKET NAME (COMMA NAME)* CLOSE_BRACKET;
functionCall : NAME (functionParameters | (OPEN_BRACKET CLOSE_BRACKET)) SEMICOLON;

clear : NAME DOT CLEAR OPEN_BRACKET CLOSE_BRACKET SEMICOLON;
add : NAME DOT ADD OPEN_BRACKET (NAME | (NUMBER COMMA NAME)) CLOSE_BRACKET SEMICOLON;
get : NAME DOT GET OPEN_BRACKET NUMBER CLOSE_BRACKET SEMICOLON;
remove : NAME DOT REMOVE OPEN_BRACKET (NUMBER | NAME) CLOSE_BRACKET SEMICOLON;
isEmptys : NAME DOT IS_EMPTY OPEN_BRACKET CLOSE_BRACKET;
contains : NAME DOT CONTAINS OPEN_BRACKET NAME CLOSE_BRACKET;
print : PRINT OPEN_BRACKET (STRING | NAME) CLOSE_BRACKET SEMICOLON;

elementDeclaration : ELEMENT? NAME ASSIGNMENT (STRING | functionCall | get | NAME) SEMICOLON;
listDeclaration : LIST NAME ASSIGNMENT (functionCall | NAME | (OPEN_CURLY_BRACKET CLOSE_CURLY_BRACKET)) SEMICOLON;

forCycle : FOR OPEN_BRACKET NAME CLOSE_BRACKET block;

equalName : NAME EQUAL NAME;
negationEqualName : NEGATION OPEN_BRACKET NAME EQUAL NAME CLOSE_BRACKET;
negationIsEmpty : NEGATION isEmptys;
negationContains : NEGATION contains;

compare : equalName | negationEqualName | negationIsEmpty | negationContains | isEmptys | contains;
andCompare : AND compare;
orCompare : OR compare;

ifBlock : IF OPEN_BRACKET compare (andCompare | orCompare)* CLOSE_BRACKET block elseBlock?;
elseBlock : ELSE block;

content : functionCall | clear | add | get | remove | elementDeclaration | listDeclaration | print | forCycle | ifBlock;
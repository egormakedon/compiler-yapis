grammar grammarFile;

MAIN : 'main';
ELEMENT : 'element';
LIST : 'list';

SPACE : [ \n\t\r]+ -> skip;
NAME : [a-z][a-zA-Z0-9]*;
NUMBER : [0-9]+;
STRING : '"'(.)+?'"';

OPEN_BRACKET : '(';
CLOSE_BRACKET : ')';
OPEN_CURLY_BRACKET : '{';
CLOSE_CURLY_BRACKET : '}';

CLEAR : 'clear';
ADD : 'add';
GET : 'get';
REMOVE : 'remove';
IS_EMPTY : 'isEmpty';
SIZE : 'size';
CONTAINS : 'contains';

PRINT : 'print';
IF : 'if';
ELSE : 'else';
FOR : 'for';
FUNCTION : 'function';
RETURN : 'return';

DOT : '.';
COMMA : ',';
ASSIGNMENT : '=';
SEMICOLON : ';';

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


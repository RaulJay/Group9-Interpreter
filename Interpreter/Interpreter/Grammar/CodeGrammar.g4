﻿grammar CodeGrammar;

// Define the tokens

// Begin Statements
BEGIN: 'BEGIN CODE';
BEGINIF: 'BEGIN IF';

// End Statements
END: 'END CODE';
ENDIF: 'END IF';

// Input Output Statements
DISPLAY: 'DISPLAY';
SCAN: 'SCAN';

// Operators
AND: 'AND';
ASSIGN: '=';
DIV: '/';
PLUS: '+';
MOD: '%';
MULT: '*';
MINUS: '-';
NEQ: '<>';
NOT: 'NOT';
OR: 'OR';
GT: '>';
GTE: '>=';
LT: '<';
LTE: '<=';
EQ: '==';
POWER: '**';
DOUBLEQ: '\"';
SINGLEQ: '\'';
DOLLAR: '$';
AMPERSAND: '&';
HASH: '#';

// Special Characters
COMMA: ',';
RBRACK: ']';
RPAREN: ')';
LBRACK: '[';
LPAREN: '(';
COLON: ':';

// Data Types
BOOL: 'BOOL';
CHAR: 'CHAR';
INT: 'INT';
FLOAT: 'FLOAT';
STRING: 'STRING';

// Conditional Statements
ELSE: 'ELSE';
IF: 'IF';
FALSE: 'FALSE';
TRUE: 'TRUE';

// Token Skips and Whitespaces
WHITESPACE: [\t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;
NEWLINE: '\r'? '\n'| '\r';

// Define the grammar rules parent / root
code: NEWLINE? BEGIN NEWLINE? statement* NEWLINE? END NEWLINE?;

statement
        : declaration_statement
        | assignment_statement
        | display_statement
        | scan_statement
        | if_block
        | COMMENT
        ;

data_type: INT | CHAR | BOOL | FLOAT | STRING;

declaration: IDENTIFIER ((ASSIGN IDENTIFIER)* (ASSIGN expression))? (COMMA IDENTIFIER (ASSIGN expression)?)* ;
declaration_statement: data_type declaration NEWLINE?;

assignment_statement: (IDENTIFIER ASSIGN)+ expression? NEWLINE?;
scan_statement: SCAN COLON IDENTIFIER (COMMA IDENTIFIER)* NEWLINE?;


expression
    : literal                               # literalExpression
    | DOLLAR                                # newlineExpression
    | IDENTIFIER                            # identifierExpression
    | expression AMPERSAND expression       # concatExpression
    | LBRACK symbol RBRACK                  # specialCharExpression
    | unary_operator expression             # unaryExpression
    | RBRACK expression RBRACK              # bracketExpression
    | LPAREN expression RPAREN              # parenthesizeExpression
    | expression exponentOp expression      # exponentExpression    
    | expression multOp expression          # multiplicationExpression
    | expression addOp expression           # additionExpression
    | expression compareOp expression       # comparisonExpression
    | expression boolOp expression          # booleanExpression 
    ;

multOp: MULT | DIV | MOD ;
addOp: PLUS | MINUS;
compareOp: LT | GT | LTE | GTE | EQ | NEQ;
boolOp: AND | OR | NOT;
exponentOp: POWER;


literal: INTEGER
        | FLOATING
        | STRINGS
        | BOOLEAN
        | CHARA
        ;

INTEGER: [-]?[0-9]+;
FLOATING: [0-9]+ '.' [0-9]+;
STRINGS: ('"' ~'"'* '"');
CHARA: ('\'' ~'\''* '\'');
BOOLEAN: TRUE | FALSE;

unary_operator: PLUS | MINUS;

display_statement: DISPLAY':' expression NEWLINE?;

symbol:
	LPAREN
	| RPAREN
	| COMMA
	| COLON
    | AMPERSAND
    | ASSIGN
    | DIV
    | PLUS
    | MOD
    | MULT
    | MINUS
    | GT
    | LT
    | DOUBLEQ
    | SINGLEQ
    | DOLLAR
    | HASH
	;

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

if_statement: IF LPAREN expression RPAREN if_block (ELSE ifelse_block)?;

if_block: BEGINIF statement* ENDIF;

ifelse_block: block | if_block;

block: 'update me later hehe';


// Define the lexer rules
INT_LITERAL: DIGIT+;
CHAR_LITERAL: '\'' (~'\'' | '\\' .)* '\'';
ID: LETTER (LETTER | DIGIT | '_')*;

fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];
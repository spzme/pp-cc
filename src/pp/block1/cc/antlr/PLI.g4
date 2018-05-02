lexer grammar PLI;

QUOTE: '""';
fragment NOTQUOTE: ~('"');

STRING: '"' (NOTQUOTE | QUOTE)* '"';
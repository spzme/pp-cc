lexer grammar ID6;

fragment ALPHABETIC: 'a' .. 'z' | 'A' .. 'Z';
fragment ALPHANUMERIC: ALPHABETIC | '0' .. '9';

ID: ALPHABETIC ALPHANUMERIC ALPHANUMERIC ALPHANUMERIC ALPHANUMERIC ALPHANUMERIC;

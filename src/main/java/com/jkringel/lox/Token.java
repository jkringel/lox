package com.jkringel.lox;

public class Token {
    protected final TokenType type;
    protected final String lexeme;
    protected final Object literal;
    protected final int line;

    public Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}

package com.jkringel.lox;

public class RuntimeError extends RuntimeException {
    protected final Token token;

    public RuntimeError(Token token, String message) {
        super(message);
        this.token = token;
    }
}

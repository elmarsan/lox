package com.craftinginterpreters.lox;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Lox lox = new Lox();
        if (args.length > 1) {
            System.out.println("Usage: jlox [script]");
            System.exit(64);
        } else if (args.length == 1) {
            lox.runFile(args[0]);
        } else {
            lox.runPrompt();
        }
    }
}

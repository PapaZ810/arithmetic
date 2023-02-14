package edu.westminstercollege.cmpt355.arithmetic;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Scanner;

public class ASTMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("> ");

            // Read user input
            String line = in.nextLine();
            if (line.isBlank())
                break;

            var lexer = new ArithmeticASTLexer(CharStreams.fromString(line));
            var parser = new ArithmeticASTParser(new CommonTokenStream(lexer));

            var input = parser.input();
            System.out.printf("\t%s\n", input.n);

            System.out.println();
        }
    }
}

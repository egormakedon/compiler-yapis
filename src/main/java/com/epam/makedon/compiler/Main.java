package com.epam.makedon.compiler;

import com.epam.makedon.compiler.gen.grammar.grammarFileLexer;
import com.epam.makedon.compiler.gen.grammar.grammarFileParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            ANTLRInputStream input = new ANTLRFileStream(args[0]);
            grammarFileLexer lexer = new grammarFileLexer(input);
            grammarFileParser parser = new grammarFileParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            GrammarVisitor visitor = new GrammarVisitor();
            String output = (String) visitor.visit(tree);

            FileWriter fileWriter = new FileWriter("Prograsm.java");
            fileWriter.write(output);
            fileWriter.close();
        } catch (IOException e) {
            LOGGER.error("", e);
        }
    }
}

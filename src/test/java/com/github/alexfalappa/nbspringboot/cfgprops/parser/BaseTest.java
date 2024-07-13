package com.github.alexfalappa.nbspringboot.cfgprops.parser;

import org.junit.Test;
import java.io.IOException;
import java.net.URISyntaxException;

public abstract class BaseTest extends TestBase {
    
    protected void runEmptyLinesTest() throws URISyntaxException, IOException {
        System.out.println("\n-- empty lines");
        parseMatch("\n \n\t\n\f");
    }

    protected void runCommentLinesTest() throws URISyntaxException, IOException {
        System.out.println("\n-- comment lines");
        parseMatch("# pound sign comment\n"
                + "! exclamation mark comment\n"
                + " \t # pound sign with initial whitespace\n"
                + "  \t! exclamation mark with initial whitespace");
    }
    
}


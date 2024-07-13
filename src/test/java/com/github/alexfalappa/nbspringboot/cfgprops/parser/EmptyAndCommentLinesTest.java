package com.github.alexfalappa.nbspringboot.cfgprops.parser;

import org.junit.Test;

public class EmptyAndCommentLinesTest extends BaseTest {

    @Test
    public void testEmptyLines() throws Exception {
        runEmptyLinesTest();
    }

    @Test
    public void testCommentLines() throws Exception {
        runCommentLinesTest();
    }

    @Test
    public void testCommentAndEmptyLines() throws Exception {
        System.out.println("\n-- comment and empty lines");
        parseMatch("# pound sign comment\n\n! exclamation mark comment\n");
    }
}

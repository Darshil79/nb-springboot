package com.github.alexfalappa.nbspringboot.cfgprops.parser;

import org.junit.Test;

public class EscapeCharacterTests extends BaseTest {

    @Test
    public void testEscapedSpaceKey() throws Exception {
        System.out.println("\n-- escaped space in key");
        parseMatch("key\\ with\\ spaces=val");
    }

    @Test
    public void testEscapedBackslashValue() throws Exception {
        System.out.println("\n-- escaped backslash in value");
        parseMatch("key=val\\\\with\\\\slashes");
    }

    @Test
    public void testEscapedCommentKey() throws Exception {
        System.out.println("\n-- escaped comment signs in key");
        parseMatch("key\\#with\\!comment=value");
    }
}


package com.github.alexfalappa.nbspringboot.cfgprops.parser;

import org.junit.Test;

public class SpecialCharacterTests extends BaseTest {

    @Test
    public void testUnicodeKey() throws Exception {
        System.out.println("\n-- unicode in key");
        parseMatch("key\\u00a9=value");
    }

    @Test
    public void testUnusualValue() throws Exception {
        System.out.println("\n-- unusual chars in value");
        parseMatch("key=[({+})]£$%&@-_^\"*/'`|;,.`ç°§*<>");
    }
}


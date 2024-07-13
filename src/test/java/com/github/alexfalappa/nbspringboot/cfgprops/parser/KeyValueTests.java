package com.github.alexfalappa.nbspringboot.cfgprops.parser;

import org.junit.Test;

public class KeyValueTests extends BaseTest {

    @Test
    public void testKeysOnly() throws Exception {
        System.out.println("\n-- keys only");
        parseMatch("key1\nkey2");
    }

    @Test
    public void testSpaceValue() throws Exception {
        System.out.println("\n-- space in value");
        parseMatch("key=val with spaces");
    }

    @Test
    public void testTabKey() throws Exception {
        System.out.println("\n-- tab in key");
        parseMatch("key\\twith\\ttabs=val");
    }

    @Test
    public void testTabValue() throws Exception {
        System.out.println("\n-- tab in value");
        parseMatch("key=val\\twith\\ttabs");
    }

}
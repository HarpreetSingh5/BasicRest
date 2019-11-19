package com.basicrest.BasicRest;

public class SuperWriter implements TextWriter {
    @Override
    public String writeText(String s) {
        return s.toUpperCase();
    }
}

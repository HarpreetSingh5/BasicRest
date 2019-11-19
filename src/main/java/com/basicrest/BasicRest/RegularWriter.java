package com.basicrest.BasicRest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("regularwrite")
public class RegularWriter implements TextWriter {
    @Override
    public String writeText(String s) {
        return s.toUpperCase();
    }
}

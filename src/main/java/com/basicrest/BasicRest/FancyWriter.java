package com.basicrest.BasicRest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Fancywrite")
public class FancyWriter implements TextWriter {
    @Override
    public String writeText(String s) {
        return s + " Fancy Text";
    }
}

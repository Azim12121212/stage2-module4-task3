package com.mjc.stage2.parser;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder() {
    }

    public ChainParserBuilder setParser(AbstractTextParser abstractTextParser) {
        // Write your code here!
        this.parsers.add(abstractTextParser);
        return this;
    }

    public AbstractTextParser build() {
        // Write your code here!
        AbstractTextParser abstractTextParser = this.parsers.get(0);
        for (int i=1; i<this.parsers.size(); i++) {
            if (abstractTextParser!=null) {
                abstractTextParser.setNextParser(this.parsers.get(i));
            }
        }
        return abstractTextParser;
    }
}

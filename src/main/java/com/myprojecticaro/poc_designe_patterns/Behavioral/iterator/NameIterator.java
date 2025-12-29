package com.myprojecticaro.poc_designe_patterns.behavioral.iterator;

import java.util.List;

public class NameIterator implements Iterator<String> {

    private final List<String> names;
    private int index = 0;

    public NameIterator(List<String> names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.size();
    }

    @Override
    public String next() {
        return names.get(index++);
    }
}


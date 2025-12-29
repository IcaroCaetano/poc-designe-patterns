package com.myprojecticaro.poc_designe_patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class NameCollection implements Aggregate<String> {

    private final List<String> names = new ArrayList<>();

    public void add(String name) {
        names.add(name);
    }

    @Override
    public Iterator<String> createIterator() {
        return new NameIterator(names);
    }
}


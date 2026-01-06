package com.myprojecticaro.poc_designe_patterns.behavioral.visitor;

public class FileElement implements Element {

    private final String name;
    private final int size;

    public FileElement(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}


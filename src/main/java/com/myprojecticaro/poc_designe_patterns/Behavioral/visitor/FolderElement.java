package com.myprojecticaro.poc_designe_patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class FolderElement implements Element {

    private final String name;
    private final List<Element> children = new ArrayList<>();

    public FolderElement(String name) {
        this.name = name;
    }

    public void add(Element element) {
        children.add(element);
    }

    public List<Element> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element element : children) {
            element.accept(visitor);
        }
    }
}


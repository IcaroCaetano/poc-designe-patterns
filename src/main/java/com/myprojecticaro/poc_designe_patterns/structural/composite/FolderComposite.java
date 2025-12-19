package com.myprojecticaro.poc_designe_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements Component {

    private final String name;
    private final List<Component> children = new ArrayList<>();

    public FolderComposite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (Component component : children) {
            component.showDetails();
        }
    }
}


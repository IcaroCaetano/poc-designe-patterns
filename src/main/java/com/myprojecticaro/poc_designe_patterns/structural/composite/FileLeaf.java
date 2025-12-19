package com.myprojecticaro.poc_designe_patterns.structural.composite;

public class FileLeaf implements Component {

    private final String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}

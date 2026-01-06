package com.myprojecticaro.poc_designe_patterns.behavioral.visitor;

public class PrintStructureVisitor implements Visitor {

    @Override
    public void visit(FileElement file) {
        System.out.println("File: " + file.getName());
    }

    @Override
    public void visit(FolderElement folder) {
        System.out.println("Folder: " + folder.getName());
    }
}


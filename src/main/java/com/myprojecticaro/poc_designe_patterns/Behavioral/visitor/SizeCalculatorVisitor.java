package com.myprojecticaro.poc_designe_patterns.behavioral.visitor;

public class SizeCalculatorVisitor implements Visitor {

    private int totalSize = 0;

    @Override
    public void visit(FileElement file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(FolderElement folder) {
        // Folder itself has no size
    }

    public int getTotalSize() {
        return totalSize;
    }
}


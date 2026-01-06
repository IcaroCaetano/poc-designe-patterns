package com.myprojecticaro.poc_designe_patterns.behavioral.visitor;

public interface Visitor {
    void visit(FileElement file);
    void visit(FolderElement folder);
}


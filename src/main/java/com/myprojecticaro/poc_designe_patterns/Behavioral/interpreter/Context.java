package com.myprojecticaro.poc_designe_patterns.behavioral.interpreter;

import java.util.Set;

public class Context {

    private final Set<String> permissions;

    public Context(Set<String> permissions) {
        this.permissions = permissions;
    }

    public boolean hasPermission(String permission) {
        return permissions.contains(permission);
    }
}


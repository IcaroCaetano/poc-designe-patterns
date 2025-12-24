package com.myprojecticaro.poc_designe_patterns.behavioral.interpreter;

public class PermissionExpression implements Expression {

    private final String permission;

    public PermissionExpression(String permission) {
        this.permission = permission;
    }

    @Override
    public boolean interpret(Context context) {
        return context.hasPermission(permission);
    }
}


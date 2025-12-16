package com.myprojecticaro.poc_designe_patterns.creational.prototype;

public class UserPrototype implements Prototype<UserPrototype> {

    private String name;
    private String role;

    public UserPrototype(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public UserPrototype clone() {
        return new UserPrototype(this.name, this.role);
    }

    @Override
    public String toString() {
        return "UserPrototype{name='%s', role='%s'}"
                .formatted(name, role);
    }
}


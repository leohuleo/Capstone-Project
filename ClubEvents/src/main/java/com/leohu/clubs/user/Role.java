package com.leohu.clubs.user;

public enum Role {
    USER("ROLE_USER"),
    ADMIN("ROLE_ADMIN");

    private String name;
    Role(String name){
        this.name = name;
    }
}

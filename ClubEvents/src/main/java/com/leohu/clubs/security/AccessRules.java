package com.leohu.clubs.security;

public class AccessRules {

    protected static final String[] FOR_EVERYONE = {
            "/error",
            "/users/**"
    };

    protected static final String[] FOR_AUTHORIZED_USERS = {
            "/myprofile",
            "/clubs/**"
    };

    protected static final String[] FOR_ADMINS = {
            "/admin/**"
    };
}

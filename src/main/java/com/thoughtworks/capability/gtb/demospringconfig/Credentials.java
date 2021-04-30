package com.thoughtworks.capability.gtb.demospringconfig;

public class Credentials {
    private String username;
    private String password;
    private String authMethod;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
    }

    @Override
    public String toString() {
        return "Credential{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authMethod='" + authMethod + '\'' +
                '}';
    }
}

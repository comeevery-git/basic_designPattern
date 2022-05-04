package com.company.design.factory;

public enum Animal {
    CAT("cat"),
    DOG("dog");

    private final String value;

    Animal(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
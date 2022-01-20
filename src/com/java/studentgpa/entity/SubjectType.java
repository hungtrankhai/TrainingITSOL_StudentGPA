package com.java.studentgpa.entity;

public enum SubjectType {
    DAICUONG("1"), COSONGANH("2"), CHUYENNGANH("3");

    private final String type;

    SubjectType(String type) {
        this.type = type;
    }

    public String getValue() {
        return type;
    }
}



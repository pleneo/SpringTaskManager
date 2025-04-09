package com.pleneo.taskmanagerspring.entities.enums;

public enum Seniority {
    INTERN(1),
    JUNIOR(2),
    SENIOR(3);

    private int code;

    private Seniority(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Seniority valueOf(int code){
        for(Seniority s : Seniority.values()){
            if(s.getCode() == code){
                return s;
            }
        }
        throw new IllegalArgumentException("Invalid Seniority code.");
    }

}

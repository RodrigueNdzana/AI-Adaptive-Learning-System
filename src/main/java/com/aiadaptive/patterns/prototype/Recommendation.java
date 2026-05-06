package com.aiadaptive.patterns.prototype;
//Matches:
//
//Fast duplication of AI recommendations
public class Recommendation implements Cloneable {
    private String message;

    public Recommendation(String message) {
        this.message = message;
    }

    public Recommendation clone() {
        return new Recommendation(this.message);
    }
}
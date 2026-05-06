package com.aiadaptive.patterns.simplefactory;

public class ContentFactory {

    public static Content createContent(String type) {

        switch (type.toUpperCase()) {
            case "VIDEO":
                return new VideoContent();

            case "AUDIO":
                return new AudioContent();

            case "TEXT":
                return new TextContent();

            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }
}
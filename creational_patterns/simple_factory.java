package simple_factory;

import model.Content;

public class ContentFactory {
    public static Content createContent(String type) {
        switch(type) {
            case "VIDEO": return new Content("Video Lesson", "VIDEO");
            case "AUDIO": return new Content("Audio Lesson", "AUDIO");
            default: return new Content("Text Lesson", "TEXT");
        }
    }
}
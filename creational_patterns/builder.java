package builder;

public class LearningContent {
    private String title;
    private boolean audio;
    private boolean video;

    private LearningContent(Builder builder) {
        this.title = builder.title;
        this.audio = builder.audio;
        this.video = builder.video;
    }

    public static class Builder {
        private String title;
        private boolean audio;
        private boolean video;

        public Builder(String title) {
            this.title = title;
        }

        public Builder addAudio() {
            this.audio = true;
            return this;
        }

        public Builder addVideo() {
            this.video = true;
            return this;
        }

        public LearningContent build() {
            return new LearningContent(this);
        }
    }
}
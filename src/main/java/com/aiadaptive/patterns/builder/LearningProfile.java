package com.aiadaptive.patterns.builder;
//Matches:
//
//US-002: Learning Profile
public class LearningProfile {
    private String disabilityType;
    private String preference;
    private String difficultyLevel;

    private LearningProfile(ProfileBuilder builder) {
        this.disabilityType = builder.disabilityType;
        this.preference = builder.preference;
        this.difficultyLevel = builder.difficultyLevel;
    }

    public static class ProfileBuilder {
        private String disabilityType;
        private String preference;
        private String difficultyLevel;

        public ProfileBuilder setDisability(String disability) {
            this.disabilityType = disability;
            return this;
        }

        public ProfileBuilder setPreference(String preference) {
            this.preference = preference;
            return this;
        }

        public ProfileBuilder setDifficulty(String level) {
            this.difficultyLevel = level;
            return this;
        }

        public LearningProfile build() {
            return new LearningProfile(this);
        }
    }
}
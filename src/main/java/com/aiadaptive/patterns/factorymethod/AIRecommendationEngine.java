package com.aiadaptive.patterns.factorymethod;

import com.aiadaptive.patterns.prototype.Recommendation;

public class AIRecommendationEngine extends RecommendationEngine {
    public Recommendation generate() {
        return new Recommendation("AI-based recommendation");
    }
}

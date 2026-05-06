package com.aiadaptive.patterns.factorymethod;

import com.aiadaptive.patterns.prototype.Recommendation;

public class RuleBasedRecommendationEngine extends RecommendationEngine {
    public Recommendation generate() {
        return new Recommendation("Rule-based recommendation");
    }
}

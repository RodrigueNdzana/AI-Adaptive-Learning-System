package com.aiadaptive.patterns.factorymethod;

import com.aiadaptive.patterns.prototype.Recommendation;

//US-003: AI Recommendations
public abstract class RecommendationEngine {
    public abstract Recommendation generate();
}


package com.aiadaptive.services;

import com.aiadaptive.domain.Recommendation;
import com.aiadaptive.repositories.RecommendationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class responsible for managing AI-driven learning recommendations
     * in the AI Adaptive Learning System.
     *
     * <p>This service provides business logic for creating and retrieving
     * {@link Recommendation} objects, which link students to content items
     * based on a computed match score.</p>
     *
     * @author Rodrigue Ndzana
     * @version 1.0
     * @since 1.0
     */
@Service
    public class RecommendationService {

    private final RecommendationRepository repo;

    /**
     * Constructs a new {@code RecommendationService} with the given recommendation repository.
             *
             * @param repo the repository used for recommendation persistence operations
             */
    public RecommendationService(RecommendationRepository repo) {
                this.repo = repo;
    }

    /**
     * Creates and persists a new learning recommendation.
         *
         * <p>A recommendation associates a student (identified by {@code userId})
     * with a content item (identified by {@code contentId}) along with a
         * {@code matchScore} between 0 and 100 indicating how well the content
         * suits the student's learning profile.</p>
         *
         * @param rec the {@link Recommendation} object to be created; must not be {@code null}
     * @return the saved {@link Recommendation} object with any generated fields populated
         */
    public Recommendation createRecommendation(Recommendation rec) {
                return repo.save(rec);
    }

    /**
     * Retrieves all learning recommendations from the repository.
             *
             * @return a {@link List} of all {@link Recommendation} objects;
             *         returns an empty list if no recommendations exist
             */
    public List<Recommendation> getAllRecommendations() {
                return repo.findAll();
    }
    }

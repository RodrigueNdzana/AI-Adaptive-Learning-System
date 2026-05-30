package com.aiadaptive.services;

import org.springframework.stereotype.Service;

import com.aiadaptive.domain.Content;
import com.aiadaptive.repositories.ContentRepository;

import java.util.List;

/**
 * Service class responsible for managing learning content in the AI Adaptive Learning System.
     *
     * <p>This service provides business logic for CRUD operations on {@link Content} objects,
     * including creation, retrieval, update, and deletion of learning materials such as
     * videos, audio files, and text-based resources.</p>
     *
     * @author Rodrigue Ndzana
     * @version 1.0
     * @since 1.0
     */
@Service
    public class ContentService {

    private final ContentRepository contentRepo;

    /**
     * Constructs a new {@code ContentService} with the given content repository.
             *
             * @param contentRepo the repository used for content persistence operations
             */
    public ContentService(ContentRepository contentRepo) {
                this.contentRepo = contentRepo;
    }

    /**
     * Creates and persists a new piece of learning content.
         *
         * @param content the {@link Content} object to be created; must not be {@code null}
     * @return the saved {@link Content} object with any generated fields populated
         */
    public Content createContent(Content content) {
                return contentRepo.save(content);
    }

    /**
     * Retrieves all available learning content from the repository.
             *
             * @return a {@link List} of all {@link Content} objects; returns an empty list if none exist
             */
    public List<Content> getAllContent() {
                return contentRepo.findAll();
    }

    /**
     * Updates an existing piece of learning content identified by its ID.
             *
             * <p>Only the title, format, and difficulty fields are updated. The content ID
             * remains immutable.</p>
             *
             * @param id      the unique identifier of the content to update
             * @param updated a {@link Content} object containing the new field values
             * @return the updated and persisted {@link Content} object
             * @throws RuntimeException if no content with the given {@code id} is found
             */
    public Content updateContent(String id, Content updated) {
                Content existing = contentRepo.findById(id)
                                    .orElseThrow(() -> new RuntimeException("Content not found with id: " + id));

                existing.setTitle(updated.getTitle());
                existing.setFormat(updated.getFormat());
                existing.setDifficulty(updated.getDifficulty());

                return contentRepo.save(existing);
    }

    /**
     * Deletes the learning content identified by the given ID.
             *
             * @param id the unique identifier of the content to delete
             * @throws RuntimeException if no content with the given {@code id} exists
             */
    public void deleteContent(String id) {
                contentRepo.delete(id);
    }
    }

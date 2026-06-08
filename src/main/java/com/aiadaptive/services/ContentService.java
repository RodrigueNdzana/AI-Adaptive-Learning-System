package com.aiadaptive.services;

import org.springframework.stereotype.Service;

import com.aiadaptive.domain.Content;
import com.aiadaptive.repositories.ContentRepository;

import java.util.List;

@Service
public class ContentService {

    private final ContentRepository contentRepo;

    public ContentService(ContentRepository contentRepo) {
        this.contentRepo = contentRepo;
    }

    public Content createContent(Content content) {
        return contentRepo.save(content);
    }

    public List<Content> getAllContent() {
        return contentRepo.findAll();
    }

    public Content updateContent(String id, Content updated) {
        Content existing = contentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Content with ID '" + id + "' was not found."));

        existing.setTitle(updated.getTitle());
        existing.setFormat(updated.getFormat());
        existing.setDifficulty(updated.getDifficulty());

        return contentRepo.save(existing);
    }

    public void deleteContent(String id) {
        contentRepo.delete(id);
    }
}
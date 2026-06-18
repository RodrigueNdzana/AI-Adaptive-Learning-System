package tests;

import com.aiadaptive.domain.Content;
import com.aiadaptive.repositories.ContentRepository;
import com.aiadaptive.services.ContentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Unit tests for {@link ContentService}.
 *
 * <p>Covers creation, retrieval, update, and deletion of content
   * using a mocked {@link ContentRepository}.</p>
   */
@ExtendWith(MockitoExtension.class)
  class ContentServiceTest {

    @Mock
        private ContentRepository contentRepo;

    @InjectMocks
        private ContentService contentService;

    private Content sampleContent;

    @BeforeEach
        void setUp() {
                  sampleContent = new Content("c1", "Intro to Java", "video", "beginner");
        }

    // -----------------------------------------------------------------------
    // createContent
    // -----------------------------------------------------------------------

    @Test
        void createContent_shouldSaveAndReturnContent() {
                  when(contentRepo.save(sampleContent)).thenReturn(sampleContent);

            Content result = contentService.createContent(sampleContent);

            assertNotNull(result);
                  assertEquals("Intro to Java", result.getTitle());
                  verify(contentRepo, times(1)).save(sampleContent);
        }

    // -----------------------------------------------------------------------
    // getAllContent
    // -----------------------------------------------------------------------

    @Test
        void getAllContent_shouldReturnAllContent() {
                  Content anotherContent = new Content("c2", "Advanced Spring Boot", "text", "advanced");
                  when(contentRepo.findAll()).thenReturn(Arrays.asList(sampleContent, anotherContent));

            List<Content> result = contentService.getAllContent();

            assertNotNull(result);
                  assertEquals(2, result.size());
                  verify(contentRepo, times(1)).findAll();
        }

    @Test
        void getAllContent_shouldReturnEmptyListWhenNoContent() {
                  when(contentRepo.findAll()).thenReturn(List.of());

            List<Content> result = contentService.getAllContent();

            assertNotNull(result);
                  assertTrue(result.isEmpty());
        }

    // -----------------------------------------------------------------------
    // updateContent
    // -----------------------------------------------------------------------

    @Test
        void updateContent_shouldUpdateAndReturnContent() {
                  Content updatedData = new Content("c1", "Intro to Java (Updated)", "audio", "intermediate");
                  when(contentRepo.findById("c1")).thenReturn(Optional.of(sampleContent));
                  when(contentRepo.save(sampleContent)).thenReturn(sampleContent);

            Content result = contentService.updateContent("c1", updatedData);

            assertNotNull(result);
                  assertEquals("Intro to Java (Updated)", result.getTitle());
                  assertEquals("audio", result.getFormat());
                  assertEquals("intermediate", result.getDifficulty());
                  verify(contentRepo, times(1)).findById("c1");
                  verify(contentRepo, times(1)).save(sampleContent);
        }

    @Test
        void updateContent_shouldThrowExceptionWhenContentNotFound() {
                  when(contentRepo.findById("nonexistent")).thenReturn(Optional.empty());

            Content updateData = new Content("nonexistent", "New Title", "text", "beginner");

            RuntimeException ex = assertThrows(RuntimeException.class,
                                                               () -> contentService.updateContent("nonexistent", updateData));

            assertTrue(ex.getMessage().contains("nonexistent"));
        }

    // -----------------------------------------------------------------------
    // deleteContent
    // -----------------------------------------------------------------------

    @Test
        void deleteContent_shouldCallRepositoryDelete() {
                  doNothing().when(contentRepo).delete("c1");

            contentService.deleteContent("c1");

            verify(contentRepo, times(1)).delete("c1");
        }
  }

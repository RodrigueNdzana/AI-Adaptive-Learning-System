package tests;

import com.aiadaptive.domain.Recommendation;
import com.aiadaptive.repositories.RecommendationRepository;
import com.aiadaptive.services.RecommendationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Unit tests for {@link RecommendationService}.
 *
 * <p>Covers creation and retrieval of AI recommendations
   * using a mocked {@link RecommendationRepository}.</p>
   */
@ExtendWith(MockitoExtension.class)
  class RecommendationServiceTest {

    @Mock
        private RecommendationRepository repo;

    @InjectMocks
        private RecommendationService recommendationService;

    private Recommendation sampleRec;

    @BeforeEach
        void setUp() {
                  sampleRec = new Recommendation("r1", "u1", "c1", 85);
        }

    @Test
        void createRecommendation_shouldSaveAndReturnRecommendation() {
                  when(repo.save(sampleRec)).thenReturn(sampleRec);

            Recommendation result = recommendationService.createRecommendation(sampleRec);

            assertNotNull(result);
                  assertEquals("r1", result.getId());
                  assertEquals("u1", result.getUserId());
                  assertEquals("c1", result.getContentId());
                  assertEquals(85, result.getMatchScore());
                  verify(repo, times(1)).save(sampleRec);
        }

    @Test
        void getAllRecommendations_shouldReturnAllRecommendations() {
                  Recommendation rec2 = new Recommendation("r2", "u2", "c2", 72);
                  when(repo.findAll()).thenReturn(Arrays.asList(sampleRec, rec2));

            List<Recommendation> result = recommendationService.getAllRecommendations();

            assertNotNull(result);
                  assertEquals(2, result.size());
                  verify(repo, times(1)).findAll();
        }

    @Test
        void getAllRecommendations_shouldReturnEmptyListWhenNoneExist() {
                  when(repo.findAll()).thenReturn(List.of());

            List<Recommendation> result = recommendationService.getAllRecommendations();

            assertNotNull(result);
                  assertTrue(result.isEmpty());
        }

    @Test
        void createRecommendation_withHighMatchScore_shouldPersistCorrectly() {
                  Recommendation highMatch = new Recommendation("r3", "u3", "c3", 100);
                  when(repo.save(highMatch)).thenReturn(highMatch);

            Recommendation result = recommendationService.createRecommendation(highMatch);

            assertEquals(100, result.getMatchScore());
        }
  }

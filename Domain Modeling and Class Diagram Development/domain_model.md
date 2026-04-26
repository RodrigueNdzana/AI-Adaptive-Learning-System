# Domain Model – AI Adaptive Learning System

This domain model identifies the core entities, their attributes, methods, relationships, and business rules for the system.

---

## Key Domain Entities

| Entity | Attributes | Methods | Relationships |
|--------|-----------|---------|--------------|
| User | userId, name, email, password, role | login(), logout(), updateProfile() | Has one LearningProfile, interacts with Content |
| Student | studentId, disabilityStatus | viewDashboard(), receiveRecommendations() | Inherits from User |
| Educator | educatorId, department | uploadContent(), monitorStudents() | Inherits from User |
| LearningProfile | profileId, preferences, goals | updatePreferences(), applySettings() | Belongs to Student |
| Content | contentId, title, type, format, accessibilityStatus | display(), validateAccessibility() | Uploaded by Educator |
| Recommendation | recommendationId, matchScore | generate(), update() | Linked to Student & Content |
| Progress | progressId, completionRate, score | updateProgress(), calculatePerformance() | Linked to Student |

---

## Relationships

- A **User** can be either a **Student** or an **Educator** (Inheritance)
- A **Student** has exactly **one LearningProfile**
- A **Student** can have multiple **Recommendations**
- A **Student** accesses multiple **Content items**
- An **Educator** uploads multiple **Content items**
- A **Student** has one **Progress record per module**

---

## Business Rules

1. A student must be registered before accessing any content.
2. A student must have a learning profile before receiving recommendations.
3. The system must generate at least 3 recommendations per session.
4. Content must pass accessibility validation before publishing.
5. A student is flagged as at-risk if performance drops by more than 15%.
6. Only educators can upload content.
7. Accessibility settings must be applied globally across all modules.
8. AI recommendations must adapt based on user feedback.
9. Content must support at least one accessible format.
10. Dashboard updates must occur in real-time.
11. Alerts must be triggered within 48 hours of risk detection.

---

## Conclution to the section

The domain model captures the core structure of the system, focusing on personalization, accessibility, and AI-driven learning. It ensures alignment with system requirements and supports scalable and maintainable design.
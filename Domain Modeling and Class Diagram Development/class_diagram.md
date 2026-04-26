# Class Diagram - AI Adaptive Learning System

```mermaid
classDiagram

class User {
    -userId: String
    -name: String
    -email: String
    -password: String
    +login()
    +logout()
    +updateProfile()
}

class Student {
    -studentId: String
    -disabilityStatus: String
    +viewDashboard()
    +receiveRecommendations()
}

class Educator {
    -educatorId: String
    -department: String
    +uploadContent()
    +monitorStudents()
}

class LearningProfile {
    -profileId: String
    -preferences: Map
    -goals: String
    +updatePreferences()
    +applySettings()
}

class Content {
    -contentId: String
    -title: String
    -type: String
    -format: ContentFormat
    -accessibilityStatus: Boolean
    +display()
    +validateAccessibility()
}

class Recommendation {
    -recommendationId: String
    -matchScore: Float
    +generate()
    +update()
}

class Progress {
    -progressId: String
    -completionRate: Float
    -score: Float
    +updateProgress()
    +calculatePerformance()
}

class AIEngine {
    +analyzeBehavior()
    +generateRecommendations()
}

class ContentFormat {
    <<enumeration>>
    TEXT
    AUDIO
    VIDEO
}
User <|-- Student
User <|-- Educator


%% Inheritance
User <|-- Student
User <|-- Educator

%% Composition (STRONG relationship)
Student "1" *-- "1" LearningProfile : owns

%% Aggregation (WEAK relationship)
Student "1" o-- "0..*" Progress : tracks

%% Associations
Student "1" -- "0..*" Recommendation : receives
Student "1" -- "0..*" Content : accesses
Educator "1" -- "0..*" Content : uploads

Recommendation "1" --> "1" Content : refersTo

%% AI Engine connection
Recommendation --> AIEngine : generatedBy

```
## Design Explanation

The class diagram models the structure of the AI Adaptive Learning System using object-oriented principles.

**Inheritance** is used to distinguish between Student and Educator roles from the base User class.
**Associations** represent interactions between entities, such as students accessing content and receiving recommendations.
Multiplicity ensures realistic constraints (e.g., one student can have many recommendations).
The LearningProfile is tightly linked to the student to support personalization.
The Recommendation class connects AI logic with learning content.

### Composition vs Aggregation
- **LearningProfile is composition** --> cannot exist without Student  
- **Progress is aggregation** --> can exist independently as historical data  

### AI Engine Abstraction
The AIEngine class separates machine learning logic from core system logic.  
This ensures:
- Scalability
- Maintainability
- Independent model updates

### Enumeration Usage
ContentFormat enum ensures:
- Type safety
- Controlled content types
- Cleaner validation

### Design Principle Applied
- Single Responsibility Principle (SRP)
- Open/Closed Principle (OCP)
- Separation of Concerns

This design ensures scalability, maintainability, and alignment with system requirements.

### visual representation
 ![Class Diagram](/diagram/assigment9/classDiagram.png)
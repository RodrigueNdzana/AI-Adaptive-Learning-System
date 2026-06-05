# AI Adaptive Learning System

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.x-orange)
![License](https://img.shields.io/badge/License-MIT-green)

A modern **AI-powered adaptive learning platform** designed to provide personalized learning experiences, especially for students with disabilities.

## Project Overview

The AI Adaptive Learning System uses artificial intelligence to analyze student learning patterns and dynamically adapt educational content to match individual needs, pace, and learning style. It assists teachers in monitoring progress and identifying learning difficulties early.

This project was developed as part of **The IT Code Academy** curriculum, applying clean architecture, design patterns, and collaborative development practices.

## Features

- Personalized learning path recommendations
- Student performance tracking and analytics
- Adaptive content delivery based on AI insights
- Teacher dashboard for monitoring and intervention
- Accessible learning materials
- Progress reports and feedback system
- Progress tracking dashboard
- Teacher feedback system

## Project Documentation

### Stakeholder and System Requirements Documentation for the System 
- [System Specification](specification.md)
- [System Architecture](architecture.md)
- [Stakeholder Analysis Table](/Stakeholder%20and%20System%20Requirements%20Documentation%20for%20the%20System/stakeholderAnalysisTable.md)
- [System Requirements Document](/Stakeholder%20and%20System%20Requirements%20Documentation%20for%20the%20System/systemRequirementsDocument.md)
- [Reflection](/Stakeholder%20and%20System%20Requirements%20Documentation%20for%20the%20System/reflection.md)

### Use Case Modeling and Test Case Development for the System

- [Use Case Diagram](/Use%20Case%20Modeling%20and%20Test%20Case%20Development%20for%20the%20System/useCase.md)
- [Use Case Specification](/Use%20Case%20Modeling%20and%20Test%20Case%20Development%20for%20the%20System/useCaseSpecification.md)
- [Test case](/Use%20Case%20Modeling%20and%20Test%20Case%20Development%20for%20the%20System/testCases.md)
- [Reflection part 2](/Use%20Case%20Modeling%20and%20Test%20Case%20Development%20for%20the%20System/reflectionPart2.md)

### Agile User Stories, Backlog, and Sprint Planning for the System Objective
- [User Story Creation](/Agile%20User%20Stories,Backlog%20and%20spring%20planning%20for%20the%20system/userStories.md)
- [Product Backlog creation](/Agile%20User%20Stories,Backlog%20and%20spring%20planning%20for%20the%20system/productBacklog.md)

### Kanban Board Customization
- [Template Analysis](/GitHub%20Project%20Templates%20and%20Kanban%20Board%20Implementation/template_analysis.md)
- [Kanban explanation](/GitHub%20Project%20Templates%20and%20Kanban%20Board%20Implementation/kanban_explanation.md)


#### Custom Columns Added

To better reflect the development workflow, the following columns were added:

- **Testing**  
  Ensures all features are validated before completion.

- **Blocked**  
  Identifies tasks that are delayed due to dependencies or issues.

---

#### Labels Used

- `feature` – New functionality
- `bug` – Issues or defects
- `enhancement` – Improvements

---

#### Task Management

- User stories from Assignment 6 were converted into **GitHub Issues**
- Issues are linked directly to the Kanban board
- Tasks are assigned using **@mentions** myself (Rodrigue Ndzana)

---

#### Why These Customizations?

These changes improve:

- Workflow visibility  
- Quality assurance tracking  
- Issue identification  
- Team accountability  

This results in a more structured and efficient Agile process.

### Object State Modeling and Activity Workflow Modeling
- [State Modeling with State Transition Diagrams](/Object%20State%20Modeling%20and%20Activity%20Workflow%20Modeling%20Objective/stateModels.md)
- [Activity Workflow Modeling with Activity Diagrams](/Object%20State%20Modeling%20and%20Activity%20Workflow%20Modeling%20Objective/activityModels.md)
- [Reflection ](/Object%20State%20Modeling%20and%20Activity%20Workflow%20Modeling%20Objective/reflection.md)

#### Traceability

- FR-01 -> User Account State + Login Workflow
- FR-02 -> Profile State + Profile Workflow
- FR-03 -> Recommendation State + AI Workflow
- FR-04 -> Content State + Content Access Workflow
- FR-05 -> Dashboard State + Progress Workflow
- FR-07 -> Alert State + Alert Workflow
- FR-10 -> Content Upload State + Upload Workflow

### Domain Modeling and Class Diagram Development
- [Domain Model](/Domain%20Modeling%20and%20Class%20Diagram%20Development/domain_model.md)
- [Class Diagram](/Domain%20Modeling%20and%20Class%20Diagram%20Development/class_diagram.md)
- [Reflection](/Domain%20Modeling%20and%20Class%20Diagram%20Development/reflection)

## From Class Diagrams to Code
with All Creational Patterns

### Creational Patterns Used

| Pattern | Purpose |
|--------|--------|
| Simple Factory | Centralized content creation |
| Factory Method | Notification creation |
| Abstract Factory | Cross-platform UI |
| Builder | Complex content construction |
| Prototype | Efficient cloning |
| Singleton | Database connection |

### Design Decisions
- Builder used for flexible content creation
- Singleton ensures one DB connection
- Prototype reduces object creation cost

### CHANGELOG
- Implemented core classes (User, Student, Content)
- Added all creational patterns
- Added unit tests for all patterns
- Fixed Singleton thread safety
- Linked issues to commits

![Demo ](/screenshot/assignment10.png)

## Implementing a Persistence Repository Layer

### Repository Layer Design

The repository layer abstracts data storage using a generic interface:

- Repository<T, ID> provides CRUD operations
- InMemoryStudentRepository uses HashMap for fast testing
- RepositoryFactory enables switching between storage types
- Future database implementation is supported via stub classes

This design ensures:
- Separation of concerns
- Scalability
- Testability
 
## Service Layer and REST API Implementation
- Added UserService, ContentService, RecommendationService
- Implemented REST API endpoints
- Integrated Swagger documentation
- Added unit and integration tests
  ![Demo ](/screenshot/Swagger1.png)**
- ![Demo ](/screenshot/Swagger2ContentController.png)**
- ![Demo ](/screenshot/swagger2ContentControllerDelete.png)**
- ![Demo ](/screenshot/swagger3ContentControllerPut.png)**
- ![Demo ](/screenshot/swaggerRecommendation.png)**
- ![Demo ](/screenshot/SwaggerStudent.png)**
- ![Demo ](/screenshot/Swagger1.png)**


# CI/CD Pipeline

This project uses GitHub Actions for Continuous Integration and Continuous Deployment (CI/CD).

## Pipeline Features

- Automatically builds the project on every push
- Runs all unit and integration tests
- Blocks pull request merges if tests fail
- Generates a JAR artifact when merged into `main`


### Branch Protection Setup
![Demo ](/screenshot/assigment%2013/branch1.png)
![Demo ](/screenshot/assigment%2013/branch2.png)
![Demo ](/screenshot/assigment%2013/branch3.png)
![Demo ](/screenshot/assigment%2013/branch4.png)
![Demo ](/screenshot/assigment%2013/branch5.png)
![Demo ](/screenshot/assigment%2013/branch6.png)
![Demo ](/screenshot/assigment%2013/branch5.png)
![Demo ](/screenshot/assigment%2013/branch6.png)
![Demo ](/screenshot/assigment%2013/branch7.png)
![Demo ](/screenshot/assigment%2013/branch8.png)
![Demo ](/screenshot/assigment%2013/branch9.png)
![Demo ](/screenshot/assigment%2013/branch10.png)
![Demo ](/screenshot/assigment%2013/branch11.png)
![Demo ](/screenshot/assigment%2013/branch12.png)

### Test results in GitHub Actions
![Demo ](/screenshot/assigment%2013/action1.png)
![Demo ](/screenshot/assigment%2013/testcase.png)

| Phase | Artifact      | Purpose                                       |
|------|---------------|-----------------------------------------------|
| Specification | Assignment 3  | system specification and architecture design |
| Requirements | Assignment 4  | Defines system functionality                  |
| Analysis | Assignment 5  | Models user interactions                      |
| Agile Planning | Assignment 6  | Breaks system into tasks                      |
| Workflow | Assignment 7  | Tracks development progress                   |
| Behavior Modeling | Assignment 8  | Defines system workflows                      |
| Structure Modeling | Assignment 9  | Defines system architecture                   |
| Design Decisions | Assignment 10 | Implementation of design pattern              | 
| Repository Layer Design | Assignment 11 | creation of CRUD                             |



>>>>>>> 9a83d041b0f49a00012477881710f076fb5857fc

## Tech Stack

- **Language**: Java 17
- **Framework**: Spring Boot
- **Build Tool**: Maven
- **Testing**: JUnit 5 + Mockito
- **CI/CD**: GitHub Actions
- **Database**: H2 (In-memory) / Configurable

## Quick Start

### Prerequisites
- Java JDK 17 or higher
- Maven 3.8+

### Setup and Run

```bash
# Clone the repository
git clone https://github.com/your-username/AI-Adaptive-Learning-System.git
cd AI-Adaptive-Learning-System

<<<<<<< HEAD
# Build the project
=======
---

### Installation

Clone the repository:
```bash
git clone https://github.com/RodrigueNdzana/AI-Adaptive-Learning-System.git
cd https://github.com/RodrigueNdzana/AI-Adaptive-Learning-System.git
```

---

### Build the Project

Compile and package the application:
```bash
>>>>>>> 9a83d041b0f49a00012477881710f076fb5857fc
mvn clean install

# Run tests
mvn test

# Run the application
mvn spring-boot:run

The application will be available at http://localhost:8080

# Project Documentation

- System Specification
- Architecture
- Stakeholder & System Requirements
- Use Cases & Test Cases
- Agile Planning
- Domain & Class Diagrams

# Contributing

Please read CONTRIBUTING.md for details on our code of conduct, coding standards, branch naming conventions, and the pull request process.

We welcome contributions! Look for issues labeled good-first-issue or help-wanted.

# License

This project is for educational purposes as part of THE IT CODE ACADEMY program.



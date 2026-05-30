# AI-Adaptive-Learning-System
# AI Adaptive Learning System

## Project Description
The AI Adaptive Learning System is a web-based platform designed to support students with disabilities by providing personalized learning experiences. The system uses Artificial Intelligence to analyze student learning behaviour and adapt learning materials according to individual needs.

The platform will allow students to access accessible learning resources while helping educators monitor progress and identify learning difficulties early.
This project is built using **Java (Maven-based build system)** and follows standard software engineering practices including modular design, testing, and CI/CD integration.

## Project Objectives
- Provide adaptive learning support for students with disabilities
- Improve accessibility to digital learning platforms
- Personalize learning content using Artificial Intelligence
- Enable educators to monitor student learning progress

## System Features (Planned)
- Student learning profiles
- AI-based learning recommendations
- Accessible learning materials
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
| Specification | Assignment 3  | system specitfication and architecture design |
| Requirements | Assignment 4  | Defines system functionality                  |
| Analysis | Assignment 5  | Models user interactions                      |
| Agile Planning | Assignment 6  | Breaks system into tasks                      |
| Workflow | Assignment 7  | Tracks development progress                   |
| Behavior Modeling | Assignment 8  | Defines system workflows                      |
| Structure Modeling | Assignment 9  | Defines system architecture                   |
| Design Decisions | Assignment 10 | Implementation of design pattern              | 
| Repository Layer Design | Assignment 11 | creation of CRUID                             |




## Tech Stack

- Language: Java (JDK 17+ recommended)
- Build Tool: Maven
- Testing: JUnit 5
- Logging: SLF4J (with Logback or Log4j binding)
- Version Control: Git & GitHub
- CI/CD: GitHub Actions

---

## Getting Started

Follow these steps to set up and run the project locally.

### Prerequisites

Ensure the following are installed:
- Java JDK 17 or higher
- Maven 3.8+
- Git

Verify installations:
```bash
java -version
mvn -version
git --version
```

---

### Installation

Clone the repository:
```bash
git clone https://github.com/your-username/your-repo.git
cd your-repo
```

---

### Build the Project

Compile and package the application:
```bash
mvn clean install
```

---

### Run the Application

If this is a standard Java application:
```bash
mvn exec:java
```

If this is a Spring Boot application:
```bash
mvn spring-boot:run
```

---

## Testing

Run unit tests using:
```bash
mvn test
```

---

## Features for Contribution

The following areas are open for contributors:

| Feature Area        | Description | Contribution Type |
|---------------------|-------------|------------------|
| Authentication      | Improve login/signup logic and security | Feature Request |
| API Layer           | Extend REST endpoints and integrations | Feature Request |
| Logging System      | Fix SLF4J conflicts and improve logging consistency | Bug Fix |
| Testing             | Increase JUnit test coverage | Good First Issue |
| Documentation       | Improve README and code comments | Good First Issue |
| CI/CD Pipeline      | Enhance GitHub Actions workflow | Feature / DevOps |

---

## CI/CD (GitHub Actions)

This project supports automated build and test pipelines using GitHub Actions.

Workflow includes:
- Build with Maven
- Run unit tests
- Package artifact (JAR)

---

## Contribution Guidelines

1. Fork the repository
2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit changes with clear messages
4. Push to your fork
5. Open a Pull Request

---

## License

This project is licensed under the MIT License (or specify your license here).



## Author
Rodrigue Ndzana Ngonga Beaubane-- 219384096

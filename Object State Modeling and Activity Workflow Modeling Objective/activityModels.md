# ACTIVITY DIAGRAMS
## User Registration Workflow
![User Registration State](/diagram/assigment%208%20diagram/ActivityDiagram/userRegistrationWorkflow.png)

### Explanation
- Maps to FR-01
- This workflow models the process of user registration. The User enters their details, which the System validates before creating an account. Invalid input results in a loop back to data entry, ensuring correctness and completeness.

- This workflow supports FR-01 (User Registration and Authentication) by providing a structured and secure onboarding process. It addresses stakeholder concerns related to usability and data integrity, ensuring that only valid user information is stored.

## Login Workflow
![Login workflow](/diagram/assigment%208%20diagram/ActivityDiagram/LoginWorkFlow.png)

### Explanation
- This diagram represents the login process, incorporating both authentication and security controls. The System verifies credentials and tracks failed attempts, locking the account after five unsuccessful tries.

- This aligns with FR-01, particularly the requirement for account lockout mechanisms. It addresses IT administrator concerns by preventing unauthorized access while maintaining a smooth experience for valid users.

## Profile Setup Workflow
![Profile Setup workflow](/diagram/assigment%208%20diagram/ActivityDiagram/ProfileSetupWorkflow.png)

### Explanation

- This workflow captures how students configure their learning profiles. Preferences such as accessibility settings and learning goals are saved and applied across the system.

- This supports FR-02 (Student Learning Profile Management) by ensuring personalization and persistence. It is especially important for students with disabilities, as it guarantees consistent application of accessibility configurations.

## AI Recommendation Workflow
![AI Recommendation Workflow](/diagram/assigment%208%20diagram/ActivityDiagram/AIRecommendation.png)

### Explanation

- This workflow models the AI-driven recommendation process. The System tracks student activity, analyzes performance data, and generates personalized learning suggestions, which are then presented to the student.

- This aligns with FR-03 (AI-Based Learning Content Recommendations) and supports adaptive learning. It benefits students through personalized content and supports AI engineers by demonstrating how user data drives recommendation improvements.

## Content Access Workflow
![Content Access Workflow](/diagram/assigment%208%20diagram/ActivityDiagram/contentAccessWorkflow.png)

### Explanation

- This diagram illustrates how students access learning materials in multiple formats. The student selects content and chooses a preferred format, which the system loads and displays.

- This supports FR-04 (Accessible Content Delivery) by enabling multimodal content access. It addresses the needs of students with disabilities by providing flexible learning options and improving accessibility.

## Progress Traking Workflow
![Progress Traking Workflow](/diagram/assigment%208%20diagram/ActivityDiagram/ProgressTrakingWorkflow.png)

### Explanation

- This workflow models how student progress is tracked. When a student completes an activity, the system updates the database and refreshes the dashboard to reflect new progress data.

- This aligns with FR-05 (Progress Tracking Dashboard) and ensures real-time feedback. It benefits both students and educators by providing accurate and up-to-date performance information.

## Alert Detection Workflow
![Alert Detection Workflow](/diagram/assigment%208%20diagram/ActivityDiagram/alertDetectionWorkflow.png)

### Explanation

- This diagram represents the system’s ability to detect at-risk students. The system monitors performance and generates alerts when performance drops below a defined threshold, notifying the educator.

- This supports FR-07 (Automated Early Difficulty Detection and Alerts). It enables proactive intervention, addressing educator concerns and improving student success outcomes.

## Content Upload Workflow
![Content Upload Workflow](/diagram/assigment%208%20diagram/ActivityDiagram/contentUploadWorkflow.png)

### Explanation

- This workflow models how educators upload learning materials. The system validates content using an accessibility checker before allowing publication.

- This aligns with FR-10 (Content Upload and Management) and ensures compliance with accessibility standards. It supports institutional goals and ensures inclusive learning environments for all students.
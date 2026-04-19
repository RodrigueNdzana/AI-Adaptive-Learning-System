# Object State Modeling with State Transition Diagrams
## User Account State
![User Account State](/diagram/assigment%208%20diagram/useAccountState.png)

### Explanation 
- Maps to FR-01 (Authentication)
- This state diagram models the lifecycle of a user account from initial registration to authenticated usage and potential security restrictions. The object transitions from an Unregistered state to Registered upon successful sign-up, and then to Authenticated when valid login credentials are provided. A critical transition occurs when multiple failed login attempts trigger a move to the Locked state, enforcing account security. The account can later return to an authenticated state through administrative intervention.

- This diagram directly supports FR-01 (User Registration and Authentication), particularly the requirement for account lockout after five failed attempts. The inclusion of a guarded transition (failed attempts ≥ 5) ensures compliance with security standards.

- From a stakeholder perspective, this model addresses IT administrators’ concerns regarding unauthorized access while maintaining usability for legitimate users. It clearly demonstrates how security policies are enforced through system states.

## Learning Profile State
![Learning Profile State](/diagram/assigment%208%20diagram/learningProfileState.png)

### Explanation 
- Maps to FR-02 (Profile Management)
-This diagram represents the lifecycle of a student’s learning profile, emphasizing personalization and persistence. The profile begins in a NotCreated state and transitions to Created when the student inputs their preferences. Subsequent updates move the profile into an Updated state, and once saved, the system applies these preferences globally, transitioning to the Applied state.

- This aligns with FR-02 (Student Learning Profile Management), ensuring that accessibility settings and preferences are consistently enforced across sessions and devices. The transition from Updated to Applied reflects the system’s responsibility to propagate user preferences throughout the platform.

- This model is particularly relevant for students with disabilities, as it guarantees that accessibility configurations are not only stored but actively influence system behavior, thereby enhancing inclusivity.

## Recommendation Engine State
![AI Recommendation](/diagram/assigment%208%20diagram/AIRecommendations.png)

### Explanation 
- Maps to FR-03 (AI Recommendations)
- This state diagram models the behavior of the AI recommendation engine. The system begins in an Idle state and transitions to Processing when student activity is detected. After analyzing user data, the system moves to the Generated state, where recommendations are produced. User feedback (e.g., ratings) triggers a transition to the Updated state, allowing the system to refine future recommendations.

- This directly supports FR-03 (AI-Based Learning Content Recommendations) by implementing a continuous improvement loop. The feedback-driven transition ensures that the recommendation system adapts to user needs over time.

- From a stakeholder perspective, this model benefits students through improved content relevance and supports AI/ML engineers by illustrating how user interaction contributes to model refinement and performance optimization.
## Content Delivery State
![Content Delivery](/diagram/assigment%208%20diagram/CondentDeliveryState.png)

### Explanation 
- Maps to FR-04 (Accessible Content)
- This diagram captures the states involved in delivering accessible learning content. Initially, content is in a NotAccessed state. When a user requests content, it transitions to Loading, followed by Displayed once successfully rendered. The Switched state represents dynamic format changes (e.g., switching from video to text), reflecting the system’s flexibility.

- This aligns with FR-04 (Accessible Content Delivery), which requires support for multiple formats and quick switching between them. The transitions emphasize responsiveness and adaptability, ensuring that users can access content in their preferred format without delay.

- This model is critical for addressing the needs of students with disabilities, as it demonstrates how the system supports multimodal interaction and real-time format adaptation.

## Dashboard State
![Learning Profile State](/diagram/assigment%208%20diagram/dashbordState.png)

### Explanation 
- Maps to FR-05 (Student Dashboard)
- This state diagram represents the lifecycle of the student dashboard. The dashboard begins in a NotLoaded state and transitions to Loading upon user login. Once data is retrieved, it moves to the Displayed state. Any new user activity triggers a transition to Updated, ensuring that the dashboard reflects real-time progress.

- This supports FR-05 (Progress Tracking Dashboard) by ensuring that student performance data is continuously updated and readily available. The transition to the Updated state highlights the system’s responsiveness to user actions.

- From a stakeholder perspective, this model benefits both students, who gain immediate insights into their progress, and educators, who rely on accurate and up-to-date performance data.
## Alert System State
![Alert System State`](/diagram/assigment%208%20diagram/alertSystem.png)

### Explanation 
- Maps to FR-07 (Early Detection)
- This diagram models the lifecycle of alerts generated for at-risk students. The system begins in a Monitoring state, continuously evaluating student performance. When a performance drop exceeds a defined threshold (e.g., 15%), the system transitions to AlertTriggered. The alert is then acknowledged by the educator, moving to the Acknowledged state, and finally resolved after appropriate intervention.

- This aligns with FR-07 (Automated Early Difficulty Detection and Alerts), ensuring timely identification and management of at-risk students. The inclusion of threshold-based transitions demonstrates the use of guard conditions in decision-making.

- This model addresses the needs of educators and administrators by enabling proactive intervention, ultimately improving student retention and success rates.
## Content Upload State
![Content Upload State](/diagram/assigment%208%20diagram/contentUpload.png)

### Explanation 
- Maps to FR-10 (Content Management)
- This state diagram represents the lifecycle of uploaded learning content. Once content is uploaded, it enters the Uploaded state and transitions to Validating, where an automated accessibility check is performed. Based on the outcome, the content either moves to Approved (if it meets accessibility standards) or Rejected (if it fails validation). Approved content is then published.

- This directly supports FR-10 (Content Upload and Management), particularly the requirement for automated WCAG compliance checks. The validation process ensures that only accessible content is made available to students.

- From a stakeholder perspective, this model supports educators by guiding content preparation and ensures compliance for institutional administrators, while ultimately benefiting students with disabilities through accessible learning materials.
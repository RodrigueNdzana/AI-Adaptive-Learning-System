# System Requirements Document (SRD)
## Introduction
### Purpose
This System Requirements Document (SRD) defines the functional and non-functional requirements for the AdaptIQ AI Adaptive Learning System. The document is intended for use by developers, testers, project managers, and stakeholders to guide system design, development, and evaluation.
### Project Scope
AIAdaptiveSystem is a web-based adaptive learning platform designed to personalise learning content for university students, with a specific focus on inclusive education for students with disabilities. The system uses artificial intelligence to analyse student behaviour and recommend appropriate learning materials, while providing educators with tools to monitor progress and intervene early when students are struggling.

## 1. Functional Requirements (FR)
Functional requirements describe what the system shall do. Each requirement is assigned a unique identifier and linked to the stakeholder(s) whose concern it addresses.

### FR-01: User Registration and Authentication
Statement: The system shall allow students, educators, and administrators to register and log in using university Single Sign-On (SSO) credentials or local accounts.
Stakeholder(s): Student with Disability, Academic Educator, University IT Administrator
#### Acceptance Criteria:

- SSO login completes within 3 seconds for 95% of attempts.
- Users without SSO credentials can register with an email address and password.
- Failed login attempts are logged and the account is locked after 5 consecutive failures.
- Multi-factor authentication (MFA) is available and can be enforced by administrators.


### FR-02: Student Learning Profile Management
Statement: The system shall allow students to create and manage a personal learning profile that captures their disability status, accessibility accommodations, preferred content formats, and learning goals.
Stakeholder(s): Student with Disability, Disability Support Officer
#### Acceptance Criteria:

- Profile creation is completable in fewer than 10 minutes.
- Accommodation settings (e.g., screen reader mode, high contrast, extended time) are automatically applied to all content and assessments upon profile save.
- Profile data persists across sessions and devices.



### FR-03: AI-Based Learning Content Recommendations
Statement: The system shall use an AI recommendation engine to suggest personalised learning materials to students based on their performance history, learning profile, and engagement patterns.
Stakeholder(s): Student with Disability, Student without Disability, AI/ML Engineer
#### Acceptance Criteria:

- At least 3 recommendations are generated per student per active session.
Each recommendation displays a match score (percentage) based on profile relevance.
- Recommendations are refreshed within 24 hours of a student completing a module or assessment.
Students can rate recommendations (thumbs up/down) to improve future suggestions.
- Recommendation engine achieves a relevance score ≥ 85% based on student feedback surveys.


### FR-04: Accessible Content Delivery
Statement: The system shall deliver learning materials in multiple accessible formats, including plain text, simplified text, audio narration, captioned video, and high-contrast visual layouts.
Stakeholder(s): Student with Disability, Content Developer, Disability Support Officer
Acceptance Criteria:

- All video content includes accurate closed captions (≥ 99% accuracy).
- All images include descriptive alt text.
- Audio narration is available for all text-based modules.
- Simplified text mode reduces reading level to Grade 8 or below.
- Format switching (e.g., from video to transcript) occurs in ≤ 2 seconds.


### FR-05: Progress Tracking Dashboard (Student View)
Statement: The system shall provide students with a personalised dashboard displaying their module completion status, assessment scores, skill development metrics, and AI-generated learning insights.
Stakeholder(s): Student with Disability, Student without Disability
#### Acceptance Criteria:

- Dashboard loads within 2 seconds of login.
- Progress data is updated in real time upon module or assessment completion.
- Students can view a historical timeline of their progress over any selected date range.
- The dashboard is navigable using keyboard-only input and is compatible with screen readers.


### FR-06: Educator Progress Monitoring Dashboard
Statement: The system shall provide educators with a dashboard displaying aggregated and individual student progress, engagement metrics, at-risk flags, and feedback tools.
Stakeholder(s): Academic Educator, Disability Support Officer
#### Acceptance Criteria:

- Educators can filter students by course, disability status, progress level, and risk flag.
- At-risk students (below 50% progress in the expected timeframe) are automatically highlighted.
- Educators can view a detailed breakdown of any individual student's activity log.
- Dashboard data refreshes at least once every 60 minutes.


### FR-07: Automated Early Difficulty Detection and Alerts
Statement: The system shall automatically detect signs of learning difficulty — such as declining quiz scores, low engagement, or incomplete modules — and generate alerts to the responsible educator within 48 hours.
Stakeholder(s): Academic Educator, University Senior Administrator
Acceptance Criteria:

- Alerts are triggered when a student's performance drops more than 15% below their personal baseline.
- Alerts are delivered via in-platform notification and email.
Educators can acknowledge, dismiss, or escalate an alert with a single action.
- Alert generation accuracy (true positive rate) is ≥ 90% based on historical validation.


### FR-08: Teacher Feedback System
Statement: The system shall allow educators to submit written, audio, or annotated feedback on student work directly within the platform, which students receive in their preferred accessible format.
Stakeholder(s): Academic Educator, Student with Disability
#### Acceptance Criteria:

- Feedback supports text, audio recording (up to 5 minutes), and file attachments.
- Students receive a notification within 1 minute of feedback being submitted.
- Feedback is rendered in the student's chosen accessibility format (e.g., text-to-speech for audio-preference students).
- Students can acknowledge and respond to feedback within the platform.


### FR-09: Accessibility Settings Configuration
Statement: The system shall provide a dedicated accessibility settings panel allowing students to configure display preferences including font size, contrast mode, colour filters, motion reduction, and assistive technology compatibility.
Stakeholder(s): Student with Disability, Disability Support Officer
#### Acceptance Criteria:

- All accessibility settings are applied globally across the platform within 1 second of saving.
- Settings persist across browser sessions and devices.
- At least 5 contrast themes are available (including a WCAG AA-compliant high contrast option).
- A "reset to default" option is available and clearly labelled.


### FR-10: Content Upload and Management (Educator)
Statement: The system shall allow educators and content developers to upload, organise, and publish learning materials, with automated accessibility validation prior to publishing.
Stakeholder(s): Academic Educator, Content Developer
#### Acceptance Criteria:

- The system accepts file uploads in PDF, DOCX, MP4, MP3, and HTML formats.
- An automated accessibility checker runs on upload and returns a report within 30 seconds.
- Content that fails WCAG 2.1 AA checks is blocked from publishing until issues are resolved or overridden by an administrator.
- Educators can tag content with topics, disability relevance, and difficulty levels.


### FR-11: Administrative Reporting and Compliance Dashboard
Statement: The system shall provide university administrators with platform-wide reports on student engagement, accessibility compliance, at-risk population statistics, and system usage.
Stakeholder(s): University Senior Administrator, Disability Support Officer
#### Acceptance Criteria:

- Reports are exportable in CSV and PDF formats.
- Reports covering any date range can be generated within 10 seconds.


### FR-12: AI Model Monitoring and Retraining Interface
Statement: The system shall provide AI/ML engineers with an interface to monitor model performance, review prediction accuracy, and trigger model retraining pipelines.
Stakeholder(s): AI/ML Engineer, University IT Administrator
#### Acceptance Criteria:

- Model performance metrics (accuracy, bias indicators, recommendation relevance) are visible on a live dashboard.
- Engineers can initiate a retraining job with a single action; the pipeline completes in ≤ 4 hours.
- Bias audit reports flag any demographic group where recommendation accuracy deviates by more than 5%.
- All model versions are logged with timestamps and changelogs for traceability.



## 2. Non-Functional Requirements (NFR)
Non-functional requirements define the quality attributes the system must exhibit. They constrain how the system performs its functions.

### 2.1 Usability
#### NFR-U1: Accessibility Compliance
- The system shall comply with Web Content Accessibility Guidelines (WCAG)
- The user interface shall be simple and easy to navigate.
Metric: 0 critical accessibility violations on automated WCAG audits (using Axe or equivalent tool).
Stakeholder: Student with Disability, Disability Support Officer.

#### NFR-U2: Onboarding Ease
- New users shall be able to complete registration, set up their profile, and access their first learning module without external assistance.

Metric: Task completion rate ≥ 90% in usability testing with first-time users within 15 minutes.
Stakeholder: Student with Disability, Student without Disability.

#### NFR-U3: Interface Consistency
- The user interface shall follow a consistent design language across all platform sections, including colour, typography, navigation patterns, and interactive component behaviour.

Metric: System Usability Scale (SUS) score ≥ 75 in post-launch user testing.
Stakeholder: All student and educator stakeholders.


### 2.2 Deployability
#### NFR-D1: Cross-Platform Deployment
- The system shall be deployable on a online platform like netlify.com

Metric: Full deployment completed in ≤ 5 working days from a clean environment with provided documentation.
Stakeholder: University IT Administrator.

#### NFR-D2: Cloud and On-Premise Support
- The system shall support deployment on major cloud providers (AWS, Azure, Google Cloud) as well as on-premise university server infrastructure.

Metric: Deployment scripts tested and verified on at least two environments prior to release.
Stakeholder: University IT Administrator, University Senior Administrator.


#### 3.3 Maintainability
- NFR-M1: API Documentation
All backend APIs shall be fully documented using the OpenAPI 3.0 specification, accessible via an interactive Swagger UI.

Metric: 100% of public API endpoints documented; documentation updated within 5 days of any breaking change.
Stakeholder: University IT Administrator, AI/ML Engineer.

#### NFR-M3: Test Coverage
- The codebase shall maintain a minimum automated test coverage of 80% across all services, covering unit, integration, and end-to-end test scenarios.

Metric: Coverage report generated on every pull request; builds blocked if coverage falls below 80%.
Stakeholder: University IT Administrator.


### 2.4 Scalability
#### NFR-S1: Concurrent User Support
- The system shall support a minimum of 1,000 concurrent users during peak academic periods (e.g., exam season) without degradation in response time.

Metric: Response time for dashboard load remains ≤ 2 seconds under 1,000 concurrent users (validated by load testing with JMeter or equivalent).
Stakeholder: University IT Administrator, University Senior Administrator.

#### NFR-S2: Horizontal Scaling
The system architecture shall support horizontal scaling (adding additional server instances) to accommodate institutional growth, up to 10,000 registered users without architectural changes.

Metric: System scaled to 10,000 users with < 10% increase in per-request latency compared to baseline.
Stakeholder: University IT Administrator, University Senior Administrator.


### 2.5 Security
#### NFR-SEC1: Data Encryption
- All personal student data stored in the database shall be encrypted at rest using AES-256 encryption. 

Metric: Security penetration test passes with zero critical vulnerabilities related to data exposure.
Stakeholder: University IT Administrator, University Senior Administrator.

#### NFR-SEC2: Role-Based Access Control
- The system shall implement role-based access control (RBAC) with distinct roles for students, educators, DSOs, and administrators, ensuring users can only access data and functions appropriate to their role.

Metric: Unauthorised access attempts blocked in 100% of cases in security audit testing.
Stakeholder: University IT Administrator, Disability Support Officer.

#### NFR-SEC3: Regulatory Compliance
- The system shall comply with applicable data protection legislation, including GDPR (EU), POPIA (South Africa), and the Protection of Personal Information Act where applicable.

Metric: Annual compliance audit completed with zero high-severity findings.
Stakeholder: University Senior Administrator, Disability Support Officer.


### 2.6 Performance
#### NFR-P1: Page Load Time
- All primary user-facing pages (dashboard, course page, recommendation list) shall load within 2 seconds under normal operating conditions.

Metric: 95th percentile page load time ≤ 2 seconds, measured under 500 concurrent users.
Stakeholder: Student with Disability, Student without Disability.

#### NFR-P2: AI Recommendation Generation Time
The AI recommendation engine shall return a set of personalised recommendations within 3 seconds of a student session starting or a module being completed.

Metric: 95th percentile recommendation response time ≤ 3 seconds under normal load.
Stakeholder: Student with Disability, AI/ML Engineer.

#### NFR-P3: System Availability
- The platform shall maintain a minimum uptime of 99.5% during active academic semesters (excluding scheduled maintenance windows communicated at least 72 hours in advance).

Metric: Monthly uptime report generated automatically; downtime SLA breaches trigger immediate incident notification.
Stakeholder: University IT Administrator, University Senior Administrator.
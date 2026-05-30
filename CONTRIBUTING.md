# Contributing to AI Adaptive Learning System

Thank you for your interest in contributing to the AI Adaptive Learning System.

This project was developed as part of a Software Engineering course and follows Agile development principles, object-oriented design, REST API architecture, and CI/CD practices.

---

## Project Overview

The AI Adaptive Learning System helps students learn more effectively through:

- Adaptive learning recommendations
- Accessible educational content
- Learning profiles
- Progress tracking dashboards
- RESTful API services

---

## Prerequisites

Before contributing, ensure you have:

- Java 17
- Maven 3.9+
- Git
- IntelliJ IDEA (recommended)

---

## Clone the Repository

```bash
git clone https://github.com/RodrigueNdzana/AI-Adaptive-Learning-System.git
```

---

## Running the Application

```bash
mvn spring-boot:run
```

The application will start on:

http://localhost:8080

Swagger UI:

http://localhost:8080/swagger-ui/index.html

---

## Running Tests

```bash
mvn test
```

All tests must pass before submitting a Pull Request.

---

## How to Contribute

### Step 1: Fork the Repository

Create your own fork of the project.

### Step 2: Create a Branch

```bash
git checkout -b feature/your-feature-name
```

### Step 3: Implement Changes

Write clean, maintainable code and include tests where applicable.

### Step 4: Commit Changes

```bash
git commit -m "Close #15: Implement recommendation improvements"
```

### Step 5: Push Changes

```bash
git push origin feature/your-feature-name
```

### Step 6: Create a Pull Request

Submit a Pull Request with:

- Description of changes
- Linked issue number
- Screenshots (if applicable)

---

## Coding Standards

Please follow these standards:

- Use meaningful class and method names.
- Follow Java naming conventions.
- Write unit tests for new functionality.
- Keep methods focused on one responsibility.
- Follow object-oriented design principles.

---

## Issue Labels

### good-first-issue

Suitable for beginners.

### feature-request

New functionality suggestions.

### bug

Defects requiring fixes.

### enhancement

Improvements to existing features.

---

## Pull Request Requirements

Before submitting a PR:

- All tests must pass.
- CI pipeline must succeed.
- Code must compile without errors.
- Documentation must be updated if necessary.

---

## Branch Protection

The main branch is protected.

Requirements:

- Pull Request review required
- Status checks required
- Direct pushes disabled

---
## Contribution Workflow
- Fork the repository
- Create a feature branch
- Pick an issue labeled:
- - good-first-issue
- - feature-request
- Write clean code and tests
- Commit using meaningful commit messages
- Submit a Pull Request
## Thank You

Thank you for helping improve the AI Adaptive Learning System.
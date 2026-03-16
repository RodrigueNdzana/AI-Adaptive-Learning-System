# System Architecture

## Project Title
AI Adaptive Learning System

## Domain
Education Technology

## Problem Statement
Students with disabilities often face challenges accessing digital learning platforms. The system aims to provide an AI-driven adaptive learning platform that personalizes learning materials and improves accessibility.

## Individual Scope
This project will implement a prototype system demonstrating AI-based adaptive learning for students with disabilities.

---

# C4 Model Architecture

## 1. System Context Diagram

```mermaid
flowchart TD
    Student --> AdaptiveLearningSystem
    Teacher --> AdaptiveLearningSystem
    AdaptiveLearningSystem --> Database
    AdaptiveLearningSystem --> AIEngine

Description: Students interact with the adaptive learning system to access personalized learning materials. Teachers use the system to monitor student progress. The system stores information in a database and uses an AI engine to personalize learning.

# C4 Model Models
## Container Diagram
![container](/diagram/containertDiagram.png)
##Containers:

Web Application – user interface for students and teachers
Backend API – handles application logic
Database – stores student data and learning progress
AI Engine – generates personalized learning recommendations

##Component Diagram
![component](/diagram/componentDiagram.png)

##Components:

User Interface – allows users to interact with the system
Authentication Service – manages user login
Learning Recommendation Service – suggests learning materials
Progress Tracking Service – monitors student progress
Machine Learning Model – analyzes student performance

# 5. End-to-End System Components 

What the System would do:

### User Layer
- Student
- Teacher

### Application Layer
- Web Application
- Backend API

### Data Layer
- Database

### Intelligence Layer
- AI Engine
- Machine Learning Model

---
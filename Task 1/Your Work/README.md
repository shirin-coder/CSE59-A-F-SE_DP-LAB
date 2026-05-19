# 
# Software Requirements Specification (SRS)

# AI Resume Screening System

---

# Preface

This document provides the Software Requirements Specification (SRS) for the **AI Resume Screening System**. It defines the system functionalities, performance criteria, security requirements, and architecture necessary for development and deployment.

---

# Version History

| Version | Description                                 |
| ------- | ------------------------------------------- |
| 1.0     | Initial Draft                               |


---

# 1. Introduction

## Purpose

The **AI Resume Screening System** is a web-based application designed to automate the recruitment process by analyzing resumes using Artificial Intelligence (AI) and Natural Language Processing (NLP). The system helps recruiters efficiently shortlist candidates based on job requirements, skills, experience, and qualifications.

The system improves hiring speed, reduces manual workload, and increases recruitment accuracy.

---

## Document Conventions

This document follows the IEEE SRS standard using:

* **Must** – Mandatory requirement
* **Should** – Recommended feature
* **May** – Optional enhancement

---

## Intended Audience and Reading Suggestions

| Audience              | Purpose                         |
| --------------------- | ------------------------------- |
| Developers            | System implementation guidance  |
| Recruiters & HR Teams | Understanding system features   |
| Stakeholders          | Business and technical overview |
| QA/Testers            | Requirement validation          |
| System Architects     | Infrastructure planning         |

---

## Scope

The system provides:

* Resume upload and parsing
* AI-based candidate screening
* Skill extraction and matching
* Candidate ranking system
* Job posting management
* Recruiter dashboard
* Reporting and analytics
* Notifications and alerts

---

## References

* IEEE Standard 830-1998
* NLP and Machine Learning Documentation
* Internal Recruitment Requirement Specifications

---

# 2. Overall Description

## Product Perspective

The AI Resume Screening System is a standalone web application that may integrate with external services such as:

* LinkedIn
* Email services
* Job portals
* Cloud storage services

---

## Product Functions

### Resume Management

* Upload resumes
* Parse PDF/DOC/DOCX files
* Store candidate information

### AI Screening

* Extract skills and qualifications
* Match resumes with job descriptions
* Rank candidates automatically

### Recruitment Management

* Create and manage job postings
* Track application status
* Schedule interviews

### Reporting & Analytics

* Generate hiring reports
* Analyze recruitment trends

### Notifications

* Send application updates
* Notify recruiters of top candidates

---

## User Classes and Characteristics

| User Type | Characteristics                      |
| --------- | ------------------------------------ |
| Admin     | Manages system settings and users    |
| Recruiter | Posts jobs and reviews candidates    |
| Candidate | Uploads resumes and applies for jobs |

---

## Operating Environment

* Web-based application
* Supported Browsers:

  * Chrome
  * Firefox
  * Microsoft Edge
* Backend Framework:

  * Node.js / Django / Spring Boot
* Database:

  * MongoDB / PostgreSQL
* Cloud Hosting Supported

---

## Design and Implementation Constraints

* Compliance with GDPR and privacy laws
* Secure handling of candidate information
* AI model accuracy requirements
* Scalability for enterprise recruitment

---

## Assumptions and Dependencies

* Internet connection is required
* Resume files are uploaded in supported formats
* Third-party APIs may be available

---

# 3. System Requirements Specification

# Functional Requirements

---

## 3.1 User Authentication

### Requirements

The system must allow users to:

* Register accounts
* Log in securely
* Reset passwords

The system must implement:

* Role-based authentication
* Multi-factor authentication (optional)

---

## 3.2 Resume Upload and Parsing

### Requirements

Candidates must be able to:

* Upload resumes in:

  * PDF
  * DOC
  * DOCX formats

The system must:

* Extract candidate information automatically
* Parse:

  * Name
  * Skills
  * Education
  * Experience
  * Certifications

---

## 3.3 Job Management

### Requirements

Recruiters must be able to:

* Create job postings
* Edit job descriptions
* Delete job posts
* Define required skills and qualifications

Each job posting must include:

* Job title
* Description
* Required skills
* Experience level
* Application deadline

---

## 3.4 AI Candidate Screening

### Requirements

The system must:

* Match resumes with job descriptions
* Rank candidates based on compatibility
* Generate candidate scores

The AI engine should analyze:

* Skills
* Experience
* Education
* Keywords
* Certifications

---

## 3.5 Candidate Management

### Requirements

Recruiters must be able to:

* View candidate profiles
* Shortlist applicants
* Reject candidates
* Add recruiter notes

Candidates must be able to:

* Track application status

---

## 3.6 Reporting and Analytics

### Requirements

The system must generate reports for:

* Candidate performance
* Recruitment statistics
* Hiring trends
* Screening accuracy

Reports should be exportable in:

* PDF
* CSV

---

## 3.7 Notifications

### Requirements

The system must send notifications for:

* Application submission
* Interview scheduling
* Status updates
* Recruiter alerts

Notifications may be sent through:

* Email
* SMS
* In-app alerts

---

# Non-Functional Requirements

---

## 3.8 Performance Requirements

* The system must support 1000+ concurrent users.
* Resume parsing should complete within 5 seconds.
* AI screening results should appear within 10 seconds.

---

## 3.9 Security Requirements

* All passwords must be encrypted.
* Candidate data must be securely stored.
* HTTPS must be enforced.
* The system must prevent:

  * SQL injection
  * XSS attacks
  * Unauthorized access

---

## 3.10 Usability Requirements

* The UI should be responsive and user-friendly.
* Navigation should be intuitive.
* Accessibility standards should be supported.

---

## 3.11 Reliability and Availability

* The system must maintain 99.9% uptime.
* Backup and recovery mechanisms must exist.
* AI processing failures should be logged.

---

## 3.12 Maintainability

* The system should support modular AI updates.
* Logging and debugging tools must be available.
* APIs should follow standard documentation practices.

---

## 3.13 Portability

The system should support:

* Windows
* Linux
* macOS
* Cloud deployment

---

# 4. System Models

---

# CONTEXT DIAGRAM

<img src="images/Screenshot 2026-05-19 110337.png">

### External Entities

* Candidates
* Recruiters
* Admin
* AI Processing Engine
* Database
* Notification Services

### Main Processes

* Resume Upload
* AI Screening
* Candidate Ranking
* Job Management
* Reporting

---

# ACTIVITY DIAGRAM

### Main Activities

1. Candidate uploads resume
2. System parses resume
3. AI analyzes candidate profile
4. Recruiter posts job
5. System matches candidate with job
6. Recruiter reviews rankings
7. Interview process begins

---

# USE CASE DIAGRAMS

---

## Candidate Use Cases

* Register/Login
* Upload Resume
* Apply for Jobs
* Track Application Status

---

## Recruiter Use Cases

* Create Job Posts
* View Candidates
* Shortlist Applicants
* Generate Reports

---

## Admin Use Cases

* Manage Users
* Configure AI Settings
* Monitor System Performance

---

# SEQUENCE DIAGRAM

## Example Flow: Resume Screening

1. Candidate uploads resume
2. System stores resume
3. AI parser extracts information
4. Matching engine compares with job descriptions
5. Candidate score is generated
6. Recruiter reviews ranked candidates

---

# ENTITY-RELATIONSHIP DIAGRAM (ERD)

## Main Entities

* User
* Candidate
* Recruiter
* Resume
* JobPosting
* Application
* ScreeningResult
* Notification

---

## Relationships

* One candidate can apply for many jobs
* One recruiter can create many job posts
* One resume belongs to one candidate
* One application has one screening result

---

# STATE DIAGRAM

## Application Status States

* Submitted
* Under Review
* Shortlisted
* Interview Scheduled
* Selected
* Rejected

---

# 5. System Evolution

## Assumptions

* AI models will improve over time
* Enterprise-level scaling may be required
* Integration with ATS systems may be added

---

## Expected Changes

Future versions may include:

* AI interview chatbot
* Video interview analysis
* Advanced NLP-based personality analysis
* LinkedIn profile integration
* AI-powered hiring recommendations

---

# 6. Appendices

---

# Hardware Requirements

* Cloud-based scalable servers
* GPU support for AI processing (optional)
* Minimum 16GB RAM server recommended

---

# Database Requirements

The database must support:

* Structured and unstructured data
* AI processing logs
* Resume indexing
* Secure storage and backups

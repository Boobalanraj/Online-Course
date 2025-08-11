# <ins>Online Course</ins>

---
## <ins>Description</ins>
### 📘 <ins>Project Description</ins>
This project is a web-based learning platform that combines the core features of Udemy and Coursera into a single unified system. It is designed to serve both:

**Individual instructors** (like Udemy) who want to create and publish their own courses independently.

**Organizations or institutions** (like Coursera) that offer structured, professional-level courses.

The goal is to build a flexible and scalable system that supports multiple course providers under one platform, allowing users to access diverse educational content from both individuals and institutions.

---

### 🔧 <ins>Technology Stack</ins>
**Backend Framework:** Spring Boot

**Architecture:** Microservices

**Communication:** REST APIs

**Language:** Java

---

### 🧩 <ins>Microservices Overview</ins>
The platform is built using a microservices architecture, where each service is responsible for a specific domain and interacts via RESTful APIs. This allows for better scalability, maintainability, and team collaboration.

#### <ins>Core Microservices:</ins>
- User Service Handles user registration, login, authentication, user roles (individual or organization).

#### <ins>Course Service</ins>
- Manages course creation, updates, categorization, and publishing.

#### <ins>Enrollment Service</ins>
- Manages course enrollment, progress tracking, and user-course relationships.

#### <ins>Payment Service</ins>
- Integrates payment gateways and handles transactions for paid courses.

#### <ins>Review & Rating Service (optional)</ins>
- Allows users to leave feedback and rate courses.

#### <ins>Notification Service (optional)</ins>
- Sends email or in-app notifications (e.g., enrollment confirmations, course updates).

---

### 🎯 <ins>Project Goals </ins>
- Merge the course creation models of both individuals and organizations into one platform.

- Build a scalable, modular backend using Spring Boot microservices.

- Develop clean and maintainable RESTful APIs for future front-end/mobile integration.

- Ensure secure and role-based access to features.
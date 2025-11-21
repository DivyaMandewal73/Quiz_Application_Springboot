# 🎯 Quiz Application - Spring Boot


  
  ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=flat&logo=springboot)
  ![Java](https://img.shields.io/badge/Java-17+-orange?style=flat&logo=java)
  ![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=flat&logo=mysql)
  
  <p>A robust backend REST API for managing dynamic quizzes — built with Spring Boot, JPA/Hibernate, and MySQL.</p>
</div>

---

## 📋 Table of Contents

- [Project Overview](#-project-overview)
- [Technology Stack](#-technology-stack)
- [Features](#-features)
- [Architecture](#-architecture)
- [API Endpoints](#-api-endpoints)
- [Installation & Setup](#-installation--setup)
- [Future Enhancements](#-future-enhancements)
- [Contributing](#-contributing)
- [Credits & Inspiration](#-credits--inspiration)
- [Author](#-author)

---

## 🌟 Project Overview

**Quiz Application** is a backend-focused Spring Boot project designed to demonstrate RESTful API development, database management, and clean architecture principles. The application enables users to:

- Manage a question bank with categories
- Generate dynamic quizzes with customizable difficulty
- Submit quiz responses and receive instant scoring
- Retrieve questions by category or ID

Built with scalability in mind, this project follows **MVC + Service + Repository** architecture and is ready for future enhancements like JWT authentication, microservices migration, and Docker containerization.



---

## 🛠️ Technology Stack

| **Layer**        | **Technologies**                          |
|------------------|-------------------------------------------|
| **Backend**      | Java , Spring Boot 3.x, JPA/Hibernate |
| **Database**     | MySQL 8.0                                 |
| **Build Tool**   | Maven                                     |
| **API Testing**  | Postman                                   |
| **Version Control** | Git, GitHub                            |
| **Architecture** | REST API, MVC + Service + Repository      |

---

## ✨ Features

### 📚 Question Management
- ✅ **Add Questions** — Create questions with categories, difficulty levels, and options
- ✅ **Get All Questions** — Retrieve the entire question bank
- ✅ **Get by Category** — Filter questions by specific categories (e.g., Java, Python, DSA)
- ✅ **Get by ID** — Fetch individual questions by unique identifier

### 🎲 Quiz Management
- ✅ **Create Quiz** — Generate dynamic quizzes with a specified category and number of questions
- ✅ **Get Quiz by ID** — Retrieve quiz details without revealing answers
- ✅ **Submit Quiz** — Submit answers and receive instant score calculation

### 🔒 Clean API Design
- RESTful endpoints following industry standards
- JSON request/response format
- Proper HTTP status codes and error handling

---

## 🏗️ Architecture

The application follows a **layered architecture** for separation of concerns:



```
┌─────────────────────────────────────┐
│         REST Controllers            │  ← HTTP Requests/Responses
├─────────────────────────────────────┤
│         Service Layer               │  ← Business Logic
├─────────────────────────────────────┤
│         Repository Layer            │  ← Data Access (JPA)
├─────────────────────────────────────┤
│         Database (MySQL)            │  ← Persistent Storage
└─────────────────────────────────────┘
```

**Design Patterns Used:**
- **MVC Pattern** — Model-View-Controller for clean separation
- **Repository Pattern** — Data access abstraction via Spring Data JPA
- **Service Layer** — Encapsulates business logic and transaction management

---

## 🌐 API Endpoints

### 📝 Question APIs

| Method | Endpoint                    | Description                    |
|--------|-----------------------------|--------------------------------|
| `GET`  | `/question/allQuestions`    | Get all questions              |
| `GET`  | `/question/category/{cat}`  | Get questions by category      |
| `POST` | `/question/add`             | Add a new question             |

### 🎯 Quiz APIs

| Method | Endpoint                    | Description                    |
|--------|-----------------------------|--------------------------------|
| `POST` | `/quiz/create`              | Create a new quiz              |
| `GET`  | `/quiz/get/{id}`            | Get quiz questions by ID       |
| `POST` | `/quiz/submit/{id}`         | Submit quiz answers and get score |

---

## 🚀 Installation & Setup

### Prerequisites
- Java 17 or higher
- Maven 3.8+
- MySQL 8.0+
- Postman (for API testing)
- Git

### Step 1: Clone the Repository
```bash
git clone https://github.com/DivyaMandewal73/quiz-application-springboot.git
cd quiz-application-springboot
```

### Step 2: Configure Database
Create a MySQL database and update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/quiz_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Step 3: Build and Run
```bash
mvn clean install
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

### Step 4: Test APIs with Postman
Import the provided Postman collection or test endpoints manually.



## 🌱 Future Enhancements

- 🔐 **JWT Authentication** — Secure user login and signup
- 🏢 **Microservices Architecture** — Split into Question Service and Quiz Service
- 🐳 **Docker Containerization** — Easy deployment with Docker Compose
- ✅ **JUnit Testing** — Comprehensive unit and integration tests
- ⚛️ **React Frontend** — Build a responsive UI for quiz-taking
- ☁️ **Cloud Deployment** — Deploy to AWS, Render, or Railway
- 📊 **Analytics Dashboard** — Track user performance and quiz statistics



---

## 🤝 Contributing

Contributions are welcome! Follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit changes (`git commit -m 'Add AmazingFeature'`)
4. Push to branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 🙌 Credits & Inspiration

This project is built as part of learning **Java**, **Spring Boot**, and **REST API development**.
**Learning Resources:**
- Followed tutorial by [Telusko](https://www.youtube.com/@Telusko) on Spring Boot Quiz Application
- Practical implementation of RESTful APIs with JPA/Hibernate

The project is structured for future enhancements like microservices architecture, JWT authentication, and Docker containerization.

---

## 👩‍💻 Author


  
  **Divya Sanjay Mandewal**  
  💼 Aspiring Software Developer | Java | Spring Boot | React | SQL
  
  📧 **Email:** [lostengineer73@gmail.com](mailto:lostengineer73@gmail.com)  
  🔗 **GitHub:** [@DivyaMandewal73](https://github.com/DivyaMandewal73)  
  🔗 **LinkedIn:** [divya-mandewal](https://linkedin.com/in/divya-mandewal)
</div>

---


## ⭐ Show Your Support

If you found this project helpful, please give it a ⭐ on GitHub!

<div align="center">
  <img src="https://img.shields.io/github/stars/DivyaMandewal73/quiz-application-springboot?style=social" alt="GitHub stars"/>
  <img src="https://img.shields.io/github/forks/DivyaMandewal73/quiz-application-springboot?style=social" alt="GitHub forks"/>
</div>

---

<div align="center">
  <sub>Built with ❤️ by Divya Mandewal</sub>
</div>

---

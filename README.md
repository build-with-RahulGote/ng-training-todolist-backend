# 🛠️ To-Do List App – Backend (Spring Boot)

This is the **backend** implementation of the **To-Do List application** built using **Spring Boot** and **MongoDB**, as part of the Enzigma Solutions LLP App Developer assignment.

The backend provides a RESTful API that allows the frontend (built in React) to perform CRUD operations and search tasks by keyword.

---

## ⚙️ Tech Stack

- ☕ Spring Boot
- 🌐 Spring Web (REST APIs)
- 🧪 Spring Boot Test (JUnit + Mockito)
- 🗄️ MongoDB (NoSQL Database)
- 🧰 Maven (Project Build Tool)
- 🔄 Spring Data MongoDB
- 🔐 CORS Configuration (for React frontend integration)

---

## 📦 Features

- ➕ Create Task
- 📋 Get All Tasks
- ✏️ Update Task by ID
- ❌ Delete Task by ID
- 🔍 Search Task by Keyword (title/description)

---

## 🔗 API Endpoints

| Method | Endpoint                          | Description                  |
|--------|-----------------------------------|------------------------------|
| GET    | `/api/tasks`                      | Get all tasks                |
| POST   | `/api/task`                       | Create a new task            |
| PUT    | `/api/task/{id}`                  | Update task by ID            |
| DELETE | `/api/task/{id}`                  | Delete task by ID            |
| GET    | `/api/tasks/search?keyword=xyz`   | Search task by keyword       |

---

## 🧾 Sample Task JSON

```json
{
  "assignTo": "USER 1",
  "description": "Submit before deadline",
  "dueDate": "2025-07-10",
  "priority": "High",
  "status": "Pending"
}

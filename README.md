# 🌡️ Temperature Converter REST API

A RESTful Temperature Converter API built using **Java Spring Boot** and **MongoDB**. This project converts temperatures between Celsius and Fahrenheit, stores every conversion in MongoDB, and provides an API to retrieve conversion history.

---

## 🚀 Technologies Used

- Java 21
- Spring Boot 3
- Spring Web
- Spring Data MongoDB
- MongoDB Compass
- Maven
- Lombok
- Postman

---

## ✨ Features

- Convert Celsius to Fahrenheit
- Convert Fahrenheit to Celsius
- Save conversion history to MongoDB
- Retrieve all conversion history
- RESTful API implementation
- Layered Architecture (Controller → Service → Repository → MongoDB)

---

## 📂 Project Structure

```
src
├── controller
│   └── TemperatureController.java
├── model
│   └── TemperatureLog.java
├── repository
│   └── TemperatureRepository.java
├── service
│   └── TemperatureService.java
└── TempconverterApplication.java
```

---

## 📡 API Endpoints

### 1. Convert Temperature

**POST**

```
POST /api/temperatures/convert
```

Example:

```
http://localhost:8081/api/temperatures/convert?value=100&unit=Celsius
```

Example Response

```json
{
  "id": "xxxxxxxx",
  "inputTemperature": 100,
  "inputUnit": "Celsius",
  "outputTemperature": 212,
  "outputUnit": "Fahrenheit",
  "timestamp": "2026-07-05T21:52:39"
}
```

---

### 2. Get Conversion History

**GET**

```
GET /api/temperatures/history
```

Example:

```
http://localhost:8081/api/temperatures/history
```

Example Response

```json
[
  {
    "inputTemperature": 100,
    "inputUnit": "Celsius",
    "outputTemperature": 212,
    "outputUnit": "Fahrenheit"
  }
]
```

---

## 🗄️ Database

**Database:** MongoDB

**Collection:** `conversions`

Each record stores:

- Input Temperature
- Input Unit
- Output Temperature
- Output Unit
- Timestamp

---

## 🧪 Testing

This API was tested using **Postman**.

Supported HTTP Methods:

- POST
- GET

---

## ▶️ How to Run

### Clone the repository

```bash
git clone https://github.com/roshini-nawanjala/temperature-converter-rest-api.git
```

### Open the project

Open the project using **Visual Studio Code** or **IntelliJ IDEA**.

### Start MongoDB

Ensure MongoDB is running on:

```
localhost:27017
```

### Run the application

Run:

```
TempconverterApplication.java
```

or

```bash
mvn spring-boot:run
```

---

## 📷 Screenshots

- Spring Boot Running
  <img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/beabf4aa-0cee-4d58-8bff-5ddf6dc0d7cf" />

- POST Request (Postman)
  <img width="860" height="594" alt="image" src="https://github.com/user-attachments/assets/d9ecc04e-18f4-4681-be7a-0a6664831348" />

- GET Request (Postman)
  <img width="865" height="604" alt="image" src="https://github.com/user-attachments/assets/e9ec2e22-fc58-477e-8fec-f2ae6bef3f7f" />

- MongoDB Compass
  <img width="1330" height="589" alt="image" src="https://github.com/user-attachments/assets/44f6e526-8eb5-4cbe-a3d3-cec010d74a8d" />


---

## 📚 What I Learned

- Building REST APIs using Spring Boot
- Working with MongoDB using Spring Data MongoDB
- Implementing Layered Architecture
- Creating GET and POST endpoints
- Testing APIs with Postman
- Storing and retrieving data from MongoDB

---

## 👩‍💻 Author

**Roshini Nawanjala**

GitHub: https://github.com/roshini-nawanjala

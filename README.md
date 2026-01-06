# 📘 Employee Management System (Core Java)

## 📌 Project Overview

The **Employee Management System** is a console-based Java application developed as part of an internship task.
It manages employee records using **Core Java**, **Collections**, and **File Handling**, following proper **OOP principles**.

The system allows users to perform CRUD operations, search employees, generate salary reports, and persist data using files.

---

## 🛠️ Technologies Used

* **Java (Core Java)**
* **OOP Concepts**
* **Collections Framework**

  * ArrayList
  * HashMap
* **File Handling (Serialization)**
* **Exception Handling**
* **VS Code (macOS)**

---

## ✨ Features

* ➕ Add new employee
* 📄 View all employees
* ✏️ Update employee details
* ❌ Delete employee
* 🔍 Search by name
* 🏢 Search by department
* 💰 Salary calculation & reporting
* 💾 File-based data persistence
* ⚠️ Proper exception handling

---

## 🧱 Project Structure

```
Employee Management System/
├── Main.java
├── Employee.java
├── EmployeeService.java
├── FileUtil.java
├── employees.dat   (auto-generated)
└── README.md
```

---

## 📂 Class Description

### 🔹 Employee.java

* Model class
* Stores employee attributes:

  * id
  * name
  * department
  * position
  * salary
  * joinDate

### 🔹 EmployeeService.java

* Business logic layer
* Implements CRUD operations
* Uses:

  * `ArrayList` for storage
  * `HashMap` for fast lookup by ID

### 🔹 FileUtil.java

* Handles file save/load
* Uses serialization
* Ensures data persistence

### 🔹 Main.java

* Console-based user interface
* Menu-driven interaction
* Handles user input and output

---

## ▶️ How to Run the Project (macOS)

### Step 1: Open Terminal in Project Folder

```bash
cd "Employee Management System"
```

### Step 2: Compile the Code

```bash
javac *.java
```

### Step 3: Run the Application

```bash
java Main
```

---

## 🧪 Sample Output

```
1.Add 2.View 3.Update 4.Delete 5.Search Name 6.Search Dept 7.Salary Report 0.Exit
```

---

## 📈 Salary Report Example

```
Total Salary Expense: ₹50000
Average Salary: ₹50000
```

---

## ⚠️ Exception Handling

* Prevents duplicate employee IDs
* Handles invalid input
* Safely loads data even if file is missing
* Prevents application crashes

---

## 🚀 Future Enhancements

* Database integration (PostgreSQL)
* Spring Boot REST APIs
* GUI or Web Interface
* Sorting & filtering options
* Role-based access

---

## 👨‍💻 Author

**Ayyappa Vavilala**
Java Developer Intern

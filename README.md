# 🏥 Hospital Management System

A **Java Swing–based Hospital Management System** designed to manage core hospital operations such as patient admission, room allocation, employee records, ambulance services, billing updates, and patient discharge using a centralized MySQL database.

---

## 📌 Features

### 🔐 Authentication
- Secure login system for authorized access

### 🧑‍⚕️ Patient Management
- Add new patients
- View all patient records
- Update patient details
- Discharge patients with automatic room release

### 🛏️ Room Management
- View all rooms with availability
- Search rooms by status (Available / Occupied)
- Automatic room allocation and release

### 👩‍💼 Employee Management
- View employee information

### 🚑 Ambulance Management
- View ambulance availability and location

### 🏢 Department Management
- View hospital departments and contact details

### 💰 Billing Support
- Deposit tracking
- Pending amount calculation

---

## 🛠️ Tech Stack

- **Programming Language:** Java  
- **GUI Framework:** Java Swing & AWT  
- **Database:** MySQL  
- **Database Connectivity:** JDBC  
- **UI Data Handling:** DbUtils  
- **IDE:** IntelliJ IDEA / Eclipse  

---

## 🧩 Project Structure

```text
Hospital-Management-System/
│
├── src/
│   └── hospital/management/system/
│       ├── Login.java
│       ├── Reception.java
│       ├── NEW_PATIENT.java
│       ├── ALL_Patient_Info.java
│       ├── Employee_info.java
│       ├── Department.java
│       ├── Room.java
│       ├── SearchRoom.java
│       ├── Ambulance.java
│       ├── patient_discharge.java
│       ├── update_patient_details.java
│       └── connection.java
│
├── icon/
│   └── (UI icons used in the application)
│
├── .gitignore
└── Hospital Management System.iml
```
---

## 🗄️ Database Schema (Overview)

**Tables Used:**
- `login`
- `Patient_Info`
- `room`
- `EMP_INFO`
- `department`
- `Ambulance`

> MySQL database name: `hospital_management_system`

---

# 🏨 Hotel & Restaurant Management System  
![Java](https://img.shields.io/badge/Java-17-blue)  
![GitHub](https://img.shields.io/badge/Team-Project-success)  

**Course:** Programming Fundamentals (CSC103)  
**University:** COMSATS University Islamabad  
**Instructor:** Ma’am Gulmina Rextina  
**Team:**  
- Fatima Azaz (SP25-BCS-027) - Admin Modules & Core Logic  
- Areeba Saijal (SP25-BCS-017) - User Modules & Report  


---

## 📜 Project Overview  
A **console-based Java application** for managing hotel room bookings, restaurant orders, and room services. Designed to streamline operations with:  
- **User authentication** (Admin/Customer)  
- **CRUD operations** for bookings and orders  
- **File-based persistence** for data storage  
- **GST-inclusive billing** with detailed receipts  

---

## 🛠️ Key Features  

### **1. User System**  
- Registration & login with credentials stored in `users.txt`  
- Role-based access (Admin vs. Customer)  

### **2. Room Booking**  
- 3 room types (Standard/Deluxe/Executive) with dynamic pricing  
- Real-time availability checks via `booked_rooms.txt`  
- Input validation (e.g., CNIC format, numeric days)  

### **3. Restaurant & Services**  
- Menu-driven ordering with arrays:  
  ```java
  String[] foodItems = {"Biryani", "Burger", "Pizza"};
  int[] foodPrices = {400, 300, 500};
### **4. Admin Panel**
- View/edit all bookings (booking_*.txt)
- Search by username/CNIC
- Update room numbers/days of stay

### **5. Receipt Generation**
Automatically generates PDF-like receipts:

```text
GRAND TOTAL (Including GST): Rs. 31005
Date: 2025-06-14
```
## 💻 Technical Implementation

### **Core Java Concepts Applied**

| **Category**         | **Implementation Examples**                          |
|----------------------|-----------------------------------------------------|
| **Data Structures**  | Arrays for menus (`String[] foodItems`), orders, and room availability |
| **File I/O**         | `FileWriter` for saving bookings, `Scanner` for reading receipts |
| **Exception Handling** | `try-catch` blocks for CNIC validation and numeric input checks |
| **Control Flow**     | `switch` for menu navigation, `while` loops for input retries |

## 🏆 Skills Gained
### Technical Skills
1.  Java Programming – Arrays, file handling
2. Debugging – Logical error resolution via testing
3. Algorithm Design – Sorting bookings, calculating GST
4. Version Control – Collaborative Git usage

### Soft Skills
1.  Team Collaboration – Task division (User vs. Admin modules)
2. Documentation – Detailed report writing
3. Problem-Solving – Edge-case handling (e.g., invalid CNIC));

## 🚀 How to Run
**1. Clone & Compile:**

```bash
git clone https://github.com/Fatima-eng-coder/programming-fundamentals-first-semester.git
javac Hotel_And_Rest_Mangement_system.java
```
**2. Execute:**

```bash
java Hotel_And_Rest_Mangement_system
```
**3. Test Credentials:**

🔐 Admin Login Setup

To access the admin panel, you'll need to create an `admin.txt` file with credentials:

1. **Create `admin.txt`** in your project root directory
2. **Add admin credentials** in this format:
   ```text
   admin1,1234
   admin2,password123

## 📂 File Structure
```text
project/
├── booked_rooms.txt          # Track room availability
├── booking_*.txt             # Customer bookings (e.g., booking_areeba.txt)
├── admin.txt                 # Admin credentials
├── users.txt                 # Customer credentials
└── receipts/                 # Generated receipts
```
## 🔮 Future Enhancements
- GUI (JavaFX/Swing)

- Database integration (MySQL)

- Email receipt delivery

---
  <div align="center"> <i>Developed with ❤️ for CSC103 - COMSATS Islamabad | Spring 2025</i> </div> 



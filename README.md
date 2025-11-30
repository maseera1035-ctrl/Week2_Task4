# 📘 Week 2 – Task 4: Java Collection Framework Scenarios

This project contains **10 real-world scenarios** implemented using the **Java Collection Framework**.  
Each scenario demonstrates correct usage of Lists, Sets, Maps, Queues, PriorityQueue, and Stack, based on real applications like attendance systems, exam submissions, caches, and more.

All 10 scenarios have separate Java classes and use in-built sample data.

---

## 📂 **List of Scenarios (10 Total)**

| No | Scenario Name | File Name | Collection Used |
|----|---------------|-----------|------------------|
| 1 | Attendance System | `Attendence.java` | HashMap |
| 2 | Browser History | `BrowserHistory.java` | Stack |
| 3 | Cache System | `CacheSystem.java` | LinkedHashMap |
| 4 | Exam Submission Order | `ExamSubmission.java` | Queue (LinkedList) |
| 5 | Leaderboard Ranking | `LeaderBoard.java` | TreeMap |
| 6 | Print Queue System | `PrintQueue.java` | Queue |
| 7 | Priority Task Manager | `PriorityTask.java` | PriorityQueue |
| 8 | Product Store | `ProductStore.java` | HashMap |
| 9 | Student Lookup by ID | `StudentLookup.java` | TreeMap |
| 10 | Weekly Timetable | `TimeTable.java` | LinkedHashMap |

---

# 🔍 **Detailed Scenario Explanations**

Below is the full explanation for each scenario including **why it was chosen** and **why a particular collection structure is used**.

---

## 1️⃣ **Attendance System – `Attendence.java`**

### ✔ Scenario  
Track each student's attendance as **Present / Absent**.

### ✔ Why this scenario?  
Attendance tracking is used daily in schools, offices, and training centers.

### ✔ Collection Used → `HashMap<String, String>`  
| Reason | Description |
|--------|-------------|
| Key-value structure | Key = Student Name, Value = Present/Absent |
| No duplicates | Each student appears only once |
| Fast lookup | Quickly check who is present or absent |

---

## 2️⃣ **Browser History – `BrowserHistory.java`**

### ✔ Scenario  
Simulate browser **back** and **forward** functionality.

### ✔ Why this scenario?  
This is how real browsers manage history using LIFO logic.

### ✔ Collection Used → `Stack<String>`  
| Reason | Description |
|--------|-------------|
| LIFO (Last In First Out) | Last visited page appears first |
| Perfect for back navigation | Undo / Redo operations |

---

## 3️⃣ **Cache System – `CacheSystem.java`**

### ✔ Scenario  
Store recently accessed items and maintain insertion order (like browser cache).

### ✔ Why this scenario?  
Caching is used in browsers, databases, and APIs for fast retrieval.

### ✔ Collection Used → `LinkedHashMap`  
| Reason | Description |
|--------|-------------|
| Maintains order | Required for recognizing oldest element |
| Fast operations | Ideal for caching |
| Unique keys | No duplicate entries |

---

## 4️⃣ **Exam Submission System – `ExamSubmission.java`**

### ✔ Scenario  
Students submit papers, and the teacher checks them **in the order received**.

### ✔ Why?  
Exam submissions always follow a queue pattern.

### ✔ Collection Used → `Queue<String>` (LinkedList)  
| Reason | Description |
|--------|-------------|
| FIFO (First In First Out) | First submitted → First checked |
| Simple queue operations | `add()`, `poll()`, `peek()` |

---

## 5️⃣ **Leaderboard Ranking – `LeaderBoard.java`**

### ✔ Scenario  
Rank players based on scores.

### ✔ Why?  
Gaming platforms and coding sites always need sorted leaderboards.

### ✔ Collection Used → `TreeMap<Integer, String>`  
| Reason | Description |
|--------|-------------|
| Automatically sorted by key | Best for score-based ranking |
| Stores unique scores | Ready for leaderboard display |

---

## 6️⃣ **Print Queue System – `PrintQueue.java`**

### ✔ Scenario  
Simulate printer job processing.

### ✔ Why?  
Printers follow a **first come, first served** process.

### ✔ Collection Used → `Queue<String>`  
| Reason | Description |
|--------|-------------|
| FIFO order | Jobs print in submit order |
| Easy queue operations | Real-world printing behavior |

---

## 7️⃣ **Priority Task Manager – `PriorityTask.java`**

### ✔ Scenario  
Tasks have different priorities (High > Medium > Low).

### ✔ Why?  
Used in operating system schedulers and workflow managers.

### ✔ Collection Used → `PriorityQueue<String>`  
| Reason | Description |
|--------|-------------|
| Automatically sorts tasks | Highest priority is processed first |
| Efficient removal | Fast polling of next important task |

---

## 8️⃣ **Product Store – `ProductStore.java`**

### ✔ Scenario  
Store and display products along with their prices.

### ✔ Why?  
Every e-commerce system uses product-price mapping.

### ✔ Collection Used → `HashMap<String, Double>`  
| Reason | Description |
|--------|-------------|
| Key-value lookup | Key = Product, Value = Price |
| Fast search | Good for large inventory |
| No duplicate product names | Ensures uniqueness |

---

## 9️⃣ **Student Lookup System – `StudentLookup.java`**

### ✔ Scenario  
Find student details using roll number.

### ✔ Why?  
Most institutions use ID-based lookup.

### ✔ Collection Used → `TreeMap<Integer, String>`  
| Reason | Description |
|--------|-------------|
| Automatically sorted by roll number | Easier to view list |
| Good for searching | Fast retrieval |

---

## 🔟 **Weekly Timetable – `TimeTable.java`**

### ✔ Scenario  
Store subjects for each weekday (Mon–Fri).

### ✔ Why?  
All schools maintain a weekly schedule.

### ✔ Collection Used → `LinkedHashMap<String, String>`  
| Reason | Description |
|--------|-------------|
| Maintains insertion order | Mon → Tue → … → Fri |
| Key-value mapping | Day → Subject |

---

# 🏁 **Conclusion**

This project demonstrates how different **Java Collection Framework** classes solve real-world problems effectively.  
Each scenario is designed to reflect practical situations where **Lists, Sets, Maps, Queues, Stacks, and PriorityQueues** are naturally required.

---

**Maseera1035-ctrl**





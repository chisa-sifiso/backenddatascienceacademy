<img width="1338" height="728" alt="image" src="https://github.com/user-attachments/assets/6dbe5cae-4ed1-478c-8f7a-3ea400f9331b" />
<img width="1026" height="478" alt="image" src="https://github.com/user-attachments/assets/26058d71-74e6-4656-9170-d9682b355810" />
<img width="1211" height="626" alt="image" src="https://github.com/user-attachments/assets/988a5e0b-f559-4ece-8341-ee8179831679" />
<img width="1360" height="734" alt="image" src="https://github.com/user-attachments/assets/9ef54ec6-f0e8-4e3b-a98f-7e2104ef730d" />
<img width="1356" height="713" alt="image" src="https://github.com/user-attachments/assets/9c170d91-7f56-4d2e-80c4-f05ff88d162d" />
<img width="1333" height="381" alt="image" src="https://github.com/user-attachments/assets/745555ad-8984-4c55-a8fe-ca6dd121c772" />
<img width="1357" height="736" alt="image" src="https://github.com/user-attachments/assets/1cee6ec1-b191-4451-871b-8d392d28b21b" />
<img width="1357" height="693" alt="image" src="https://github.com/user-attachments/assets/f0f0f082-614b-4fa8-bbb5-54fcfd13227c" />
<img width="1321" height="622" alt="image" src="https://github.com/user-attachments/assets/7e2e8f6a-02cf-4084-8262-05e51f8d78d9" />
<img width="1270" height="527" alt="image" src="https://github.com/user-attachments/assets/b018b819-22f7-492c-aaf1-7f3e5db13590" />
<img width="1266" height="492" alt="image" src="https://github.com/user-attachments/assets/9f772871-2241-47e7-b386-880c82702871" />
<img width="1225" height="364" alt="image" src="https://github.com/user-attachments/assets/085d274b-df0b-46c5-b924-0a64ce1e812b" />
<img width="1180" height="52" alt="image" src="https://github.com/user-attachments/assets/c1451aa9-72c9-4568-88ac-71a8bc693a87" />
<img width="1358" height="679" alt="image" src="https://github.com/user-attachments/assets/ad8b8703-341b-4ee8-916e-7ef0ce4b2b27" />
<img width="1358" height="533" alt="image" src="https://github.com/user-attachments/assets/8cbdd180-99e4-4c54-afd7-73fd7ad0f009" />
<img width="1351" height="708" alt="image" src="https://github.com/user-attachments/assets/5074234d-f473-4a51-b744-c4b21c7bd529" />
<img width="1358" height="705" alt="image" src="https://github.com/user-attachments/assets/34d4b7d1-fe12-435a-ae12-61374aafa889" />
<img width="938" height="644" alt="image" src="https://github.com/user-attachments/assets/461eba74-635a-4058-95f2-e8a430c35159" />
<img width="1144" height="602" alt="image" src="https://github.com/user-attachments/assets/e4ee2013-bcaf-4ee5-8224-8d51bc4851c2" />
<img width="1007" height="539" alt="image" src="https://github.com/user-attachments/assets/02b31f89-bf2a-40d1-b098-fca7f6c69e36" />
<img width="1351" height="665" alt="image" src="https://github.com/user-attachments/assets/8c252977-01c4-48d2-bccd-3ca8510889f1" />
<img width="1316" height="114" alt="image" src="https://github.com/user-attachments/assets/42438a51-b302-408a-ae7a-a403a3e72a38" />

# 📊 Data Science Academy Application Portal

This is a full-stack web application developed for the **Data Science Academy (DSA)**. It provides a user-friendly portal for candidates to apply for data science programs and an admin dashboard to manage and review submissions.

---

## 📌 Project Overview

The application allows:
- Candidates to submit applications with personal details and CV attachments.
- Admins to:
  - View applications in a table.
  - Sort, filter, and paginate applications.
  - Preview and download CVs.
  - Update application statuses (Pending, Approved, Rejected).
  - Export data as CSV.

---

## 🎨 UI Design

The UI closely imitates a **Canva mockup** provided by the client, matching layout, spacing, fonts, and images pixel-perfectly. Key visual features:
- Hero section with icon overlays
- Branded colors and assets
- Fully responsive layout
- Custom CTA footer ("Ready to Get Started?" section)

---

## 🛠 Tech Stack

### Frontend:
- **React.js**
- **react-table** – for dynamic tables with pagination, filtering, and sorting
- **react-toastify** – for success/error notifications
- **Modal & Switch** components – for UI interactivity
- **Custom CSS** – replicates Canva designs

### Backend:
- **Spring Boot**
- RESTful API endpoints to handle:
  - Application submission
  - CV file upload/download
  - Admin status updates
  - Filtering and sorting

### Deployment:
- Frontend: Static React build deployed to **Afrihost**
- Backend: Hosted on **AWS EC2** instance (Spring Boot JAR running in background)

---

## 🚀 Getting Started

### Prerequisites:
- Node.js
- Java 17
- Spring Boot
- Git

---

## 🧾 Setup Instructions

### Frontend

```bash
cd frontend
npm install
npm start

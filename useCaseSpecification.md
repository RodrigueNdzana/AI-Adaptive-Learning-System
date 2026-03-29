# 2. Use Case Specifications (8 Critical Use Cases)

## Use Case 1: Register/Login
- **Actor:** Student, Educator, Admin  
- **Precondition:** User has credentials  
- **Postcondition:** User is authenticated  

**Basic Flow:**
1. User enters login details  
2. System validates credentials  
3. User gains access  

**Alternative Flow:**
- Invalid login → error message  
- 5 failed attempts → account locked  

---

## Use Case 2: Manage Learning Profile
- **Actor:** Student with Disability  
- **Precondition:** User logged in  
- **Postcondition:** Profile saved  

**Basic Flow:**
1. User opens profile  
2. Enters preferences & disability info  
3. Saves profile  

**Alternative Flow:**
- Missing fields → validation error  

---

##  Use Case 3: View AI Recommendations
- **Actor:** Student  
- **Precondition:** Profile exists  
- **Postcondition:** Recommendations displayed  

**Basic Flow:**
1. Student logs in  
2. System analyses data  
3. Recommendations shown  

**Alternative Flow:**
- No data → show default recommendations  

---

## Use Case 4: Access Learning Content
- **Actor:** Student  
- **Precondition:** Content available  
- **Postcondition:** Content displayed  

**Basic Flow:**
1. Student selects module  
2. Chooses format (video/text/audio)  
3. Content loads  

**Alternative Flow:**
- Format unavailable → fallback option  

---

## Use Case 5: View Progress Dashboard
- **Actor:** Student  
- **Precondition:** Activity exists  
- **Postcondition:** Dashboard displayed  

**Basic Flow:**
1. Student logs in  
2. Opens dashboard  
3. Views progress metrics  

**Alternative Flow:**
- No activity → show empty dashboard  

---

##  Use Case 6: Monitor Student Progress
- **Actor:** Educator  
- **Precondition:** Students enrolled  
- **Postcondition:** Progress displayed  

**Basic Flow:**
1. Educator logs in  
2. Selects course  
3. Views student data  

**Alternative Flow:**
- No students → empty list  

---

##  Use Case 7: Upload Learning Content
- **Actor:** Educator  
- **Precondition:** Educator logged in  
- **Postcondition:** Content stored  

**Basic Flow:**
1. Upload file  
2. System runs accessibility check  
3. Content published  

**Alternative Flow:**
- Fails WCAG → cannot publish  

---

## Use Case 8: Detect At-Risk Students
- **Actor:** System (AI)  
- **Precondition:** Student data available  
- **Postcondition:** Alert generated  

**Basic Flow:**
1. System monitors performance  
2. Detects decline  
3. Sends alert to educator  

**Alternative Flow:**
- False trigger → educator dismisses alert 
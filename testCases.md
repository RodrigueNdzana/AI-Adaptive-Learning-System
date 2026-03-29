# Test Cases

##  Functional Test Cases

| Test ID | Req ID | Description | Steps | Expected Result | Status |
|--------|--------|------------|-------|----------------|--------|
| TC001 | FR-01 | Login user | Enter credentials | Login successful | Pass |
| TC002 | FR-02 | Create profile | Fill form & save | Profile saved | Pass |
| TC003 | FR-03 | View recommendations | Login → dashboard | 3+ recommendations shown | Pass |
| TC004 | FR-04 | Access content | Select module | Content loads in chosen format | Pass |
| TC005 | FR-05 | View dashboard | Open dashboard | Progress displayed | Pass |
| TC006 | FR-06 | Educator monitors students | Open class list | Student data visible | Pass |
| TC007 | FR-10 | Upload content | Upload file | File validated & stored | Pass |
| TC008 | FR-07 | Detect at-risk students | Simulate low score | Alert generated | Pass |

---

## ⚙️ Non-Functional Test Scenarios

###  Performance Test (NFR-P1)
- Simulate 1000 users  
- Measure dashboard load time  
-  Expected: ≤ 2 seconds  

###  Security Test (NFR-SEC2)
- Attempt unauthorized access  
-  Expected: Access denied  

---


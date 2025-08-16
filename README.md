## 💻Swag Labs - Automation Web Testing Project
## 🔗 Live Demo
<a href="https://www.saucedemo.com/" target="_blank">👉 Click Here to View</a>

---

## 📁 What's Included

- ✅ **Automated Test Cases** – Covers login functionality, add to cart, and view cart 
- ✅ **Page Object Model (POM)** – Ensures maintainability and scalability of the code  
- ✅ **Selenium + Java + TestNG** – Core tech stack for browser automation  
- ✅ **Allure Report Integration** – Elegant, detailed test reporting  
- ✅ **TestNG Report** – Default HTML test execution summary  
- ✅ **Maven** – For project build and dependency management  
- ✅ **README Instructions** – Setup and test execution guide
---

---

## ⚙️ Automation Testing

- 🔐 **Login**: Verify login functionality using valid credentials  
- 🛒 **Add to Cart**: Select a product and verify that it is added correctly  
- 🧺 **View Cart**: Click on the cart icon and confirm that added items are displayed 
---

## ⚙️ How to Run Automated Tests (Maven + TestNG)

### Step 1: Clone the Repo

```cmd
git clone https://github.com/Seif-Aldin-Yasser/Swag_Labs_Automation_Web_Testing_Project.git
```
```cmd
cd Swag_Labs_Automation_Web_Testing_Project
```
### Step 2: Install Dependencies

Make sure you have:
- Java 11 and Above
- Maven
- Chrome Browser
- Edge Browser
- Firefox Browser

Then run:

```cmd
mvn clean install
```

### Step 3: Execute Tests

```cmd
mvn test
```

### Step 4: View Test Report

After execution, view the default TestNG HTML report in:

```
test-output/index.html
```

### Step 5: View Allure Report

After execution, go to the source file of project to generate allure report, by following command:
```cmd
allure serve allure-results
```

## 💻Swag Labs - Automation Web Testing Project
## 🔗 Live Demo
<a href="https://www.saucedemo.com/" target="_blank">👉 Click Here to View</a>

---

## 📁 What's Included

- ✅ **Web UI Automation Testing** – Automate user flows including authentication and shopping cart scenarios
- ✅ **Test Automation Framework** – Build using Selenium WebDriver with Java and TestNG for structured test execution
- ✅ **Page Object Model (POM)** – Implemente to improve code reusability, readability, and maintainability
- ✅ **Test Cases & Validations** – Covered scenarios and verified expected UI behavior using assertions
- ✅ **Cross-Browser Testing** – Configure to execute tests on Chrome, Edge, and Firefox browsers
- ✅ **Test Execution Management** – Manage test suites and execution flow using TestNG
- ✅ **Test Reports** – Generated detailed execution reports using TestNG and Allure Report
- ✅ **Maven Integration** – Managed project dependencies, build process, and test execution
- ✅ **Project Documentation** – Included setup instructions and execution steps
---

---

## ⚙️ Automation Testing

- 🔐 **Login** – Verify login functionality using valid credentials  
- 🛒 **Add to Cart** – Select a product and verify that it is added correctly  
- 🧺 **View Cart** – Click on the cart icon and confirm that added items are displayed 
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

After execution, view the default TestNG HTML report in this file destination:

```
test-output/index.html
```

### Step 5: View Allure Report

After execution, go to the source file of project to generate allure report, by following command:
```cmd
allure serve allure-results
```

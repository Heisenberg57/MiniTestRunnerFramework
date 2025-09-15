This code shows polymorphism, abstraction, interfaces working in sync.

This is a real-world automation framework backbone → BaseTest (common setup), Test classes (specialized), BrowserDriver (interface for flexibility).

This feels exactly like a mini test runner in Selenium/TestNG, just in pure Java.

This project is part of my **SDET Bootcamp Journey**.  
It demonstrates how core **OOP principles** (Abstraction, Polymorphism, Interfaces) can be applied to build a **scalable test automation framework**.

---

## 🔹 Concepts Covered
- **Abstract Class (`BaseTest`)**
  - Defines a contract for all tests (`runTest()`).
  - Provides reusable setup logic (`setup()`).
- **Concrete Test Classes**
  - `LoginTest` and `CheckoutTest` extend `BaseTest` and implement their own test logic.
- **Interface (`BrowserDriver`)**
  - Defines browser actions (`openBrowser()`, `closeBrowser()`).
  - Implemented by `ChromeDriver` and `FirefoxDriver`.
- **Polymorphism**
  - One test suite runs across multiple browsers using the same driver variable.
  - New tests or new browsers can be added without rewriting core logic.
 
├── BaseTest.java # Abstract base class
├── LoginTest.java # Extends BaseTest
├── CheckoutTest.java # Extends BaseTest
├── BrowserDriver.java # Interface for browsers
├── ChromeDriver.java # Implements BrowserDriver
├── FirefoxDriver.java # Implements BrowserDriver
└── TestRunner.java # Runs all tests across all browsers


---

## 🔹 How It Works
1. Define tests (`LoginTest`, `CheckoutTest`) → each implements `runTest()`.
2. Define browsers (`ChromeDriver`, `FirefoxDriver`) → each implements `BrowserDriver`.
3. `TestRunner` uses **nested loops**:
   - Run each test
   - On each browser
   - With setup → execution → teardown

---

## 🔹 Sample Output

---

## 🔹 Key Learning
- Abstract classes ensure **consistency** across tests.
- Interfaces allow **browser independence**.
- Polymorphism provides **scalability** → new tests or drivers plug in easily.
- This mirrors how real-world frameworks like **Selenium with TestNG/JUnit** are structured.

---

## 🚀 Next Steps
In future bootcamp days:
- Add **data-driven testing** (parameters from CSV/Excel).  
- Add **Page Object Model (POM)** for better UI test design.  
- Integrate with **TestNG** and eventually CI/CD pipelines.

---


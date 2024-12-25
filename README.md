Skills Gained: 
- Test Automation Framework Design
- Selenium WebDriver Integration
- TestNG Suite Management
- Maven Dependency Management
- HTML Report Generation
- Page Object Model (POM) Implementation
- Modular Code Organization
- Configuration Management
- Custom Wait Implementation
- JSON Data Handling
- Utility Class Development
- Listener Integration in TestNG
- Extent Reports Customization
- Cross-Browser Testing Setup
- Reusable Code Development
- Debugging and Troubleshooting Test Cases
- Scalability and Maintenance of Frameworks

This structure represents a Selenium Automation Framework project, adhering to standard Java Maven conventions. Here's a breakdown of each component:

1. Root Directory: JapneetSachdeva1-SeleniumFramework/
This is the base folder containing all the framework components.

2. suites/
Contains TestNG XML suite files that define test execution flow.

Files:
allTestSuite_testNG.xml: Likely includes all test cases in the framework.
smoke_testNG.xml: Focuses on critical "smoke" tests to verify the basic functionality.
regression_testNG.xml: Contains tests that ensure changes don’t break existing functionality.

4. pom.xml
The Maven Project Object Model (POM) file.
Manages dependencies, build lifecycle, and plugins for the project.
Examples of dependencies it may include:
Selenium WebDriver
TestNG
Extent Reports
JSON parsing libraries (e.g., Jackson or Gson)

6. reports/
Contains HTML test execution reports, generated for each test run.
Organized by date:
13_11_2022/ and 14_11_2022/: Subfolders with timestamped HTML reports for specific execution times.

8. README.md
A documentation file in Markdown format.
Typically provides:
Overview of the project.
Setup instructions.
How to run the tests.
Contribution guidelines.

10. src/
This folder holds the main source code and test files.

![napkin-selection (1)](https://github.com/user-attachments/assets/4bb6d5f8-e230-403a-bf54-cc7013ff37bd)


6.1. main/
Contains the framework's core functionality.

resources/config.properties:

Configuration file for properties like URLs, browser types, and timeout durations.
java/:

base/:

Core classes shared across the framework:
SetupDriver.java: Manages WebDriver setup and teardown.
CustomWaits.java: Contains utility methods for custom explicit/implicit waits.
Commons.java: Commonly used helper functions.
pages/:

Implements the Page Object Model (POM) design.
Subfolders organize pages by category:
products/: Classes representing product-related pages:
LaptopPage.java, DesktopPage.java, etc.
LoginPage.java, HomePage.java, RegisterPage.java, etc.: Represent specific application pages.
utils/:

Utility/helper classes:
ExtentReportHelper.java: Manages Extent Report generation.
ListenerHelper.java: Implements TestNG listeners for logging and reporting.
PropertyReaderHelper.java: Reads and fetches values from config.properties.

6.2. test/
Holds the test cases and related configurations.

testData/:

Stores test data files.
Example:
ecom_login_data.json: Contains login credentials or other test data.
pageTests/:

Test classes for each page:
RegisterPageTests.java, LoginPageTests.java, HomePageTests.java, etc.
Organized into subfolders like ProductTests/ for product-related test cases.
testConfig/:

Contains test configurations.

Example:
BaseTest.java: A base class for test setup and teardown (e.g., WebDriver initialization, loading config).

Key Highlights:

- TestNG and Maven: A well-organized framework leveraging TestNG for test execution and Maven for dependency management.

- Page Object Model (POM): Follows POM design for better maintainability and readability.

- Modular Design: Separate modules for pages, utilities, and tests enhance scalability.

- Reporting: Includes timestamped HTML reports for test execution tracking.

- Reusable Components: Shared code in base and utils promotes reusability and reduces redundancy.

- This framework structure is professional and aligns with industry standards for Selenium-based test automation.

![napkin-selection](https://github.com/user-attachments/assets/6afe8e4f-45be-4b49-8810-5f0248e71494)


Valtech Task Project 
This repository contains a Maven-based Java project for automated testing of broker details functionality using Cucumber, Selenium, and TestNG.
POM structure is followed for the project.

Prerequisites

To set up and run the project, ensure you have the following installed:
* Java Development Kit (JDK) 8 or higher
* Maven 3.6+
* A web browser compatible with Selenium (e.g., Chrome, Firefox)
* WebDriver executable for your chosen browser 

Setup and Execution
1. Clone the repository: git clone “repo url”
2. cd Valtech_Task
3. Run the tests using Maven: mvn test
4. View the test report: Open target/cucumber-reports.html in a browser.

 Technologies Used
* Java: Programming language for test scripts.
* Selenium WebDriver: Used for browser automation.
* Cucumber: Behavior-Driven Development (BDD) framework.
* TestNG: Test execution and reporting.
* Maven: Dependency management and build tool.

Configuration Files

* pom.xml: Contains project dependencies, plugins, and build configurations.
* configuration.properties: Used for storing config variables like URLs and browser type etc.

Source Code 
* Pages:
    * AllBrokersPage class: Handles interactions of the page where all brokers are shown.
    * SingleBrokerPage class: Handles interactions when a single broker's details are shown. 
* Runners:
    * CukesRunner class: Main test runner for executing test scenarios.
    * FailedTestRunner class: Runner for re-executing the failed tests. 
* Step Definitions: 
    * BrokerDetailsStepDefs class: Implements step definitions for the broker details feature.
* Hooks class: Contains the setup and teardown logic for tests. 
* Utilities: 
    * BasePage class: Base class for page objects and it’s extended on all page classes.
* ConfigurationReader class: Utility class that is used for reading configuration properties.
* Driver class: Manages WebDriver instances.
* WaitUtils class: Helper methods for handling waits. 

Feature Files
* broker_details.feature: Cucumber feature file defining test scenarios for broker details functionality.

Reports

* target/cucumber-reports.html: HTML report generated after test execution.
* target/rerun.txt: List of failed scenarios for rerun.
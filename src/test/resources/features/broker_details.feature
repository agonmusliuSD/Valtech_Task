@YavlenaRegression
Feature: Validate Broker Search and Details
  As a user
  I want to verify the search and details functionality for brokers
  So that I can ensure the system displays accurate data

  @BrokerDetails
  Scenario: Validate broker search and details
    Given I am on the Yavlena brokers page
    When I extract all broker names displayed on the page
    Then I search for each broker and verify the address, phone numbers, and property count for each broker
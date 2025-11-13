Feature: Test Login Feature

  Scenario: To test login feature with valid creadentials
    Given I am on Saucedemo url
    When I am enter UserName
    And I enter Password
    Then login should be successfully complete

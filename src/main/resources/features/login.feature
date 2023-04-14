@SmokeScenario
Feature: Reach to google page

  @SmokeTest
  Scenario: User is able to reach google page

    Given user navigate to google
    When user is able to see google header
    Then user is able to see the search box
    And user search something invalid

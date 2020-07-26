Feature: Registration feature

  @trail
  Scenario: user should be able to register successfully
    so that user can use all user functionality on my website
    Given user is on homepage
    When  user clicks on register button
    And user enters all required registration details
    And user clicks on register-submit button
    Then user should be able to register successfully
Feature: Sign up and Sign in

  Background:
    Given User goes to Url

  Scenario: SBD01 Create Account
    When User hovers on Account
      And User clicks on Start here button
    Then Create Account page is displayed
    When User enter 'Dung Pham' as Your name
      And User select number domain
      And User enter '' as Mobile number
      And User enter 'TestAutomation@123' as password
      And User click on 'Continue' button

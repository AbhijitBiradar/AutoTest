Feature: HRM Forgot Your Password Page

  @Smoke @All @ForgotYourPassword
  Scenario Outline: I want to navigate to verify Forgot Your Password Page
    Given I am on HRM Login page
    When I click on Forgot Your Password link
    Then I should navigate Forgot Your Password page

    Examples: 
      | UserName | Password |
      | Admin    | admin123 |

  @Smoke @All @ForgotYourPassword
  Scenario Outline: I want to verify verify Forgot Your Password Page UI
    Given I am on HRM Login page
    When I click on Forgot Your Password link
    Then I should navigate Forgot Your Password page
    And Orange HRM Username field label should display
    And Orange HRM Username textbox should display
    And Reset Password button should display
    And Canel button should display

    Examples: 
      | UserName | Password |
      | Admin    | admin123 |

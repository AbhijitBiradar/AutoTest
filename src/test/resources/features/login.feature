Feature: HRM Login

	@Smoke @All 
  Scenario Outline: I want to login to HRM Appliation with valid credential
    Given I am on HRM Login page
    When I enter valid user name as "<UserName>"
    And I enter valid password as "<Password>"
    And click on login button
    Then user should login to app and display Home page

    Examples: 
      | UserName | Password |
      | Admin    | admin123 |

	@All
  Scenario Outline: I want to login to HRM Appliation with Invalid User Name
    Given I am on HRM Login page
    When I enter valid user name as "<UserName>"
    And I enter valid password as "<Password>"
    And click on login button
    Then application should display error message as "<ErrorMessage>" on login page

    Examples: 
      | UserName | Password | ErrorMessage        |
      | abhijit  | admin123 | Invalid credentials |

	@All
  Scenario Outline: I want to login to HRM Appliation with Invalid Password
    Given I am on HRM Login page
    When I enter valid user name as "<UserName>"
    And I enter valid password as "<Password>"
    And click on login button
    Then application should display error message as "<ErrorMessage>" on login page

    Examples: 
      | UserName | Password      | ErrorMessage        |
      | Admin    | Selenium@2023 | Invalid credentials |

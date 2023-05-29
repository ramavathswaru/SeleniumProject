Feature: Validate the login functionality of an application

  @TS01 @RegressionTest  @alpha @LoginTest
  Scenario: To validate the error message
    Given User launch the browser and navigate to the URL
    When User enter the username "user1" and password "123"
    And user clicks the login button
    Then Validate the error message

    @TS02 @Smoke @RegressionTest @LoginTest
  Scenario: User validate the login functionality of an application
    Given User launch the browser and navigate to the URL
    When User enter the username "user2" and password "abc"
    And user clicks the login button
    Then validate whether the user navigates to homepage

  @TS03 @LoginTest
  Scenario Outline:  Multiple user validation
    Given User launch the browser and navigate to the URL
    When User enter the username "<User Name>" and password "<Password>"
    And user clicks the login button
    Then validate whether the user navigates to homepage
  Examples:
    | User Name | Password |
    | US1       | 123      |
    | Aravinth  | abc      |
    | Demo      | xyz      |


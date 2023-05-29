
Feature: Validate the login page of an application
@TS01
Scenario:To validate the error message
  Given User Lunch the browser and navigate to the URL
  When  enter the username "user1" and password "abc"
  Then click the login button
  And validate the error message

  @TS02 @RegressionTest

  Scenario: User Validate the login functionality of an application
    Given User Lunch the browser and navigate to the URL
    When enter the username "jakka.venugpal1@gmail.com" and password "qZcCaXDk"
    Then click the login button
    And Validate whether user able to login homepage
@TS03
Scenario Outline: Validate Multiple User
  Given User Lunch the browser and navigate to the URL
  When enter the username "<user name>" and password "<password>"
  Then click the login button

  Examples:
    | user name | password |
    | user1     | abc      |
  |user2      |123       |
  |venu       |Venu@123  |

  Scenario: Login to Amazon Webpage
    Given Enter URL

#Author: alexandraTroyanop@gmail.com
#Keywords Summary :cucumber, selenium, java, gradle
Feature: Log in as a manager
  user wants to log in as a manager in the page

@login_manager
  Scenario: manager wants to login
    Given user is the home page
    When user enter of userame and password
      | username | password      |
      | manager  | Iomaddemo#123 |
    Then user can see welcome
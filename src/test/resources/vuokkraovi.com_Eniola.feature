Feature: voukkraovi.com


  Background:
    Given I am on the home page

  Scenario: Verify that Vuokkraovi.com navigates the user correctly
    When I click on advertisers
    And I click on media and services
    And I click on national consumers
    And I click on voukkraovi
    Then I should be led to vuokkraovi landing page

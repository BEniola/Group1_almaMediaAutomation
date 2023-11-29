Feature: Navigate to National consumer media list

  Scenario: Verify that National consumer media navigates the user correctly
  Given I am on the homepage
  And I click on Media and services
  When I click on National consumer media
  Then Users should be should be led to sub-menu that contains the following :  National Consumer Media, Finance and B2B Media  and Alma network

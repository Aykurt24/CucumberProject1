Feature: Edit Functionality

  Scenario: Edit first name
    Given Navigate to aoutomationpractice
    When Click on sing button and enter the username and password"FalcoN"
    Then User should login successfully
    Given Navigate to my personal information page
    When  Change the first name"Umare", enter the current password"FalcoN", new password"UmarE1", confirmation"UmarE1", and click on the save button
    Then  Edited successfully"Umare"

  Scenario: Edit first name with previous name
    Given Navigate to aoutomationpractice
    When Click on sing button and enter the username and password"UmarE1"
    Then User should login successfully
    Given Navigate to my personal information page
    When  Change the first name"Dogan", enter the current password"UmarE1", new password"FalcoN", confirmation"FalcoN", and click on the save button
    Then  Edited successfully"Dogan"





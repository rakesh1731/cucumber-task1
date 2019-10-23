Feature: Add Tariff Plan

  Scenario: Field validation
    Given user should be in telecom home page
    And user need to click on add tariff plan button
    When user need to fill all the fields
    And user should click on submit button
    Then user should be displayed tariff plan

  Scenario: Field validation by using 1dList
    Given user should be in telecom home page
    And user need to click on add tariff plan button
    When user need to fill all the fields by oneDim list
      | 494 | 999 | 594 | 664 | 5464 | 645 | 445 |
    And user should click on submit button
    Then user should be displayed tariff plan

  Scenario: Field validation by using 1dmap
    Given user should be in telecom home page
    And user need to click on add tariff plan button
    When user need to fill all the fields by oneDim map
      | mr   |     23 |
      | flc  |    343 |
      | fim  |   3445 |
      | fsp  | 345643 |
      | lpmc |   7654 |
      | ipmc |  78552 |
      | spc  |  25365 |
    And user should click on submit button
    Then user should be displayed tariff plan

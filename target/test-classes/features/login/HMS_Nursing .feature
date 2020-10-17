Feature: As a user I should be able to capture all nursing related activities

#  Scenario: Navigation to the Nursing module
#    When user login to HMS system
#    And Navigate to Nursing Module
#    Then User should able to see Nursing Home page

#  Scenario Outline: Validate nursing homepage display
#    When user login to HMS system
#    And Navigate to Nursing Module
#    And Expand the Transaction
#    Then home screen should displayed "<Option>"
#    Examples:
#      | Option            |
#      | IP Doctor Charges |
#      | IP Other Charges  |
#      | Doctor's Note     |
#      | OT Concent Form   |
#      | Progress Report   |
#      | Infant Entry      |
#      | E_prescription    |
#  Scenario: Validate available option for the nursing module

#  Scenario: Navigate to IP Doctor charges
#    When user login to HMS system
#    And Navigate to Nursing Module
#    And Expand the Transaction
#    And Click on IP Doctor Charges
#    Then User should be able to display Charges For Doctors


#
#  Scenario: validate the display of the IP Doctor charges
#
  Scenario Outline: validate IP number
    When user login to HMS system
    And Navigate to Nursing Module
    And Expand the Transaction
    And Click on IP Doctor Charges
    And user should enter valid IP NO as "<IPNO>"
    And click on show button
    Then user should be able to view patient details as BED

    Examples:
      | IPNO   |
      | IP7603 |
      | IP8000 |
#
#
##  Scenario: Show IP patient details by invalid IP number
#
##  Scenario: Show patient details with valid IP number
#
#  Scenario Outline: validate Bed number
#    When user navigates to IP Doctor charges
#    And user enters Bed no as "<BEDNO>"
#    And click on show button
#    Then user should be able to view patient details as "<expected_result>"
#    Examples:
#      | BEDNO | expected_result |
#      | BLANK |                 |
#
##  Scenario: Show patient details with valid bed number
#
#  Scenario: validate the show button
#    When user navigates to IP Doctor charges
#    And user enters IPno or BEDno
#    And user clicks  on show button
#    Then User should be able to view patient details
#
#  Scenario: validate the date
#
#  Scenario: validate the doctor
#
#  Scenario: validate the save button
#
#  Scenario: validate the cancel button
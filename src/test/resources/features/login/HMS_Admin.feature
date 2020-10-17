Feature: As a user I should be able to capture all admin related activities

#  Scenario: Navigate to Admin module
#    When user login to HMS system
#    And Navigate to Admin Module
#    Then validate the admin page
#
#
# Scenario  Navigate to user creation module
#    When user login to HMS system
#    And Navigate to Admin Module
#    And Navigate to user creation module

 Scenario:  As a user I want to add a new use with a role as  <"Role">
   When user login to HMS system
   And Navigate to Admin Module
   And Navigate to user creation module
  And input all mandatory field
  And click on create user







#  Scenario Outline: Validate to Admin home page
#    When user validate admin home page
#    Then home screen should displayed "<options>"
#
#    Examples:
#      |options|
#      |Organization |
#      |Branch       |
#      |Facility     |
#      |Finance Master|
#      |User Creation |
#      |Referal Master|
#      |Database Backup|
#      |Financial Year |
#
#
#
##  Scenario: Validate all available option for Admin feature
#
##  Scenario:Validate organisation master details
#
#
#
#  Scenario:validate to Branch
#    When User navigate to branch
#    And user enter textfield in branch name as "<sampletext>"
#    And Enter branch user code as "<codetext>"
#    And user enter phone no as "<somenumber>"
#  And
#
#
#
##  Scenario:validate to user Phone:
##
##  Scenario: validate to GST IN:
##  Scenario: validate State Code:
##
##  Scenario:validate Email:
##
##  Scenario:validate Mobile No:
##
##

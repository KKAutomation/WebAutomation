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

#  Scenario:  As a user I want to add a new use with a role as  <"Role">
#    When user login to HMS system
#    And Navigate to Admin Module
#    And Navigate to user creation module
#    And input all mandatory field
#    And click on create user


  Scenario Outline:  As a user I want to add a new use with a role as  <"Amodule">
    When user login to HMS system
    And Navigate to Admin Module
    And Navigate to user creation module
    And input all mandatory field "<empName>" "<username>" "<password>" "<cpassword>" "<Apermission>" "<Amodule>" "<status>"
    And click on create user
    Then It should not display user already registered
    Examples:
      | empName      | username   | password  | cpassword | Apermission | Amodule   | status |
      | Kiran EM0003 | Testuser01 | newpass12 | newpass12 | edit        | LAB NURSE | ACTIVE |
      | Dr GOURAV SAHA EM0004    | Testuser02 | newpass13 | newpass13 | delete      | ACCOUNTS LAB        | ACTIVE |
      | Dr lalit kumar EM0002 | Testuser03 | newpass14 | newpass14 | both        | ACCOUNTS  LAB NURSE | ACTIVE |










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

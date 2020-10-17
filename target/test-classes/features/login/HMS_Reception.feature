Feature: As a reception module user i should able to add update and delete patation to the HMS


#  Scenario: Navigate to reception home page
#    When user open HMS Application by entering ""
#    And select financial year as "2020-21"
#    And Select user name as "KH-ADMIN"
#    And Fill the password "ZEM@#$123"
#    And Click on login button

  Scenario Outline: Navigate to reception home page
    When user open HMS Application by entering "<URL>"
    And select financial year as "<finalcialyear>"
    And Select user name as "<Userid>"
    And Fill the password "<password>"
    And Click on login button
    Then user should able to see "<outcome>"
    Examples:

      | URL                                           | finalcialyear | Userid | password  | outcome  |
#      | http://demohms.finatma.in:1019/MMMaster/Login | 2020-2021     | KH-ADMIN | ZEM@#$123 | homepage |
#      | http://demohms.finatma.in:1019/MMMaster/Login | BLANK         | KH-ADMIN | ZEM@#$123 | ERRORMSGUsername |
#      | http://demohms.finatma.in:1019/MMMaster/Login | 2020-2021     | BLANK    | ZEM@#$123 | ERRORMSG |
#      | http://demohms.finatma.in:1019/MMMaster/Login | 2020-2021     | KH-ADMIN | BLANK     | ERRORMSG |
#      | http://demohms.finatma.in:1019/MMMaster/Login | 2018-2019      | KH-ADMIN | ZEM@#$123 | ERRORMSG |
      | http://demohms.finatma.in:1019/MMMaster/Login | 2020-2021     | SELECT | ZEM@#$123 | ERRORMSG |
#      | http://demohms.finatma.in:1019/MMMaster/Login | 2020-2021     | KH-ADMIN | INVALID   | ERRORMSG |
#      | http://demohms.finatma.in:1019/MMMaster/Login | 2017-2018     | INVALID  |INVALID    | ERRORMSG |
#      | http://demohms.finatma.in:1019/MMMaster/Login | BLANK         | BLANK    |BLANK      | ERRORMSG |


  Scenario Outline: Validate  Patient First Name
    When user navigate to patient registration page
    And user enter text as "<sampletext>"
    Then user should able to see typetext as "<sampletext>"
    Examples:
      | sampletext |expectedoutcome|
      | abcd       |               |


  Scenario Outline: Validate Patient Last Name :
    Examples:
    |Length|type|Editable|

  Scenario: Validate Patient Condition :

  Scenario:  Validate Insurance/Corporate :

  Scenario:   Validate   Refferal Name :

  Scenario: Validate  Other Source Name  From

  Scenario: validate Complaint Details present Complaint :

  Scenario: validate Complaint Details  Review :

  Scenario:  Validate Department Name

  Scenario: Validate selection of doctor Name

  Scenario: Validate Patient's Contact Information
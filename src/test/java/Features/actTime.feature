Feature: Validate Time-track functionality
  
  Scenario Outline: Validate Time-track for me Dropdown values
    Given Launch the actiTime application
    When User Enters "admin" and "manager" into username and passowrd fields
    And User clicks on Login button
    Then User verifies the Homepage is displayed
    When User selects the "<dropval>" values from Time-track dropdown
    Then User verifies the "<dropval>" is displayed

    Examples: 
      | dropval  | 
      | Smith, Brett | 
      #| White, Jane | 
      |hepsiba |
      
    #Scenario: Validate Time-track for me Dropdown values
    #Given Launch the actiTime application
    #When User Enters "admin" and "manager" into username and passowrd fields
    #And User clicks on Login button
    #Then User verifies the Homepage is displayed
    #When User selects the "Smith, Brett" values from Time-track dropdown
    #Then User verifies the "Smith, Brett" is displayed

 

Feature: UK Test Ticket using User Centric BDD

Test Coverage: The automation tests cover the functional flows with all 'Yes' and 'No' answers,
any functional flow with the combination of Yes and No value is not covered in the automated tests 

  Scenario: Get help with paying for nhs costs online service if all Negative answers
    Given I am a citizen of the UK
    When I put my circumstances into the Checker tool for negative answers
    Then I should get a result of whether I will get help or not for negative answers
    
    
  Scenario: Get help with paying for nhs costs online service if all Positive answers
    Given I am a citizen of the UK
    When I put my circumstances into the Checker tool for positive answers
    Then I should get a result of whether I will get help or not for positive answers
    

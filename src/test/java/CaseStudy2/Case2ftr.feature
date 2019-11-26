Feature: Login to TestMeApp
 log in using details

 
  Scenario Outline: Logging in
    Given Open Site in browser
    And Enter the <login_id> and <Password> 
    Then Click on login 
    #After Close
    
    Examples:
     
    |		login_id	|	Password	     |
    |		Lalitha		|	Password123    |
    |		Lalitha   | Password123    |
    
    
    
    
    
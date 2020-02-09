Feature: User verify text GMO Online on home page


   Scenario Outline: Select value from drop down
   Given User open application "<appURL>"
   When User select value from dropdown and get all options
   Then User logout from application
   
   Examples:
   		| appURL | 
   		| fbURL  | 
 
   Scenario Outline: Drag and drop image
   Given User open application "<appURL>"
   Then User drag image from one location to another location
   Then User logout from application
   
   Examples:
   		| appURL | 
   		| dragAndDropURL | 
   
  
   Scenario Outline: Handle multiple frames
   Given User open application "<appURL>"
   Then User handles multiple frames
   Then User logout from application
   
   Examples:
   		| appURL | 
   		| frameURL | 
   		
   		
   Scenario Outline: Verify status code 200
   Given User open application "<appURL>"
   Then User verify if status code of "<appURL>" is "<ResponseCode>"
   Then User logout from application
   
   Examples:
   		| appURL | ResponseCode |
   		| googleURL | 200|
   
   
  Scenario Outline: Delete all cookies by opening any link
   Given User open application "<appURL>"
   And User delete all cookies
   Then User logout from application
   
   Examples:
   		| appURL | 
   		| googleURL |  
   		
   		
   
  Scenario Outline: Verify value/text from page source
   Given User open application "<appURL>"
   Then User verify value "<text>" in page source
   Then User logout from application
   
   Examples:
   		| appURL | text|
   		| fbURL |Create an account|
   
   
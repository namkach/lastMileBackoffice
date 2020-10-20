Feature: import rider

  Scenario: show rider name in rider list
    Given staff login to web
    #And staff go to upload page
    #When staff import rider name
    And staff go to rider list page
    Then staff should see rider <firstname> and <lastname>
    And close the program
    
    Examples: 
    | firstname | lastname |
    | ทดสอบ | จ้า |
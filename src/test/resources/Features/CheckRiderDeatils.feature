Feature: import rider

  Scenario: show rider name in rider list
    Given staff login to web
    When staff click on "riderList" page
    And staff search for rider <fname> and <lname> and click details button
    #Then rider <fname> and <lname> details such as <fnameEng> or <lnameEng> or <sex> or <BD> or <telNo> or <IDNo> or <CVcode> or <licenseID> or <licenseIssueDate> or <licenseExpireDate> or <licenseType> or <insureExpireDate> or <taxExpireDate> or <vehicleType> or <licensePlateNo> or <brand> or <color>
    Then see rider <fname> and <lname> details such as <fnameEng> or <lnameEng> or <sex> or <BD> or <telNo>
    #And close the program

    Examples: 
    | fname | lname | fnameEng | lnameEng | sex | BD         | telNo      | IDNo          | CVcode | licenseID | licenseIssueDate | licenseExpireDate | licenseType            | insureExpireDate | taxExpireDate | vehicleType | licensePlateNo | brand | color |
    | น้ำ                | ทดสอบ         | aong     | test     | ชาย       | 18/05/1996 | 0234876847 | 1272368273682 |        | yyy       | 25/12/2120       | 25/12/2120        | ใบอนุญาตขับรถจักรยานยนต์ส่วนบุคคลชั่วคราว  | 05/10/2023       | 05/10/2022    | hhhh        | ufff           | jjjj  | zzzx  |
    #| fname | lname | fnameEng | lnameEng | sex | BD         | telNo      |
    #| น้ำ                | ทดสอบ         | aong     | test     | ชาย       | 18051996   | 0234876847 |
    
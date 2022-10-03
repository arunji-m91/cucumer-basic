Feature: verifying order id generation

  Scenario Outline: verifying order id generation with 10 valid inputs
    Given user should in adactive login page
    When user should enter "<userName>","<password>", and click login button
    And user should verify the login successful
    And user should enter search hotel page details as  "<location>","<hotel>","<roomType>","<noOfRooms>","<checkIn>","<checkOut>","<adultPerRoom>","<childrenPerRoom>"
    And user should click search button
    And user should in adactive select hotel page and check given details showing correct as we given
    And user should click select radio button
    And user should click continue button
    And user should enter book hotel details as  "<firstName>","<lastName>","<billAddress>","<creditCard>","<cCardType>","<expDate>","<expYear>","<cvv>"

    Examples: 
      | userName   | password | location | hotel       | roomType | noOfRooms | checkIn    | checkOut   | adultPerRoom | childrenPerRoom | firstName | lastName   | billAddress | creditCard       | cCardType | expDate  | expYear | cvv |
      | Greens8767 | L4R739   | London   | Hotel Creek | Double   | 2 - Two   | 02/09/2022 | 03/10/2022 | 2 - Two      | 2 - Two         | Arun      | Muniyappan | Injambakkam | 1234567891234567 | VISA      | December |    2022 | 256 |
      | Greens8767 | L4R739   | London   | Hotel Creek | Double   | 2 - Two   | 02/09/2022 | 03/10/2022 | 2 - Two      | 2 - Two         | Arun      | Muniyappan | Injambakkam | 1234567891234567 | VISA      | December |    2022 | 256 |
      | Greens8767 | L4R739   | London   | Hotel Creek | Double   | 2 - Two   | 02/09/2022 | 03/10/2022 | 2 - Two      | 2 - Two         | Arun      | Muniyappan | Injambakkam | 1234567891234567 | VISA      | December |    2022 | 256 |
      | Greens8767 | L4R739   | London   | Hotel Creek | Double   | 2 - Two   | 02/09/2022 | 03/10/2022 | 2 - Two      | 2 - Two         | Arun      | Muniyappan | Injambakkam | 1234567891234567 | VISA      | December |    2022 | 256 |
      | Greens8767 | L4R739   | London   | Hotel Creek | Double   | 2 - Two   | 02/09/2022 | 03/10/2022 | 2 - Two      | 2 - Two         | Arun      | Muniyappan | Injambakkam | 1234567891234567 | VISA      | December |    2022 | 256 |
      | Greens8767 | L4R739   | London   | Hotel Creek | Double   | 2 - Two   | 02/09/2022 | 03/10/2022 | 2 - Two      | 2 - Two         | Arun      | Muniyappan | Injambakkam | 1234567891234567 | VISA      | December |    2022 | 256 |

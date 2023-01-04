Feature: This feature is to test the search tv in Amazon 

  Scenario: Verify the landing page for demoqa app
    Given user opens "https://www.amazon.in/" in "chrome" browser
    When Click on the hamburger menu in the top left corner
    And Click on the TV, Appliances and Electronics link under Shop by Department section
    And Click on "Televisions" under Tv, Audio & Cameras sub section
    And Filter the results by Brand "Samsung"
    And Sort the Samsung results with price High to Low
    And Click on the second highest priced item
    Then Assert that “About this item” section is present and log this section text to console/report
    

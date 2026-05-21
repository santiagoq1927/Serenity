Feature: Navigate for all Demo Blaze pge

As a user of DemoBlaze
I want to add products to the cart and complete a purchase
So that I can verify the end-to-end purchase flow works correctly

Scenario: Successfully purchase two products for name on the DemoBlaze page
    Given User navigate to Demoblaze page
    When User add a product in the category "Laptops" with name "Sony vaio i5"
    And User add second product in the category "Monitors" with name "Apple monitor 24"
    And User select cart and click place order
    And User fill all the form and click purchase
    Then User should see the success message    
    
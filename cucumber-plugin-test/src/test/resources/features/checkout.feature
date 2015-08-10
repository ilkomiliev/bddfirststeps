Feature: checkout

  Scenario: 
    Given the price of a banana is 40c
    And the price of an apple is 25c
    And the price of an orange is 30c
    When I checkout 1 banana
    And I checkout 1 apple
    And I checkout 1 orange
    Then the total price should be 95c

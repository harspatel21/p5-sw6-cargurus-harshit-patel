@regression
Feature: Search functionality

  @sanity
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make          | model          | location        | price    |
      | Audi          | A8             | QLD - Brisbane  | $80,000  |
      | Honda         | CR-V           | VIC - Melbourne | $30,000  |
      | BMW           | 7 Series       | NSW - Sydney    | $70,000  |
      | Hyundai       | Genesis        | QLD - All       | $80,000  |
      | Kia           | Grand Carnival | WA - Perth      | $40,000  |
      | Audi          | Q7             | QLD - Brisbane  | $100,000 |
      | Mercedes-Benz | Any Model      | NSW - Sydney    | $100,000 |

  @smoke
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make          | model          | location        | price    |
      | Audi          | A8             | QLD - Brisbane  | $80,000  |
      | Honda         | CR-V           | VIC - Melbourne | $30,000  |
      | BMW           | 7 Series       | NSW - Sydney    | $70,000  |
      | Hyundai       | Genesis        | QLD - All       | $80,000  |
      | Kia           | Grand Carnival | WA - Perth      | $40,000  |
      | Audi          | Q7             | QLD - Brisbane  | $100,000 |
      | Mercedes-Benz | Any Model      | NSW - Sydney    | $100,000 |
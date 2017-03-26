Feature: First feature

  Scenario Outline: First scenario
    Given epam main page is opened
    When I hover over the <button>
    Then I check <crumbs>

    Examples:
      | button           | crumbs                        |
      | Core Engineering | HomeSolutionsCore Engineering |
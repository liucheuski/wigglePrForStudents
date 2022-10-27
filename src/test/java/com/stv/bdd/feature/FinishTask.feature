Feature: Finish task

  Scenario: start
    Given main page is opened
    Then accept cookies

  Scenario Outline: Change region & language, currency and delivery destination
    When flag is displayed "<flag>"
    Then click flag
    When locale selector block is displayed
    Then select regionAndLanguage "<regionAndLanguage>"
    And select currency "<currency>"
    And select delivery destination "<deliveryDestination>"
    When click update
    Then accept cookies
    Then check that flag has changed "<flag>"
    And check that currency has changed "<currencySymbol>"
    When click cart
    Then check that cart has opened
    And cart is empty
    Examples:
      | regionAndLanguage | currency                  | currencySymbol | deliveryDestination | flag         |
      | UK - English      | GBP United Kingdom Pounds | £              | United Kingdom      | flag flag-GB |
      | US - English      | USD United States Dollars | $              | USA                 | flag flag-US |

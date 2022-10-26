Feature: Finish task

  Scenario Outline: Change region & language, currency and delivery destination
    Examples:
      | region&language | currency                  | deliveryDestination | flag         |
      | US - English    | USD United States Dollars | USA                 | flag flag-US |
      | UK - English    | GBP United Kingdom Pounds | United Kingdom      | flag flag-GB |

Feature: Login to account

  Scenario: Open login page
    Given main page is opened
    When click login link
    Then login page is opened

  Scenario Outline: Input email address (login) to field "Email address"
    When  type email address "<email>"
    Then characters types correct "<email>"
    Then clear email input
    Examples:
      | email            |
      | 123456789        |
      | weirbgeirvbiuer  |
      | !%#$&!$#)$@$_+$+ |

  Scenario Outline: Appears helper text for email address input
    When type email address "<email>"
    When click to login form
    Then is helper text
    Then clear email input
    Examples:
      | email     |
      | weefew    |
      | 23234     |
      | wrfwvw@wf |

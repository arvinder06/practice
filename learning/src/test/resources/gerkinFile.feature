Feature: Launch Browser

@test
  Scenario: Launch Browser Scenario
    Given I have open browser "chrome" using grid "http://10.126.146.60:4444/wd/hub"
    And I have launch "google" website
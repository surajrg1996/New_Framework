Feature: WebPage tab verification

  Background: 
    Given user already logged in to Application
      | username           | password    |
      | prati05m@gmail.com | Nandini@123 |

  Scenario: Webpage main tab verfication
    Given user already logged in
    And get all tab details
    Then verfiy all tab working

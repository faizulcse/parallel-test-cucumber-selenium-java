@account
Feature: Create a new account

  @test-1
  Scenario: As a test engineer I can create a new account
    When I create a new account on web using API call
    Then I should see that a new account is created successfully on web

  @test-2
  Scenario: As a test engineer I can create a new account
    When I create a new account on web using API call
    Then I should see that a new account is created successfully on web
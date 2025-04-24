@LoginPage
  Feature: Login Page Test Scenarios

    @Check
    Scenario:Check Login Page Components
      When Click to Don't Allow Button
      When Click to MyAccount Symbol
      When Click to SignIn Button
      Then Check to SignIn Button is Available in Login Page
      Then Check E-Mail Box is Available in Login Page
      Then Check Password Box is Available in Login Page

    @WrongEmailAddress
    Scenario Outline: Wrong E-mail address
      When Click to Don't Allow Button
      When Click to MyAccount Symbol
      When Click to SignIn Button
      When Write Wrong Email Address
      When Write Password
      Then Check to "<Error>" Message About E-mail
      Examples:
        |Error|
        |Geçerli bir e-posta adresi girmelisin.|

    @WrongPhoneNumber
    Scenario Outline: Wrong Phone Number
      When Click to Don't Allow Button
      When Click to MyAccount Symbol
      When Click to SignIn Button
      When Click to SignInWithPhoneNumber Button
      When Write Wrong Phone Number
      When Click to SignIn Button in Login Page
      Then Check to "<Error>" Message About Phone Number
      Examples:
        |Error|
        |Geçerli bir telefon numarası girmelisin.|

    @CorrectEmailandWrongPassword
    Scenario Outline: Correct E-mail and Wrong Password
      When Click to Don't Allow Button
      When Click to MyAccount Symbol
      When Click to SignIn Button
      When Write Correct E-mail Address
      When Write Password
      When Click to SignIn Button in Login Page
      Then Check to "<Error>" Message About Login
      Examples:
        |Error|
        |E-posta adresi veya şifre hatalı.|






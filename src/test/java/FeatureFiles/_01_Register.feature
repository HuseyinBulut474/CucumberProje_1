#Senaryo;
  #1- Para Bank sitesinde bir hesap açınız
  #2- Hesabın açıldığını “Your account was created successfully. You are now logged in.”mesajını doğrulayınız.
  #3- register oldugunuzu dogrulayin

#Create an firstname as "techno" lastname as "study" address as "Java" city as "Selenium" state as "Maven" zipcode as "12345 ssn as "111111111"
#When username as "grup22" password as "12345" confirm as "12345"

  Feature: Register Functionality

    Scenario: Register to ParaBank with valid username and password

      Given Navigate to ParaBank
      When Input register data
      Then User should register successfully
#Senaryo;
  #1- Para Bank sitesine geçerli kullanıcı bilgileriyle giriş yapınız ve Login olduğunuzu
  #doğrulayınız
  #2- Para Bank sitesine geçersiz kullanıcı bilgileriyle giriş yapınız ve login olmadığınızı
  #doğrulayınız. (Username ve password için ayrı ayrı deneyin)


Feature: Login Functionality

  Scenario Outline: Login to ParaBank with valid username and password

    Given Navigate to ParaBank
    When Input login username as "<username>" password as "<password>"
    Then success message should be displayed
    Examples:
      | username | password |
      | grup2245  |123456|


  Scenario Outline: Login to ParaBank with invalid username and password

    Given Navigate to ParaBank
    When Input login username as "<username>" password as "<password>"
    Then error message should be displayed


    Examples:
      | username |password|
      | grup222  |12345|
      | grup22  |123456|
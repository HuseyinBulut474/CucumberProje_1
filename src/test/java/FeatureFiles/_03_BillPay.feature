#Senaryo;
  #1- Bill Pay sayfasına gidiniz
  #2- Elektrik (85), Su (45), Doğalgaz (120) faturalarını ödeyiniz
  #NOT: Her fatura için farklı veri kullanınız.
  #3- Her ödemeden sonra faturanın ödendiğini doğrulayınız


Feature: BillPay Functionality

  Background:
    Given Navigate to ParaBank
    When Input login username as "grup2245" password as "123456"
    Then success message should be displayed


  Scenario Outline: Bills pay

    Given Click to Bill Pay
    When Input bill payeename as "<payeename>" address as "<street>" city as "<city>" state as "<state>" zipcode as "<zipcode>" phone as "<phone>" account as "18450" verify account as "18450" amount as "<amount>"
    Then paid message should be displayed

    Examples:
      | payeename |street    | city    |state    | zipcode  |phone   |amount|
      | Elektrik  |Esenler    | Istanbul| Turkiye |12345     | 123456 | 85   |
      | Su        |Bagcilar   |  Ankara | Almanya |56789     | 456789 | 45   |
      | Doglgaz   |Sultanbeyli|  Izmir  | Hollanda|14785     | 147852 | 120  |







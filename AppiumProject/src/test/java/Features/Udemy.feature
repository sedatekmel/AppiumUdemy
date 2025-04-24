Feature: Udemy Mobil App
  Scenario: Udemy Uygulamasinda Yazilim Kurslari Arama
    Given Udemy Uygulamasini ac
    When Arama kutucuguna tikla
    When Yazilim Testi yaz ve ara
    Then Yazilim Testi Kurslarinin Geldigini Kontrol et.
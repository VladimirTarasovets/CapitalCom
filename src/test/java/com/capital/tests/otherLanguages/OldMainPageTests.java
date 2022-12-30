//package com.capital.tests.otherLanguages;
//
//import com.capital.pageObject.HeaderPage;
//import com.capital.pageObject.OldMainPage;
//import com.codeborne.selenide.Condition;
//import com.codeborne.selenide.Configuration;
//import com.codeborne.selenide.logevents.SelenideLogger;
//import io.qameta.allure.Step;
//import io.qameta.allure.selenide.AllureSelenide;
//import org.junit.jupiter.api.*;
//
//import java.time.Duration;
//
//import static com.capital.pageObject.HeaderPage.COOKIE;
//import static com.codeborne.selenide.Selenide.*;
//
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class OldMainPageTests {
//    OldMainPage oldMainPage = new OldMainPage();
//    HeaderPage headerPage = new HeaderPage();
//
//    @BeforeAll
//    @Step("Открытие главной страницы сайта")
//    public void setUp() {
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true));
//        Configuration.headless = true;
////        Configuration.browserSize = "1920x1080";
//        open("https://capital.com/");
//        headerPage.languageСhoiceAR();
//        headerPage.licenceСhoiceASIC();
//        oldMainPage.scroll();
//        COOKIE.shouldBe(Condition.visible, Duration.ofSeconds(7)).click();
//    }
//
//    @AfterAll
//    @Step("Закрытие браузера")
//    public void tearDown() {
//        closeWebDriver();
//    }
//
//    @Test
//    @Order(1)
//    @DisplayName("Checking the appearance of the SignUp form in the main banner when clicking on the Create Account button")
//    public void checkSignUPFormClickBtnCreateAccountMainBanner(){
//        oldMainPage.clickBtnCreateAccountMain();
//        oldMainPage.checkSignUpForm();
//    }
//
//    @Test
//    @Order(2)
//    @DisplayName("Checking the appearance of the SignUp form in the main banner when clicking on the Try Demo button")
//    public void checkSignUPFormClickBtnTryDemoMainBanner(){
//        oldMainPage.clickBtnTryDemo();
//        oldMainPage.checkSignUpForm();
//    }
//
//    @Test
//    @Order(3)
//    @DisplayName("Checking the Trade buttons for the appearance of the SignUp form in the interactive widget table. Most Trade")
//    public void checkSignUPFormInTheInteractiveWidgetTableMTR(){
//        oldMainPage.checkTabsNav_MTR();
//    }
//
//    @Test
//    @Order(4)
//    @DisplayName("Checking the Trade buttons for the appearance of the SignUp form in the interactive widget table. Commodities")
//    public void checkSignUPFormInTheInteractiveWidgetTableCOM(){
//        oldMainPage.checkTabsNav_COM();
//    }
//
//    @Test
//    @Order(5)
//    @DisplayName("Checking the Trade buttons for the appearance of the SignUp form in the interactive widget table. Indices")
//    public void checkSignUPFormInTheInteractiveWidgetTableIND(){
//        oldMainPage.checkTabsNav_IND();
//    }
//
//    @Test
//    @Order(6)
//    @DisplayName("Checking the Trade buttons for the appearance of the SignUp form in the interactive widget table. Crypto")
//    public void checkSignUPFormInTheInteractiveWidgetTableCRYP(){
//        oldMainPage.checkTabsNav_CRYP();
//    }
//
//    @Test
//    @Order(7)
//    @DisplayName("Checking the Trade buttons for the appearance of the SignUp form in the interactive widget table. Shares")
//    public void checkSignUPFormInTheInteractiveWidgetTableSHAR(){
//        oldMainPage.checkTabsNav_SHAR();
//    }
//
//    @Test
//    @Order(8)
//    @DisplayName("Checking the Trade buttons for the appearance of the SignUp form in the interactive widget table. Forex")
//    public void checkSignUPFormInTheInteractiveWidgetTableFX(){
//        oldMainPage.checkTabsNav_FX();
//    }
//
//    @Test
//    @Order(9)
//    @DisplayName("Checking the Trade buttons for the appearance of the SignUp form in the interactive widget table. ETFs")
//    public void checkSignUPFormInTheInteractiveWidgetTableETFs(){
//        oldMainPage.checkTabsNav_ETF();
//    }
//
//    @Test
//    @Order(10)
//    @DisplayName("Checking the appearance of the SignUp form when clicking on the Trade Now button")
//    public void checkSignUPFormClickBtnTradeNow(){
//        oldMainPage.clickBtnTradeNow();
//        oldMainPage.checkSignUpForm();
//    }
//
//    @Test
//    @Order(11)
//    @DisplayName("Checking the appearance of the SignUp form when clicking on the Create Account button")
//    public void checkSignUPFormClickBtnCreateAccount(){
//        oldMainPage.clickBtnCreateAccount();
//        oldMainPage.checkSignUpForm();
//    }
//
//    @Test
//    @Order(12)
//    @DisplayName("Checking the appearance of the SignUp form when clicking on the Try Now button")
//    public void checkSignUPFormClickBtnTryNow(){
//        oldMainPage.clickBtnTryNow();
//        oldMainPage.checkSignUpForm();
//    }
//
//    @Test
//    @Order(13)
//    @DisplayName("Checking the appearance of the SignUp form when clicking on the Create Account button")
//    public void checkSignUPFormClickBtnCreateAccountEconomic(){
//        oldMainPage.clickBtnCreateAccountEconomic();
//        oldMainPage.checkSignUpForm();
//    }
//
//    @Test
//    @Order(14)
//    @DisplayName("Checking the appearance of the SignUp form when clicking on the Practice for free button")
//    public void checkSignUPFormClickBtnPracticeForFree(){
//        oldMainPage.clickBtnPracticeForFree();
//        oldMainPage.checkSignUpForm();
//    }
//
//    @Test
//    @Order(15)
//    @DisplayName("Checking the appearance of the SignUp form when clicking on the Practice for free button")
//    public void checkSignUPFormClickBtnCreateAccountStatistics(){
//        oldMainPage.clickBtnCreateAccountStatistics();
//        oldMainPage.checkSignUpForm();
//    }
//}

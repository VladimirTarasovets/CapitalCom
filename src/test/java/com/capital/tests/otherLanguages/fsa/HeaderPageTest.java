package com.capital.tests.otherLanguages.fsa;

import com.capital.pageObject.HeaderPage;
import com.capital.tests.otherLanguages.Base;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Checking the appearance of the Login and SignUp fields in the site header. FSA")
public class HeaderPageTest extends Base {
    HeaderPage headerPage = new HeaderPage();

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/FSA.csv")
    @Order(1)
    @DisplayName("Checking the appearance of the Login field when clicking on the Login button")
    public void checkLogin(String license, String logLicense){
        open("https://capital.com/" + license);
        String indexLanguage = logLicense;
        headerPage.loginFieldFormAppears();
    }

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/FSA.csv")
    @Order(2)
    @DisplayName("Checking the appearance of the SignUp field when clicking on the TradeNow button")
    public void checkSingUp(String license, String logLicense){
        open("https://capital.com/" + license);
        String indexLanguage = logLicense;
        headerPage.singUpFieldFormAppears();
    }
}

package com.capital.tests.language.param;

import com.capital.pageObject.OldMainPage;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Checking the appearance of the SignUp form when clicking on the Trade Now button")
public class TestTradeNowBtn {
    OldMainPage oldMainPage = new OldMainPage();

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/ASIC.csv")
    @DisplayName("Check")
    public void checkSignUPFormClickBtnTradeNow(String license, String logLicense){
        open("https://capital.com/" + license);
        String indexLanguage = logLicense;
        oldMainPage.clickBtnTradeNow();
        oldMainPage.checkSignUpForm();
    }
}

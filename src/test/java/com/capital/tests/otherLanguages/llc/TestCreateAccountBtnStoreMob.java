package com.capital.tests.otherLanguages.llc;

import com.capital.pageObject.OldMainPage;
import com.capital.tests.otherLanguages.Base;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Checking the appearance of the SignUp form when clicking on the Create Account button(StoreMob). LLC")
public class TestCreateAccountBtnStoreMob extends Base {
    OldMainPage oldMainPage = new OldMainPage();


    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/LLC.csv")
    @DisplayName("Check")
    public void checkSignUPFormClickBtnCreateAccountEconomic(String license, String logLicense){
        open("https://capital.com/" + license);
        String indexLanguage = logLicense;
        oldMainPage.clickBtnCreateAccountEconomic();
        oldMainPage.checkSignUpForm();
    }
}
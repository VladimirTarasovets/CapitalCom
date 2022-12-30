package com.capital.tests.otherLanguages.fsa;

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
@DisplayName("Checking the appearance of the SignUp form when clicking on the Practice for free button(Statistics). FSA")
public class TestPracticeForFreeBtnStatistics extends Base {
    OldMainPage oldMainPage = new OldMainPage();

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/FSA.csv")
    @DisplayName("Check")
    public void checkSignUPFormClickBtnCreateAccountStatistics(String license, String logLicense){
        open("https://capital.com/" + license);
        String indexLanguage = logLicense;
        oldMainPage.clickBtnCreateAccountStatistics();
        oldMainPage.checkSignUpForm();
    }
}

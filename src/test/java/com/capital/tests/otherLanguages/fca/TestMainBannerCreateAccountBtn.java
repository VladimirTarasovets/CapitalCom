package com.capital.tests.otherLanguages.fca;

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
@DisplayName("Checking the appearance of the SignUp form in the main banner when clicking on the Create Account button. FCA")
public class TestMainBannerCreateAccountBtn extends Base {
    OldMainPage oldMainPage = new OldMainPage();

    @ParameterizedTest(name = "Check. {1}")
    @CsvFileSource(resources = "/FCA.csv")
    public void checkSignUPFormClickBtnCreateAccountMainBanner(String license, String logLicense){
        open("https://capital.com/" + license);
        String indexLanguage = logLicense;
        oldMainPage.clickBtnCreateAccountMain();
        oldMainPage.checkSignUpForm();
    }
}

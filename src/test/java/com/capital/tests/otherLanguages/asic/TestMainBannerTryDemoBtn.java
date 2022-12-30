package com.capital.tests.otherLanguages.asic;

import com.capital.pageObject.OldMainPage;
import com.capital.tests.otherLanguages.Base;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Checking the appearance of the SignUp form in the main banner when clicking on the Try Demo button. ASIC")
public class TestMainBannerTryDemoBtn extends Base {
    OldMainPage oldMainPage = new OldMainPage();

    @ParameterizedTest(name = "Check. {1}")
    @CsvFileSource(resources = "/ASIC.csv")
    public void checkSignUPFormClickBtnTryDemoMainBanner(String license, String logLicense){
        open("https://capital.com/" + license);
        String indexLanguage = logLicense;
        oldMainPage.clickBtnTryDemo();
        oldMainPage.checkSignUpForm();
    }
}

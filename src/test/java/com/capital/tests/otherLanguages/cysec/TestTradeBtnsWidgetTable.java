package com.capital.tests.otherLanguages.cysec;

import com.capital.pageObject.OldMainPage;
import com.capital.tests.otherLanguages.Base;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Checking the Trade buttons for the appearance of the SignUp form in the interactive widget table. CYSEC")
public class TestTradeBtnsWidgetTable extends Base {
    OldMainPage oldMainPage = new OldMainPage();

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/CYSEC.csv")
    @Order(1)
    @DisplayName("Most Trade")
    public void checkSignUPFormInTheInteractiveWidgetTableMTR(String license, String logLicense){
        open("https://capital.com/" + license);
        String indexLanguage = logLicense;
        oldMainPage.checkTabsNav_MTR();
    }

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/CYSEC.csv")
    @Order(2)
    @DisplayName("Commodities")
    public void checkSignUPFormInTheInteractiveWidgetTableCOM(String license, String logLicense){
        open("https://capital.com/" + license);
        String indexLanguage = logLicense;
        oldMainPage.checkTabsNav_COM();
    }

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/CYSEC.csv")
    @Order(3)
    @DisplayName("Indices")
    public void checkSignUPFormInTheInteractiveWidgetTableIND(String license, String logLicense){
        open("https://capital.com/" + license);
        String indexLanguage = logLicense;
        oldMainPage.checkTabsNav_IND();
    }

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/CYSEC.csv")
    @Order(4)
    @DisplayName("Crypto")
    public void checkSignUPFormInTheInteractiveWidgetTableCRYP(String license, String logLicense){
        open("https://capital.com/" + license);
        String indexLanguage = logLicense;
        oldMainPage.checkTabsNav_CRYP();
    }

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/CYSEC.csv")
    @Order(5)
    @DisplayName("Shares")
    public void checkSignUPFormInTheInteractiveWidgetTableSHAR(String license, String logLicense){
        open("https://capital.com/" + license);
        String indexLanguage = logLicense;
        oldMainPage.checkTabsNav_SHAR();
    }

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/CYSEC.csv")
    @Order(6)
    @DisplayName("Forex")
    public void checkSignUPFormInTheInteractiveWidgetTableFX(String license, String logLicense){
        open("https://capital.com/" + license);
        String indexLanguage = logLicense;
        oldMainPage.checkTabsNav_FX();
    }

    @ParameterizedTest(name = "{displayName}. {1}")
    @CsvFileSource(resources = "/CYSEC.csv")
    @Order(7)
    @DisplayName("ETFs")
    public void checkSignUPFormInTheInteractiveWidgetTableETFs(String license, String logLicense){
        open("https://capital.com/" + license);
        String indexLanguage = logLicense;
        oldMainPage.checkTabsNav_ETF();
    }
}

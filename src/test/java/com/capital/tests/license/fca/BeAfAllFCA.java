package com.capital.tests.license.fca;

import com.capital.pageObject.HeaderPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BeAfAllFCA {
    HeaderPage headerPage = new HeaderPage();

    @BeforeAll
    @Step("Открытие главной страницы сайта")
    public void setUp() {
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true));
        Configuration.headless = true;
//        Configuration.browserSize = "1920x1080";
        open("https://capital.com/");
        headerPage.languageСhoiceEN();
        headerPage.licenceСhoiceFCA();
    }

    @AfterAll
    @Step("Закрытие браузера")
    public void tearDown() {
        closeWebDriver();
    }
}

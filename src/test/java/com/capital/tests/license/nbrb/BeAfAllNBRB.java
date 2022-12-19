package com.capital.tests.license.nbrb;

import com.capital.pageObject.HeaderPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BeAfAllNBRB {
    HeaderPage headerPage = new HeaderPage();

    @BeforeEach
    @Step("Открытие главной страницы сайта")
    public void setUp() {
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true));
        Configuration.headless = true;
//        Configuration.browserSize = "1920x1080";
        open("https://capital.com/");
        headerPage.languageСhoiceEN();
        headerPage.licenceСhoiceNBRB();
    }

    @AfterEach
    @Step("Закрытие браузера")
    public void tearDown() {
        closeWebDriver();
    }
}

package com.capital.tests.license.nbrb;

import com.capital.pageObject.HeaderPage;
import com.capital.pageObject.MainPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;

public class BeAfAllNBRB {
    HeaderPage headerPage = new HeaderPage();
    MainPage mainPage = new MainPage();

    @BeforeAll
    @Step("Открытие главной страницы сайта")
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true));
        Configuration.headless = true;
//        Configuration.browserSize = "1920x1080";
        open("https://capital.com/");
        headerPage.languageСhoiceEN();
        headerPage.licenceСhoiceNBRB();
        mainPage.scroll();
        sleep(1000);
        headerPage.COOKIE.shouldBe(Condition.visible).click();
    }

    @AfterAll
    @Step("Закрытие браузера")
    public void tearDown() {
        closeWebDriver();
    }
}

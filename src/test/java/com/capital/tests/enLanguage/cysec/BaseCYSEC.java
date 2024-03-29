package com.capital.tests.enLanguage.cysec;

import com.capital.pageObject.HeaderPage;
import com.capital.pageObject.MainPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static com.capital.pageObject.HeaderPage.COOKIE;
import static com.codeborne.selenide.Selenide.*;

public class BaseCYSEC {
    HeaderPage headerPage = new HeaderPage();
    MainPage mainPage = new MainPage();

    @BeforeAll
    @Step("Opening the main page of the site")
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true));
        Configuration.headless = true;
        open("https://capital.com/");
        headerPage.languageСhoiceEN();
        headerPage.licenceСhoiceCYSEC();
        mainPage.scroll();
        COOKIE.shouldBe(Condition.visible, Duration.ofSeconds(7)).click();
    }

    @AfterAll
    @Step("Closing the browser")
    public void tearDown() {
        closeWebDriver();
    }
}

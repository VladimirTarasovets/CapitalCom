package com.capital.tests.otherLanguages;

import com.capital.pageObject.OldMainPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static com.capital.pageObject.HeaderPage.COOKIE;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Base {

    OldMainPage oldMainPage = new OldMainPage();

    @BeforeAll
    @Step("Открытие главной страницы сайта")
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true));
        Configuration.headless = true;
        open("https://capital.com/");
        oldMainPage.scroll();
        COOKIE.shouldBe(Condition.visible, Duration.ofSeconds(7)).click();
    }

    @AfterAll
    @Step("Закрытие браузера")
    public void tearDown() {
        closeWebDriver();
    }

}

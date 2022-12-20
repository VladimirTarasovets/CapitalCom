package com.capital.pageObject;

import com.codeborne.selenide.*;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class HeaderPage {

    private static final SelenideElement MENU = $(byCssSelector(".cc-header__btn.cc-header__btn--burger.js-burger"));
    private static final SelenideElement HEADER_LOGO = $(byCssSelector("div.cc-header__logowrap.flex > a"));

    private static final SelenideElement LANGUAGE_BTN = $(byCssSelector(".cc-header__btn.cc-header__btn--lng.showLg.js-langSwitch"));
    private static final SelenideElement EN = $(byCssSelector(".cc-flags.cc-flags--gb"));
    private static final SelenideElement AR = $(byCssSelector(".cc-flags.cc-flags--ab"));
    private static final SelenideElement ID = $(byCssSelector(".cc-flags.cc-flags--id"));
    private static final SelenideElement BG = $(byCssSelector(".cc-flags.cc-flags--bg"));
    private static final SelenideElement CZ = $(byCssSelector(".cc-flags.cc-flags--cz"));
    private static final SelenideElement DA = $(byCssSelector(".cc-flags.cc-flags--dk"));
    private static final SelenideElement DE = $(byCssSelector(".cc-flags.cc-flags--de"));
    private static final SelenideElement ET = $(byCssSelector(".cc-flags.cc-flags--ee"));
    private static final SelenideElement EL = $(byCssSelector(".cc-flags.cc-flags--gr"));
    private static final SelenideElement ES = $(byCssSelector(".cc-flags.cc-flags--es"));
    private static final SelenideElement FR = $(byCssSelector(".cc-flags.cc-flags--fr"));
    private static final SelenideElement HR = $(byCssSelector(".cc-flags.cc-flags--hr"));
    private static final SelenideElement IT = $(byCssSelector(".cc-flags.cc-flags--it"));
    private static final SelenideElement LV = $(byCssSelector(".cc-flags.cc-flags--lv"));
    private static final SelenideElement LT = $(byCssSelector(".cc-flags.cc-flags--lt"));
    private static final SelenideElement HU = $(byCssSelector(".cc-flags.cc-flags--hu"));
    private static final SelenideElement NL = $(byCssSelector(".cc-flags.cc-flags--nl"));
    private static final SelenideElement PL = $(byCssSelector(".cc-flags.cc-flags--pl"));
    private static final SelenideElement PT = $(byCssSelector(".cc-flags.cc-flags--pt"));
    private static final SelenideElement RO = $(byCssSelector(".cc-flags.cc-flags--ro"));
    private static final SelenideElement RU = $(byCssSelector(".cc-flags.cc-flags--ru"));
    private static final SelenideElement SK = $(byCssSelector(".cc-flags.cc-flags--sk"));
    private static final SelenideElement SL = $(byCssSelector(".cc-flags.cc-flags--si"));
    private static final SelenideElement FI = $(byCssSelector(".cc-flags.cc-flags--fi"));
    private static final SelenideElement SV = $(byCssSelector(".cc-flags.cc-flags--se"));
    private static final SelenideElement VI = $(byCssSelector(".cc-flags.cc-flags--vn"));
    private static final SelenideElement TH = $(byCssSelector(".cc-flags.cc-flags--th"));
    private static final SelenideElement ZH = $(byCssSelector(".cc-flags.cc-flags--zn"));
    private static final SelenideElement CN = $(byCssSelector(".cc-flags.cc-flags--cn"));

    private static final SelenideElement LICENCE_BTN = $(byCssSelector(".cc-toggleLicense__btn"));
    private static final SelenideElement LICENCE_ASIC = $(byXpath("//a[@href='https://capital.com/?license=ASIC']"));
    private static final SelenideElement LICENCE_FCA = $(byXpath("//a[@href='https://capital.com/?license=FCA']"));
    private static final SelenideElement LICENCE_CYSEC = $(byXpath("//a[@href='https://capital.com/?license=CYSEC']"));
    private static final SelenideElement LICENCE_NBRB = $(byXpath("//a[@href='https://capital.com/?license=NBRB']"));
    private static final SelenideElement LICENCE_CCSTV = $(byXpath("//a[@href='https://capital.com/?license=CCSTV']"));
    private static final SelenideElement LICENCE_SEY = $(byXpath("//a[@href='https://capital.com/?license=SEY']"));


    private static final SelenideElement LOGIN = $(byCssSelector("#wg_loginBtn"));

    private static final SelenideElement TRADE_NOW = $(byCssSelector(".cc-header__signup.btn.btn--sm.btn--darkText.hideSm.js_signup"));
    private static final SelenideElement CHECK_LOGIN_FORM = $(byCssSelector("#l_f_email"));
    private static final SelenideElement CLOSE_LOGIN_UP_FORM = $(byCssSelector(".button-cleared.small.l_cancel"));
    private static final SelenideElement CHECK_SING_UP_FORM = $(byCssSelector(".signup-form"));
    private static final SelenideElement CLOSE_SING_UP_FORM = $(byCssSelector(".button-cleared.small.s_cancel"));


    @Step("Выбор языка English")
    public void languageСhoiceEN (){
        LANGUAGE_BTN.click();
        EN.click();
    }

    @Step("Выбор языка Русский")
    public void languageСhoiceRU (){
        LANGUAGE_BTN.click();
        RU.click();
    }

    @Step("Выбор лицензии ASIC")
    public void licenceСhoiceASIC (){
        LICENCE_BTN.click();
        LICENCE_ASIC.click();
    }

    @Step("Выбор лицензии FCA")
    public void licenceСhoiceFCA (){
        LICENCE_BTN.click();
        LICENCE_FCA.click();
    }

    @Step("Выбор лицензии CYSEC")
    public void licenceСhoiceCYSEC (){
        LICENCE_BTN.click();
        LICENCE_CYSEC.click();
    }

    @Step("Выбор лицензии NBRB")
    public void licenceСhoiceNBRB (){
        LICENCE_BTN.click();
        LICENCE_NBRB.click();
    }

    @Step("Выбор лицензии CCSTV")
    public void licenceСhoiceCCSTV (){
        LICENCE_BTN.click();
        LICENCE_CCSTV.click();
    }

    @Step("Выбор лицензии SEY")
    public void licenceСhoiceSEY (){
        LICENCE_BTN.click();
        LICENCE_SEY.click();
    }

    @Step("Появление поля Login при клике на кнопку Login в header сайта")
    public void loginFieldFormAppears (){
        LOGIN.click();
        CHECK_LOGIN_FORM.shouldBe(Condition.visible);
        CLOSE_LOGIN_UP_FORM.click();
    }

    @Step("Появление поля SignUp при клике на кнопку TradeNow в header сайта")
    public void singUpFieldFormAppears (){
        TRADE_NOW.click();
        CHECK_SING_UP_FORM.shouldBe(Condition.visible);
        CLOSE_SING_UP_FORM.click();
    }

}

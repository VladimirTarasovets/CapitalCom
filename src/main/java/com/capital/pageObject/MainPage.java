package com.capital.pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    // для ASIC
    private static final SelenideElement BANNER_CFD_ASIC = $(byXpath("//button[@data-type='topbanner_cfd_aud_slider']"));
    private static final SelenideElement BANNER_CFD_BTN_TRADE_NOW_ASIC = $(byXpath("//a[@data-type='topbanner_cfd_aud']"));
    private static final SelenideElement BANNER_CFD_BTN_PRACTISE_FOR_FREE_ASIC = $(byXpath("//a[@data-type='topbanner_cfd_aud_demo']"));

    private static final SelenideElement BANNER_PRO_ASIC = $(byXpath("//button[@data-type='topbanner_pro_au_slider']"));
    private static final SelenideElement BANNER_PRO_START_TRADING = $(byXpath("//a[@data-type='topbanner_pro_au_demo']"));
    //
    // CYSEC
    private static final SelenideElement SCROLL_ELM = $(byCssSelector(".bannersHome__nav.flex.flex-between.js-bannersHome-nav"));

    private static final SelenideElement BANNER_CFD = $(byXpath("//button[@data-type='topbanner_cfd_slider']"));
    private static final SelenideElement BANNER_CFD_BTN_TRADE_NOW = $(byXpath("//a[@data-type='topbanner_cfd']"));
    private static final SelenideElement BANNER_CFD_BTN_PRACTISE_FOR_FREE = $(byXpath("//a[@data-type='topbanner_cfd_demo']"));

    private static final SelenideElement BANNER_BEST_PLATFORM = $(byXpath("//button[@data-type='topbanner_best_platform_22_slider']"));
    private static final SelenideElement BANNER_BEST_PLATFORM_START_TRADING = $(byXpath("//a[@data-type='topbanner_best_platform_22']"));
    private static final SelenideElement BANNER_BEST_PLATFORM_PRACTISE_FOR_FREE = $(byXpath("//a[@data-type='topbanner_best_platform_22_demo']"));

    private static final SelenideElement BANNER_ESG = $(byXpath("//button[@data-type='topbanner_esg_slider']"));
    private static final SelenideElement BANNER_TRADINGVIEW = $(byXpath("//button[@data-type='banner-tradingview_slider']"));

    private static final SelenideElement CHECK_SING_UP_FORM = $(byCssSelector(".signup-form"));
    private static final SelenideElement CLOSE_SING_UP_FORM = $(byCssSelector(".button-cleared.small.s_cancel"));

    private static final ElementsCollection COLLECTION_TRADE = $$(byXpath("//tbody[@class='tabs__pane active']//a[@data-type='wdg_markets']"));

    // OLD design
//    private static final SelenideElement TABS_NAV_MTR = $(byXpath("//div[@class='tab-list ']/a[@data-type='Most']"));
//    private static final SelenideElement TABS_NAV_COM = $(byXpath("//div[@class='tab-list ']/a[@data-type='Commodities']"));
//    private static final SelenideElement TABS_NAV_IND = $(byXpath("//div[@class='tab-list ']/a[@data-type='Indices']"));
//    private static final SelenideElement TABS_NAV_CRYP = $(byXpath("//div[@class='tab-list ']/a[@data-type='Crypto']"));
//    private static final SelenideElement TABS_NAV_SHAR = $(byXpath("//div[@class='tab-list ']/a[@data-type='Shares']"));
//    private static final SelenideElement TABS_NAV_FX = $(byXpath("//div[@class='tab-list ']/a[@data-type='Forex']"));
//    private static final SelenideElement TABS_NAV_ETF = $(byXpath("//div[@class='tab-list ']/a[@data-type='ETFs']"));
    // NEW design
    private static final SelenideElement TABS_NAV_MTR = $(byXpath("//li[@data-tab-control='mtr']"));
    private static final SelenideElement TABS_NAV_COM = $(byXpath("//li[@data-tab-control='com']"));
    private static final SelenideElement TABS_NAV_IND = $(byXpath("//li[@data-tab-control='ind']"));
    private static final SelenideElement TABS_NAV_CRYP = $(byXpath("//li[@data-tab-control='cryp']"));
    private static final SelenideElement TABS_NAV_SHAR = $(byXpath("//li[@data-tab-control='shar']"));
    private static final SelenideElement TABS_NAV_FX = $(byXpath("//li[@data-tab-control='fx']"));
    private static final SelenideElement TABS_NAV_ETF = $(byXpath("//li[@data-tab-control='etf']"));


    // для ASIC
    @Step("Выбор банера CFD")
    public void choiceBannerCFD_ASIC (){
        BANNER_CFD_ASIC.click();
    }

    @Step("Клик по кнопке Trade Now")
    public void clickBtnTN_ASIC (){
        BANNER_CFD_BTN_TRADE_NOW_ASIC.click();
    }

    @Step("Клик по кнопке Practise for free")
    public void clickBtnPFF_CFD_ASIC (){
        BANNER_CFD_BTN_PRACTISE_FOR_FREE_ASIC.click();
    }

    @Step("Выбор банера Discover Pro Trading")
    public void choiceBannerPRO (){
        BANNER_PRO_ASIC.click();
    }

    @Step("Клик по кнопке Start Trading")
    public void clickBtnSTPRO (){
        BANNER_PRO_START_TRADING.click();
    }
    //

    @Step("Выбор банера CFD")
    public void choiceBannerCFD (){
        BANNER_CFD.click();
    }

    @Step("Клик по кнопке Trade Now")
    public void clickBtnTN (){
        BANNER_CFD_BTN_TRADE_NOW.click();
    }

    @Step("Клик по кнопке Practise for free")
    public void clickBtnPFF_CFD(){
        BANNER_CFD_BTN_PRACTISE_FOR_FREE.click();
    }

    @Step("Выбор банера Best Platform")
    public void choiceBannerBP (){
        BANNER_BEST_PLATFORM.click();
    }

    @Step("Клик по кнопке Start Trading")
    public void clickBtnST (){
        BANNER_BEST_PLATFORM_START_TRADING.click();
    }

    @Step("Клик по кнопке Practise for free")
    public void clickBtnPFF_BP (){
        BANNER_BEST_PLATFORM_PRACTISE_FOR_FREE.click();
    }

    @Step("Появление поля SignUp")
    public void checkSingUpForm() {
        CHECK_SING_UP_FORM.shouldBe(Condition.visible);
    }

    @Step("Проверка вкладки Most Traded")
    public void checkTabsNav_MTR () {
        SCROLL_ELM.scrollTo();
        TABS_NAV_MTR.click();
        for (SelenideElement selenideElement : COLLECTION_TRADE) {
                selenideElement.click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.click();
        }
    }
    @Step("Проверка вкладки Commodities")
    public void checkTabsNav_COM () {
        SCROLL_ELM.scrollTo();
        TABS_NAV_COM.click();
        for (SelenideElement selenideElement : COLLECTION_TRADE) {
                selenideElement.click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.click();
        }
    }
    @Step("Проверка вкладки Indices")
    public void checkTabsNav_IND () {
        SCROLL_ELM.scrollTo();
        TABS_NAV_IND.click();
        for (SelenideElement selenideElement : COLLECTION_TRADE) {
                selenideElement.click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.click();
        }
    }
    @Step("Проверка вкладки Crypto")
    public void checkTabsNav_CRYP () {
        SCROLL_ELM.scrollTo();
        TABS_NAV_CRYP.click();
        for (SelenideElement selenideElement : COLLECTION_TRADE) {
                selenideElement.click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.click();
        }
    }
    @Step("Проверка вкладки Shares")
    public void checkTabsNav_SHAR () {
        SCROLL_ELM.scrollTo();
        TABS_NAV_SHAR.click();
        for (SelenideElement selenideElement : COLLECTION_TRADE) {
                selenideElement.click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.click();
        }
    }
    @Step("Проверка вкладки Forex")
    public void checkTabsNav_FX () {
        SCROLL_ELM.scrollTo();
        TABS_NAV_FX.click();
        for (SelenideElement selenideElement : COLLECTION_TRADE) {
                selenideElement.click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.click();
        }
    }
    @Step("Проверка вкладки ETFs")
    public void checkTabsNav_ETF () {
        SCROLL_ELM.scrollTo();
        TABS_NAV_ETF.click();
        for (SelenideElement selenideElement : COLLECTION_TRADE) {
                selenideElement.click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.click();
        }
    }



}

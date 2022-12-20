package com.capital.pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.HoverOptions;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    // для ASIC
    private static final SelenideElement BANNER_CFD_ASIC = $(byXpath("//button[@data-type='topbanner_cfd_aud_slider']"));
    private static final SelenideElement BANNER_CFD_BTN_TRADE_NOW_ASIC = $(byXpath("//a[@data-type='topbanner_cfd_aud']"));
    private static final SelenideElement BANNER_CFD_BTN_PRACTISE_FOR_FREE_ASIC = $(byXpath("//a[@data-type='topbanner_cfd_aud_demo']"));

    private static final SelenideElement BANNER_PRO_ASIC = $(byXpath("//button[@data-type='topbanner_pro_au_slider']"));
    private static final SelenideElement BANNER_PRO_START_TRADING = $(byXpath("//a[@data-type='topbanner_pro_au_demo']"));
    //
    // FCA
    private static final SelenideElement BANNER_SPREAD_BETTING = $(byXpath("//button[@data-type='topbanner_spread_betting_slider']"));
    private static final SelenideElement BANNER_SPREAD_BETTING_OPEN_ACC = $(byXpath("//a[@data-type='topbanner_spread_betting']"));
    //
    // CYSEC and all
    private static final SelenideElement SCROLL_ELM_BANNER = $(byCssSelector(".bannersHome__nav.flex.flex-between.js-bannersHome-nav"));
    private static final SelenideElement SCROLL_ELM_MAIN_BANNER = $(byCssSelector(".bannersHome__wrap.cc-boxMd.grey"));

    private static final SelenideElement BANNER_CFD = $(byXpath("//button[@data-type='topbanner_cfd_slider']"));
    private static final SelenideElement BANNER_CFD_BTN_TRADE_NOW = $(byXpath("//a[@data-type='topbanner_cfd']"));
    private static final SelenideElement BANNER_CFD_BTN_PRACTISE_FOR_FREE = $(byXpath("//a[@data-type='topbanner_cfd_demo']"));

    private static final SelenideElement BANNER_BEST_PLATFORM = $(byXpath("//button[@data-type='topbanner_best_platform_22_slider']"));
    private static final SelenideElement BANNER_BEST_PLATFORM_START_TRADING = $(byXpath("//a[@data-type='topbanner_best_platform_22']"));
    private static final SelenideElement BANNER_BEST_PLATFORM_PRACTISE_FOR_FREE = $(byXpath("//a[@data-type='topbanner_best_platform_22_demo']"));

    private static final SelenideElement CHECK_SING_UP_FORM = $(byCssSelector(".signup-form"));
    private static final SelenideElement CLOSE_SING_UP_FORM = $(byCssSelector(".button-cleared.small.s_cancel"));

    private static final ElementsCollection COLLECTION_TRADE = $$(byXpath("//tbody[@class='tabs__pane active']//a[@data-type='wdg_markets']"));

    // OLD design
    private static final SelenideElement TABS_NAV_MTR = $(byXpath("//div[@class='tab-list ']/a[@data-type='Most']"));
    private static final SelenideElement TABS_NAV_COM = $(byXpath("//div[@class='tab-list ']/a[@data-type='Commodities']"));
    private static final SelenideElement TABS_NAV_IND = $(byXpath("//div[@class='tab-list ']/a[@data-type='Indices']"));
    private static final SelenideElement TABS_NAV_CRYP = $(byXpath("//div[@class='tab-list ']/a[@data-type='Crypto']"));
    private static final SelenideElement TABS_NAV_SHAR = $(byXpath("//div[@class='tab-list ']/a[@data-type='Shares']"));
    private static final SelenideElement TABS_NAV_FX = $(byXpath("//div[@class='tab-list ']/a[@data-type='Forex']"));
    private static final SelenideElement TABS_NAV_ETF = $(byXpath("//div[@class='tab-list ']/a[@data-type='ETFs']"));
    // NEW design
//    private static final SelenideElement TABS_NAV_MTR = $(byXpath("//li[@data-tab-control='mtr']"));
//    private static final SelenideElement TABS_NAV_COM = $(byXpath("//li[@data-tab-control='com']"));
//    private static final SelenideElement TABS_NAV_IND = $(byXpath("//li[@data-tab-control='ind']"));
//    private static final SelenideElement TABS_NAV_CRYP = $(byXpath("//li[@data-tab-control='cryp']"));
//    private static final SelenideElement TABS_NAV_SHAR = $(byXpath("//li[@data-tab-control='shar']"));
//    private static final SelenideElement TABS_NAV_FX = $(byXpath("//li[@data-tab-control='fx']"));
//    private static final SelenideElement TABS_NAV_ETF = $(byXpath("//li[@data-tab-control='etf']"));

    private static final SelenideElement SCROLL_ELM_STILL_LOOKING = $(byCssSelector(".regSteps.cc-boxLg.mainConstuctor__item.mainConstuctor__item--fullwidth.grey"));
    private static final SelenideElement CREATE_SL_BTN = $(byCssSelector(".regSteps__item.js_signup"));

    private static final SelenideElement SCROLL_ELM_SLIDER_FADE = $(byCssSelector(".worldMap.js-worldMap"));
    private static final ElementsCollection SLIDER_FADE_TRADE_BTN = $$(byCssSelector(".promoMarket__col.btn.btn--darkText.btn--sm.hideXs.js_signup"));

    private static final SelenideElement SCROLL_ELM_EXP_OUR = $(byCssSelector(".c-lg-5.c-md-6"));
    private static final SelenideElement EXP_OUR_PL_TRYN_BTN = $(byXpath("//div[@class='alignCenterToLeft js-analyticsVisible']/a[contains(text(),'Try now')]"));

    private static final SelenideElement SCROLL_ELM_PRACTISE_FF = $(byCssSelector(".cc-boxXl.newToTrading.grey"));
    private static final SelenideElement NEW_TO_TR_PRACTISE_FF_BTN = $(byCssSelector(".btn.js_signup.__cp_b.js-analyticsVisible"));

    private static final SelenideElement SCROLL_ELM_CALC = $(byCssSelector(".tradingCalc__graph.gapSm"));
    private static final SelenideElement CALC_START_TR_BTN = $(byCssSelector(".btn.btn--nowrap.btn--darkText.js_signup_new"));

    private static final SelenideElement SCROLL_ELM_TRAD_DASHB = $(byCssSelector(".btn.btn--nowrap.btn--darkText.js_signup_new"));
    private static final ElementsCollection COLLECTION_TRAD_DASHB_TRADE_BTN = $$(byCssSelector(".tradersDashboard__btn.btn.btn--empty.js_signup"));

//    private static final SelenideElement SCROLL_ELM_WHY_CHOOSE = $(byCssSelector(".cc-boxXl.cc-counter.js-counter.dark"));
    private static final SelenideElement SCROLL_ELM_WHY_CHOOSE = $(byCssSelector(".promoApps__content"));
    private static final SelenideElement WHY_CHOOSE_TRYN_BTN = $(byCssSelector(".btn.btn--empty.cc-counter__btn.js_signup.__cp_bs.ln-auto.js-analyticsVisible"));


    // для ASIC
    @Step("Выбор банера CFD")
    public void choiceBannerCFD_ASIC (){
        SCROLL_ELM_MAIN_BANNER.scrollTo();
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

    // переделать!!!
    @Step("Выбор банера Discover Pro Trading")
    public void choiceBannerPRO (){
        SCROLL_ELM_MAIN_BANNER.scrollTo();
        BANNER_PRO_ASIC.click();

    }

    @Step("Клик по кнопке Start Trading")
    public void clickBtnSTPRO (){
        BANNER_PRO_START_TRADING.click();
    }
    //
    // для FCA
    @Step("Выбор банера CFD")
    public void choiceBannerSpreadBetting (){
        SCROLL_ELM_MAIN_BANNER.scrollTo();
        BANNER_SPREAD_BETTING.click();
    }

    @Step("Клик по кнопке Trade Now")
    public void clickBtnOpenAccount (){
        BANNER_SPREAD_BETTING_OPEN_ACC.click();
    }
    //

    @Step("Выбор банера CFD")
    public void choiceBannerCFD (){
        SCROLL_ELM_MAIN_BANNER.scrollTo();
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
        SCROLL_ELM_MAIN_BANNER.scrollTo();
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

    @Step("Клик по кнопке Create")
    public void clickBtnCreateStillLookingFor  (){
        SCROLL_ELM_STILL_LOOKING.scrollTo();
        CREATE_SL_BTN.click();
    }

    @Step("Проверка кнопок Trade у баннера Slider Fade")
    public void checkTradeBtnSliderFade () {
        SCROLL_ELM_SLIDER_FADE.scrollTo();
        for (SelenideElement selenideElement : SLIDER_FADE_TRADE_BTN) {
            selenideElement.shouldBe(Condition.visible).click();
            CHECK_SING_UP_FORM.shouldBe(Condition.visible);
            CLOSE_SING_UP_FORM.click();
            selenideElement.hover(HoverOptions.withOffset(0,50));
        }
    }

    @Step("Клик по кнопке Try Now")
    public void clickBtnTryNowExploreOurPlatform(){
        SCROLL_ELM_EXP_OUR.scrollTo();
        EXP_OUR_PL_TRYN_BTN.shouldNotBe(Condition.hidden).click();
    }

    @Step("Клик по кнопке Practise for free")
    public void clickBtnPractiseForFreeNewToTrading(){
        SCROLL_ELM_PRACTISE_FF.scrollTo();
        NEW_TO_TR_PRACTISE_FF_BTN.click();
    }

    @Step("Клик по кнопке Start Trading")
    public void clickBtnStartTradingCalc(){
        SCROLL_ELM_CALC.scrollTo();
        CALC_START_TR_BTN.click();
    }

    @Step("Проверка кнопок Trade у баннера Trader's Dashboard")
    public void checkTradeBtnTrDashb () {
        SCROLL_ELM_TRAD_DASHB.scrollTo();
        for (SelenideElement selenideElement : COLLECTION_TRAD_DASHB_TRADE_BTN) {
            selenideElement.click();
            CHECK_SING_UP_FORM.shouldBe(Condition.visible);
            CLOSE_SING_UP_FORM.click();
        }
    }

    @Step("Клик по кнопке Try Now")
    public void clickBtnTryNowWhyCapCom(){
        SCROLL_ELM_WHY_CHOOSE.scrollTo();
        WHY_CHOOSE_TRYN_BTN.click();
    }

    @Step("Появление поля SignUp")
    public void checkSingUpForm() {
        CHECK_SING_UP_FORM.shouldBe(Condition.visible);
        CLOSE_SING_UP_FORM.click();
    }

    @Step("Проверка вкладки Most Traded")
    public void checkTabsNav_MTR () {
        SCROLL_ELM_BANNER.scrollTo();
        TABS_NAV_MTR.click();
        for (SelenideElement selenideElement : COLLECTION_TRADE) {
                selenideElement.click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.click();
        }
    }
    @Step("Проверка вкладки Commodities")
    public void checkTabsNav_COM () {
        SCROLL_ELM_BANNER.scrollTo();
        TABS_NAV_COM.click();
        for (SelenideElement selenideElement : COLLECTION_TRADE) {
                selenideElement.click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.click();
        }
    }
    @Step("Проверка вкладки Indices")
    public void checkTabsNav_IND () {
        SCROLL_ELM_BANNER.scrollTo();
        TABS_NAV_IND.click();
        for (SelenideElement selenideElement : COLLECTION_TRADE) {
                selenideElement.click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.click();
        }
    }
    @Step("Проверка вкладки Crypto")
    public void checkTabsNav_CRYP () {
        SCROLL_ELM_BANNER.scrollTo();
        TABS_NAV_CRYP.click();
        for (SelenideElement selenideElement : COLLECTION_TRADE) {
                selenideElement.click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.click();
        }
    }
    @Step("Проверка вкладки Shares")
    public void checkTabsNav_SHAR () {
        SCROLL_ELM_BANNER.scrollTo();
        TABS_NAV_SHAR.click();
        for (SelenideElement selenideElement : COLLECTION_TRADE) {
                selenideElement.click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.click();
        }
    }
    @Step("Проверка вкладки Forex")
    public void checkTabsNav_FX () {
        SCROLL_ELM_BANNER.scrollTo();
        TABS_NAV_FX.click();
        for (SelenideElement selenideElement : COLLECTION_TRADE) {
                selenideElement.click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.click();
        }
    }
    @Step("Проверка вкладки ETFs")
    public void checkTabsNav_ETF () {
        SCROLL_ELM_BANNER.scrollTo();
        TABS_NAV_ETF.click();
        for (SelenideElement selenideElement : COLLECTION_TRADE) {
                selenideElement.click();
                CHECK_SING_UP_FORM.shouldBe(Condition.visible);
                CLOSE_SING_UP_FORM.click();
        }
    }

}

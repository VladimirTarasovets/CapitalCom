package com.capital.tests.license.asic;

import com.capital.pageObject.MainPage;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainPageTest extends BeAfAllASIC {
    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка появление поля SignUp в банере CFD при клике на кнопку Trade Now")
    public void checkSingUP_CFD_BtnTN(){
        mainPage.choiceBannerCFD_ASIC();
        mainPage.clickBtnTN_ASIC();
        mainPage.checkSingUpForm();
    }

    @Test
    @DisplayName("Проверка появление поля SignUp в банере CFD при клике на кнопку Practise for free")
    public void checkSingUP_CFD_BtnPFF(){
        mainPage.choiceBannerCFD_ASIC();
        mainPage.clickBtnPFF_CFD_ASIC();
        mainPage.checkSingUpForm();
    }

    @Disabled
    @Test
    @DisplayName("Проверка появление поля SignUp в банере Discover Pro Trading при клике на кнопку Start Trading")
    public void checkSingUP_BP_BtnST(){
        mainPage.choiceBannerPRO();
        mainPage.clickBtnSTPRO();
        mainPage.checkSingUpForm();
    }


    @Test
    @DisplayName("Проверка кнопок Trade в интерактивной таблице виджетов на появление поля SignUp. MTR")
    public void checkMTR () {
        mainPage.checkTabsNav_MTR();
    }

    @Test
    @DisplayName("Проверка кнопок Trade в интерактивной таблице виджетов на появление поля SignUp. COM")
    public void checkCOM () {
        mainPage.checkTabsNav_COM();
    }

    @Test
    @DisplayName("Проверка кнопок Trade в интерактивной таблице виджетов на появление поля SignUp. IND")
    public void checkIND () {
        mainPage.checkTabsNav_IND();
    }

    @Test
    @DisplayName("Проверка кнопок Trade в интерактивной таблице виджетов на появление поля SignUp. CRYP")
    public void checkCRYP () {
        mainPage.checkTabsNav_CRYP();
    }

    @Test
    @DisplayName("Проверка кнопок Trade в интерактивной таблице виджетов на появление поля SignUp. SHAR")
    public void checkSHAR () {
        mainPage.checkTabsNav_SHAR();
    }

    @Test
    @DisplayName("Проверка кнопок Trade в интерактивной таблице виджетов на появление поля SignUp. FX")
    public void checkFX () {
        mainPage.checkTabsNav_FX();
    }

    @Test
    @DisplayName("Проверка кнопок Trade в интерактивной таблице виджетов на появление поля SignUp. ETF")
    public void checkETF () {
        mainPage.checkTabsNav_ETF();
    }

    @Test
    @DisplayName("Проверка появление поля SignUp в баннере Still Looking For при клике на кнопку Create")
    public void checkCreateBtn(){
        mainPage.clickBtnCreateStillLookingFor();
        mainPage.checkSingUpForm();
    }

    @Test
    @DisplayName("Проверка кнопок Trade у баннера Slider Fade на появление поля SignUp")
    public void checkSliderFade () {
        mainPage.checkTradeBtnSliderFade();
    }

    @Test
    @DisplayName("Проверка появление поля SignUp в баннере Explore our platform при клике на кнопку Try Now")
    public void checkTryNowBtnEOP(){
        mainPage.clickBtnTryNowExploreOurPlatform();
        mainPage.checkSingUpForm();
    }

    @Test
    @DisplayName("Проверка появление поля SignUp в баннере New to trading? при клике на кнопку Practise for free")
    public void checkPracForFreeBtnNewToTR(){
        mainPage.clickBtnPractiseForFreeNewToTrading();
        mainPage.checkSingUpForm();
    }

    @Test
    @DisplayName("Проверка появление поля SignUp в баннере Calculator при клике на кнопку Start Trading")
    public void checkStartTradBtnCalc(){
        mainPage.clickBtnStartTradingCalc();
        mainPage.checkSingUpForm();
    }

    @Test
    @DisplayName("Проверка кнопок Trade у баннера Trader's Dashboard на появление поля SignUp")
    public void checkTradeBtnTradeDashb () {
        mainPage.checkTradeBtnTrDashb();
    }

    @Test
    @DisplayName("Проверка появление поля SignUp в баннере Why choose Capital.com? при клике на кнопку Try Now")
    public void checkTryNowBtnWhyCC(){
        mainPage.clickBtnTryNowWhyCapCom();
        mainPage.checkSingUpForm();
    }

}

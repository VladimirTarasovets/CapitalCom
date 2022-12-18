package com.capital.tests.license.cysec;

import com.capital.pageObject.MainPage;
import io.qameta.allure.Flaky;
import io.qameta.allure.Step;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainPageTest extends BeAfAllCYSEC {
    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка появление поля SignUp в банере CFD при клике на кнопку Trade Now")
    public void checkSingUP_CFD_BtnTN(){
        mainPage.choiceBannerCFD();
        mainPage.clickBtnTN();
        mainPage.checkSingUpForm();
    }

    @Test
    @DisplayName("Проверка появление поля SignUp в банере CFD при клике на кнопку Practise for free")
    public void checkSingUP_CFD_BtnPFF(){
        mainPage.choiceBannerCFD();
        mainPage.clickBtnPFF_CFD();
        mainPage.checkSingUpForm();
    }

    @Test
    @DisplayName("Проверка появление поля SignUp в банере Best Platform при клике на кнопку Start Trading")
    public void checkSingUP_BP_BtnST(){
        mainPage.choiceBannerBP();
        mainPage.clickBtnST();
        mainPage.checkSingUpForm();
    }

    @Test
    @DisplayName("Проверка появление поля SignUp в банере Best Platform при клике на кнопку Practise for free")
    public void checkSingUP_BP_BtnPFF(){
        mainPage.choiceBannerBP();
        mainPage.clickBtnPFF_BP();
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
}

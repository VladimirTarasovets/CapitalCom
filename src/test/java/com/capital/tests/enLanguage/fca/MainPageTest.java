package com.capital.tests.enLanguage.fca;

import com.capital.pageObject.MainPage;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Checking the main page of the site. FCA_EN")
public class MainPageTest extends BaseFCA {
    MainPage mainPage = new MainPage();

    @Test
    @Order(1)
    @DisplayName("Checking the appearance of the SignUp field in the CFD banner when clicking on the Trade Now button")
    public void checkSingUP_CFD_BtnTN(){
        mainPage.choiceBannerCFD();
        mainPage.clickBtnTN();
        mainPage.checkSingUpForm();
    }

    @Test
    @Order(2)
    @DisplayName("Checking the appearance of the SignUp field in the CFD banner when clicking on the Practice for free button")
    public void checkSingUP_CFD_BtnPFF(){
        mainPage.choiceBannerCFD();
        mainPage.clickBtnPFF_CFD();
        mainPage.checkSingUpForm();
    }

    @Test
    @Order(3)
    @DisplayName("Checking the appearance of the SignUp field in the Best Platform banner when clicking on the Start Trading button")
    public void checkSingUP_BP_BtnST(){
        mainPage.choiceBannerBP();
        mainPage.clickBtnST();
        mainPage.checkSingUpForm();
    }

    @Test
    @Order(4)
    @DisplayName("Checking the appearance of the SignUp field in the Best Platform banner when clicking on the Practice for free button")
    public void checkSingUP_BP_BtnPFF(){
        mainPage.choiceBannerBP();
        mainPage.clickBtnPFF_BP();
        mainPage.checkSingUpForm();
    }

    @Test
    @Order(5)
    @DisplayName("Checking the Trade buttons in the interactive widget table for the appearance of the SignUp field. MTR")
    public void checkMTR () {
        mainPage.checkTabsNav_MTR();
    }

    @Test
    @Order(6)
    @DisplayName("Checking the Trade buttons in the interactive widget table for the appearance of the SignUp field. COM")
    public void checkCOM () {
        mainPage.checkTabsNav_COM();
    }

    @Test
    @Order(7)
    @DisplayName("Checking the Trade buttons in the interactive widget table for the appearance of the SignUp field. IND")
    public void checkIND () {
        mainPage.checkTabsNav_IND();
    }

    @Test
    @Order(8)
    @DisplayName("Checking the Trade buttons in the interactive widget table for the appearance of the SignUp field. SHAR")
    public void checkSHAR () {
        mainPage.checkTabsNav_SHAR();
    }

    @Test
    @Order(9)
    @DisplayName("Checking the Trade buttons in the interactive widget table for the appearance of the SignUp field. FX")
    public void checkFX () {
        mainPage.checkTabsNav_FX();
    }

    @Test
    @Order(10)
    @DisplayName("Checking the Trade buttons in the interactive widget table for the appearance of the SignUp field. ETF")
    public void checkETF () {
        mainPage.checkTabsNav_ETF();
    }

    @Test
    @Order(11)
    @DisplayName("Checking the appearance of the SignUp field in the Still Looking For banner when clicking on the Create button")
    public void checkCreateBtn(){
        mainPage.clickBtnCreateStillLookingFor();
        mainPage.checkSingUpForm();
    }

    @Test
    @Order(12)
    @DisplayName("Checking the Trade buttons at the Slider Fade banner for the appearance of the SignUp field")
    public void checkSliderFade () {
        mainPage.checkTradeBtnSliderFade();
    }

    @Test
    @Order(13)
    @DisplayName("Checking the appearance of the SignUp field in the Explore our platform banner when clicking on the Try Now button")
    public void checkTryNowBtnEOP(){
        mainPage.clickBtnTryNowExploreOurPlatform();
        mainPage.checkSingUpForm();
    }

    @Test
    @Order(14)
    @DisplayName("Checking the appearance of the SignUp field in the banner New to trading? when clicking on the Practice for free button")
    public void checkPracForFreeBtnNewToTR(){
        mainPage.clickBtnPractiseForFreeNewToTrading();
        mainPage.checkSingUpForm();
    }

    @Test
    @Order(15)
    @DisplayName("Checking the appearance of the SignUp field in the Calculator banner when clicking on the Start Trading button")
    public void checkStartTradBtnCalc(){
        mainPage.clickBtnStartTradingCalc();
        mainPage.checkSingUpForm();
    }

    @Test
    @Order(16)
    @DisplayName("Checking the Trade buttons on the Trader's Dashboard banner for the SignUp field")
    public void checkTradeBtnTradeDashb () {
        mainPage.checkTradeBtnTrDashb();
    }

    @Test
    @Order(17)
    @DisplayName("Checking the appearance of the SignUp field in the banner Why choose Capital.com? when you click on the Try Now button")
    public void checkTryNowBtnWhyCC(){
        mainPage.clickBtnTryNowWhyCapCom();
        mainPage.checkSingUpForm();
    }

}

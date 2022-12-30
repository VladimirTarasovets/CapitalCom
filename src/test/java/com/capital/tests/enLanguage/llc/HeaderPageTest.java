package com.capital.tests.enLanguage.llc;

import com.capital.pageObject.HeaderPage;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Checking the site header. LLC_EN")
public class HeaderPageTest extends BeAfAllLLC {
    HeaderPage headerPage = new HeaderPage();

    @Test
    @DisplayName("Checking the appearance of the Login field when clicking on the Login button in the site header")
    public void checkLogin(){
        headerPage.loginFieldFormAppears();
    }

    @Test
    @DisplayName("Checking the appearance of the SignUp field when clicking on the TradeNow button in the site header")
    public void checkSingUp(){
        headerPage.singUpFieldFormAppears();
    }
}

package com.capital.tests.enLanguage.fca;

import com.capital.pageObject.HeaderPage;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Checking the site header. FCA_EN")
public class HeaderPageTest extends BaseFCA {
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

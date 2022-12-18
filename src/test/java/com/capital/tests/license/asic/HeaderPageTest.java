package com.capital.tests.license.asic;

import com.capital.pageObject.HeaderPage;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HeaderPageTest extends BeAfAllASIC {
    HeaderPage headerPage = new HeaderPage();

    @Test
    @DisplayName("Проверка появление поля Login при клике на кнопку Login в header сайта")
    public void checkLogin(){
        headerPage.loginFieldFormAppears();
    }

    @Test
    @DisplayName("Проверка появление поля SignUp при клике на кнопку TradeNow в header сайта")
    public void checkSingUp(){
        headerPage.singUpFieldFormAppears();
    }
}

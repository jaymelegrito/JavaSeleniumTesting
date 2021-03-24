package jj.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import jj.base.BaseTests;
import jj.pages.LoginPage;
import jj.pages.SecureAreaPage;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        Assert.assertTrue(secureAreaPage.getAletText() 
            .contains("You logged into a secure area!"),
            "Alert text incorrect.");


    }
    
}

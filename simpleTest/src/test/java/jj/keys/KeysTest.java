package jj.keys;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import jj.base.BaseTests;

public class KeysTest extends BaseTests{

    @Test
    public void testBackSpace(){
        var keyPage = homePage.clickKeyPress();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        var keyPage = homePage.clickKeyPress();
        keyPage.enterPi();
    }
    
}

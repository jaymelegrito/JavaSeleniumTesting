package jj.alert;

import org.testng.Assert;
import org.testng.annotations.Test;

import jj.base.BaseTests;

public class AlertTest extends BaseTests{

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        Assert.assertEquals(alertsPage.getResult(), "You successfully clicked an alert",
            "Result message incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickAlerts();
        alertsPage.triggerConfirm();
        
        String text = alertsPage.alert_getText();

        alertsPage.alert_clickToDismiss();

        Assert.assertEquals(text, "I am a JS Confirm", "Message incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickAlerts();
        alertsPage.triggerPrompt();

        String text = "I like tea.";

        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();

        Assert.assertEquals(alertsPage.getResult(), "You entered: " + text, "Result text incorrect");
    }
    
}

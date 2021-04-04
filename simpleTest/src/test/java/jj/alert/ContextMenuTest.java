package jj.alert;

import org.testng.Assert;
import org.testng.annotations.Test;

import jj.base.BaseTests;

public class ContextMenuTest extends BaseTests{
    
    @Test
    public void testGetTextOfAlert(){
        var contextMenu = homePage.clickContext();
        contextMenu.rightClickBox();
        
        Assert.assertEquals(contextMenu.alert_getText(), "You selected a context menu", "Incorrect alert text");

        contextMenu.alert_clickToAccept();
    }
}

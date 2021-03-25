package jj.hover;

import org.testng.Assert;
import org.testng.annotations.Test;

import jj.base.BaseTests;

public class HoverTest extends BaseTests{

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        Assert.assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        Assert.assertEquals(caption.getTitle(), "name: user1");
        Assert.assertEquals(caption.getLinkText(), "View profile");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
    
}

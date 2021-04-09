package jj.frames;

import org.testng.Assert;
import org.testng.annotations.Test;

import jj.base.BaseTests;

public class Frames2 extends BaseTests {

    @Test
    public void testFrames2(){
        var frames = homePage.clickFrames();
        Assert.assertEquals(frames.getTextFromLeftFrame(), "LEFT", "Frame text incorrect");
        Assert.assertEquals(frames.getTextFromBottomFrame(), "BOTTOM", "Frame text incorrect");
    }

    
}

package jj.frames;

import org.testng.Assert;
import org.testng.annotations.Test;

import jj.base.BaseTests;

public class Frame extends BaseTests {

    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text = "hello world";

        editorPage.increaseIndention();
        editorPage.setTextArea(text);

        Assert.assertEquals(editorPage.getTextFromEditor(), text, "Message is incorrect.");
    }
    
}

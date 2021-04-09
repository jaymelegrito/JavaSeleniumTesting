package jj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String frameTop = "frame-top";
    private String frameLeft = "frame-left";
    private String frameBottom = "frame-bottom";
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    } 

    public String getTextFromLeftFrame(){
        switchToTopFrame();
        switchToLeftFrame();
        String text = driver.findElement(body).getText();
        switchToMainArea();
        switchToMainArea();
        return text; 
    }

    public String getTextFromBottomFrame(){
        switchToBottomFrame();
        String text = driver.findElement(body).getText();
        switchToMainArea();
        return text;
    }

    private void switchToLeftFrame(){
        driver.switchTo().frame(frameLeft);
    }

    private void switchToBottomFrame(){
        driver.switchTo().frame(frameBottom);
    }

    private void switchToTopFrame(){
        driver.switchTo().frame(frameTop);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    
}

package jj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private String linkXpath_format = ".//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_format, "Example 1"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickExample1(){
        driver.findElement(link_Example1).click();
    }
    
    
}

package jj.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

    private WebDriver driver;

    public void countLinks(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement shiftingLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingLink.click();

        WebElement exampleLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        exampleLink.click();

        List<WebElement> links = driver.findElements(By.tagName("li"));
        System.out.println(links.size());

        driver.quit();

    }

    public static void main(String[] args){
        findElements test = new findElements();
        test.countLinks();
    }
    
}

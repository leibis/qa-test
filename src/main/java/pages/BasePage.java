package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickElement(By elementLocator) {
        waitUntilElementIsPresentAndVisible(elementLocator).click();
    }

    public void sendText(By elementLocator, String value) {
        waitUntilElementIsPresentAndVisible(elementLocator).sendKeys(value);
    }

    public WebElement waitUntilElementIsPresentAndVisible(By elementLocator) {
        //driver.wait(60);
        return driver.findElement(elementLocator);

    }

}

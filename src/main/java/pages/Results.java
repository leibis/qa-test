package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Results extends BasePage{

    //private By resultsList = By.xpath("//h3[contains(@class,'s-access-title')]");
    //private By resultsList = By.xpath("//div[contains(@class, 'cnn-search__results-count') and contains(.,'Displaying results')]");
    private By resultsList = By.xpath("//div[contains(@class, 'cnn-search__results')]");

    public Results(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultText(String strLocator){
        By resultsList = By.xpath(strLocator);
        return waitUntilElementIsPresentAndVisible(resultsList);
    }
}

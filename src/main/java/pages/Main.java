package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Main extends BasePage{


    private By searchOption = By.id("search-button");
    private By searchInput = By.id("search-input-field");
    private By goButton = By.id("submit-button");

    public Main(WebDriver driver) {
        super(driver);
    }

    public Main enterSearchCriteria(String value){
        sendText(searchInput, value);
        return this;
    }
    public Main searchGo(){
        clickElement(searchOption);
        return this;
    }

    public Main clickGo(){
        clickElement(goButton);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

}

package base;

import examples.Words;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseTest {

    public ChromeDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", Thread.currentThread().getContextClassLoader().getResource("drivers/chromedriver.exe").getPath());
        driver = new ChromeDriver();
        driver.navigate().to("http://www.cnn.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest(){
        driver.close();
        driver.quit();
    }

    @DataProvider(name = "firstDataProvider")
    public static Object[][] getFirstProjectDP(){
        Object[][] objToReturn = new Object[2][1];

        objToReturn[0][0] = new Words("NFL", "//div[contains(@class, 'cnn-search__results-count') and contains(.,'Displaying results')]");
        objToReturn[1][0] = new Words("NFLFake", "//h3[contains(., 'did not match')]");

        return objToReturn;
    }
}

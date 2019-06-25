package tests;

import base.BaseTest;
import examples.Words;
import org.testng.annotations.Test;
import pages.Main;
import pages.Results;
import static org.assertj.core.api.Assertions.*;

public class Suite extends BaseTest {

    @Test(dataProvider = "firstDataProvider")
    public void firstTest(Words words) {

        Main main = new Main(driver);
             main.searchGo()
                .enterSearchCriteria(words.getText())
                .clickGo();


        Results resultsPage = new Results(driver);

        assertThat(resultsPage.getResultText(words.getAssertionMessage()));


    }

}

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.PopularPage;

import java.time.Duration;
@Listeners(MoviesAppTestReports.class)
public class PopularPageTest extends BaseTest {

    @Test(priority = 1)
    public void testMoviesDisplayed(){
        homePage.clickOnPopular();
        // verifying the Movies Displayed or not with Movies count
        Assert.assertEquals(popularPage.moivesDisplayed(),30,"Movies count does not match");

    }

}

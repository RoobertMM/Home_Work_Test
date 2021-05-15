import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdrive.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName= "Search URL")
    public static void searchForProduct(){
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.searchField();
        webForm.enter();
        webForm.sticker();
        webForm.home();
        webForm.accesories();
    }
    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
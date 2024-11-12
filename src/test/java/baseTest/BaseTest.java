package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    @Parameters({"BASEURL"})
    public void setUp(String BASEURL) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);  // Ensure driver is initialized before using it

        driver.manage().window().maximize();
        driver.get(BASEURL);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

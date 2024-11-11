package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

        protected WebDriver driver;

        @BeforeMethod
        public void setUp() {

            driver = new ChromeDriver();
            driver.manage().window().maximize();  // Maximize the browser window
        }

        @AfterMethod
        public void tearDown() {
            // Quit the driver after each test
            if (driver != null) {
                driver.quit();
            }
        }
    }

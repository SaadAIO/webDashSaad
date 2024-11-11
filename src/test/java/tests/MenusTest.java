package tests;


import basePage.BasePage;
import baseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.menuManager.Menus;

import java.time.Duration;

public class MenusTest extends BaseTest {
    @Test
    public void testValidLogin() {
        Menus loginDriver = new Menus(driver);

        driver.get("https://main-dashboard.dev.aioapp.com/");


       loginDriver.explicitWait(By.name("email"));
        loginDriver.login("wasifQAr35@aioapp.com", "Test@1234");
        loginDriver.explicitWait(By.xpath("//span[contains(text(),'Menu Manager')]"));

        loginDriver.clickMenuManagerButton();
        loginDriver.explicitWait(By.xpath("//li[.='Menus']"));
        loginDriver.clickMenuButton();
        loginDriver.explicitWait(By.xpath("//span[.='Create Menu ']"));
        loginDriver.clickCreateMenuButton();
        loginDriver.explicitWait(By.name("menuName"));
        loginDriver.enterMenuName();
        loginDriver.enterPOSName();
        loginDriver.enterColor();
        loginDriver.setSaveButton();
        loginDriver.explicitWait(By.xpath("//h6[contains(text(),'Testmenu123')]"));
        Assert.assertTrue(driver.findElement(By.xpath("//h6[contains(text(),'Testmenu123')]")).isDisplayed(), "Successfully created");

    }
}

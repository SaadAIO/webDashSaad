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

import static basePage.BasePage.explicitWait;

public class MenuTestt extends BaseTest {
    @Test(priority = 1)
    public void testValidLogin() {
        Menus loginDriver = new Menus(driver);

        explicitWait(By.name("email"));
        loginDriver.login("dash.auto@aioapp.com", "Test@1234");
        explicitWait(By.xpath("//span[contains(text(),'Menu Manager')]"));
        loginDriver.clickMenuManagerButton();
        explicitWait(By.xpath("//li[.='Menus']"));
        loginDriver.clickMenuButton();
        explicitWait(By.xpath("//span[.='Create Menu ']"));
        loginDriver.clickCreateMenuButton();
        explicitWait(By.name("menuName"));
        loginDriver.enterMenuName();
        loginDriver.enterPOSName();
        loginDriver.enterColor();
        loginDriver.setSaveButton();
        explicitWait(By.xpath("//h6[contains(text(),'Testmenu123')]"));
        Assert.assertTrue(driver.findElement(By.xpath("//h6[contains(text(),'Testmenu123')]")).isDisplayed(), "Successfully created");
    }


}

package pages.menuManager;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Menus extends BasePage {
    public Menus(WebDriver driver) {

        super(driver);
    }
    By menuManagerButton=By.xpath("//span[contains(text(),'Menu Manager')]");
    By menuButton=By.xpath("//li[.='Menus']");
    By createMenuButton=By.xpath("//span[.='Create Menu ']");
    By menuName = By.name("menuName");
    By posName = By.name("posDisplayName");
    By buttonColorPos = By.xpath("//div[@class='MuiBox-root mui-hqs2k1']/input[@type='text']");
    By categoriesDropdown = By.xpath("//input[@aria-autocomplete='list']");
    By onPremToggle = By.xpath("//p[.='On Prem']");
    By offPremToggle = By.xpath("//p[.='Off Prem']");
    By saveButton=By.xpath("//span[.='Save ']");


    public void clickMenuManagerButton(){
        click(menuManagerButton);
    }
    public void clickMenuButton(){
        click(menuButton);
    }
    public void clickCreateMenuButton(){
        click(createMenuButton);
    }
    public void enterMenuName(){
        driver.findElement(menuName).sendKeys("Testmenu123");
    }
    public void enterPOSName(){
        driver.findElement(posName).sendKeys("TestPOS");
    }
    public void enterColor(){
        driver.findElement(buttonColorPos).sendKeys("#000");
    }
    public void setSaveButton(){
        click(saveButton);
    }


}

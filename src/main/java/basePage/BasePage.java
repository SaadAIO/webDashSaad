package basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public  class  BasePage {
   static protected WebDriver driver;

    By usernameField  = By.name("email");
    By passwordField = By.name("password");
    By loginButton =By.xpath("//span[.='Login ']");

    public BasePage(WebDriver driver) {
       this.driver = driver;
    }

    static public void click(By element){
        driver.findElement(element).click();
    }
public void login(String email,String pass){
        driver.findElement(usernameField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(pass);
        click(loginButton);
}
        static  public void explicitWait(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

}

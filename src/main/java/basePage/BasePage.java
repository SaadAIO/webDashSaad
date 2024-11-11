package basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class BasePage {
   static protected WebDriver driver;

    By usernameField  = By.name("email");
    By passwordField = By.name("password");
    By loginButton =By.xpath("//span[.='Login ']");

    public BasePage(WebDriver driver) {
       this.driver = driver;
    }   static public void click(By element){
        driver.findElement(element).click();
    }
public void login(String email,String pass){
        driver.findElement(usernameField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(pass);
        click(loginButton);
}

}

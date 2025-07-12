package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;

    By username_field= By.id("user-name");
    By password_field= By.id("password");
    By login_btn= By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void typeUsername(String username){
        driver.findElement(username_field).sendKeys(username);
    }
    public void typePassword(String password){
        driver.findElement(password_field).sendKeys(password);
    }
    public void clickLoginBtn(){
        driver.findElement(login_btn).click();
    }
    public void verifyUsername(String username){
        Assert.assertEquals(driver.findElement(username_field).getAttribute("value"),username);
    }
    public void verifyPassword(String password){
        Assert.assertEquals(driver.findElement(password_field).getAttribute("value"),password);
    }
    public void verifyLogin(String redirectedURL){
        Assert.assertEquals(driver.getCurrentUrl(),redirectedURL);
    }
}

package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;
    By addToCart_btn= By.xpath("//div[text()=\"Sauce Labs Backpack\"]/parent::a/parent::div/parent::div//div[2]//button");
    By removeBackPack_btn= By.id("remove-sauce-labs-backpack");
    By clickCart_link= By.xpath("//a[@class=\"shopping_cart_link\"]");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public void clickAddToCartBtn(){
        driver.findElement(addToCart_btn).click();
    }
    public void clickCartLink(){
        driver.findElement(clickCart_link).click();
    }

    public void verifyAddToCartClicked(){
        driver.findElement(removeBackPack_btn).isDisplayed();
    }
    public void verifyCartLinkClicked(String redirectedURL){
        Assert.assertEquals(driver.getCurrentUrl(),redirectedURL);
    }

}

package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import pagefactory.HomePage;
import pagefactory.LoginPage;

public class TestPage {
    WebDriver driver;
    LoginPage login;
    HomePage homepage;

    @BeforeClass
    public void setUp(){
        driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        login= new LoginPage(driver);
        homepage= new HomePage(driver);
    }
    @Test (priority=1)
    public void positiveLoginScenario(){
        login.typeUsername("standard_user");
        login.verifyUsername("standard_user");
        login.typePassword("secret_sauce");
        login.verifyPassword("secret_sauce");
        login.clickLoginBtn();
        login.verifyLogin("https://www.saucedemo.com/inventory.html");
    }
    @Test (priority=2)
    public void positiveAddToCartScenario(){
        homepage.clickAddToCartBtn();
        homepage.verifyAddToCartClicked();
    }
    @Test (priority=3)
    public void positiveClickCartLinkScenario(){
        homepage.clickCartLink();
        homepage.verifyCartLinkClicked("https://www.saucedemo.com/cart.html");
    }
    @AfterClass
    public void terminate(){
        driver.quit();
    }
}

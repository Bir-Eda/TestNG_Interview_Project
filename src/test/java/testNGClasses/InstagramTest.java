package testNGClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class InstagramTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.instagram.com/");

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test(/*priority = 1enabled = false */)
    public void instagramTitle(){   // metodlarin basina A, B, C diye yazarak metodlari siraya koymus oluruz
        String actualTitle = driver.getTitle();
        String expectedTitle = "Instagram";
        Assert.assertEquals(actualTitle, expectedTitle, "failure");
    }
    @Test(/*priority = 2*/)  //priority 1 seklinde yazarak siraya koyuyoruz
    public void instagramLogo(){
    WebElement logo = driver.findElement(By.xpath("(//*[text()='Instagram'])[2]"));
        System.out.println("logo display situation : "+ logo.isDisplayed());
    }
    //@Test //(dependsOnMethods = "BinstagramLogo") //dependsonMethods = BinstagramLogo diyerek bu testin calismasini instagramLogo testine baglamis olduk
    public void clickLogin(){
    WebElement submit = driver.findElement(By.xpath("//*[@class='sqdOP  L3NKy   y3zKF     ']"));
    submit.click();
    }

}

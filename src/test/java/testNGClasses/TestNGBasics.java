package testNGClasses;

import org.testng.annotations.*;

public class TestNGBasics {
    @BeforeSuite

    public void setUp(){
        System.out.println("driver manager is installed");
    }
    @BeforeTest
    public void launchBrowser(){   // start browser
        System.out.println("start chrome browser");
        // WebDriver driver=new ChromeDriver();
    }
    @BeforeClass
    public void login(){
        System.out.println("enter to browser");
    }
    @BeforeMethod       // @BeforeEach in JUnit
    public void enterUrl() {
        System.out.println("enter Url");
        //driver.get("https://google.com")
    }
    @Test
    public void googleTitleTest(){
        System.out.println("Google Title Test");
    }

    @Test
    public void googleLogoTest(){
        System.out.println("Google Logo Test");
    }
    @AfterMethod        // @AfterEach  in JUnit
    public void refresh(){
        System.out.println("Refreshing the Google home page");
    }
    @AfterClass
    public void closeBrowser(){
        System.out.println("Close the browser");
    }
    @AfterTest
    public void deleteAllCookies(){
        System.out.println("delete all cookies");
    }
    @AfterSuite
    public void generateTestReports(){
        System.out.println("generating the google home page");
    }
}

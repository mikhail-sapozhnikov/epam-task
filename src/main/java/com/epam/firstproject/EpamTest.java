package com.epam.firstproject;

import com.epam.pom.EpamHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EpamTest {
    private WebDriver driver;
    private String baseUrl;

    @BeforeSuite
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Autotests\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "https://www.epam.com/";
        driver.manage().timeouts().implicitlyWait(360, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

//    @DataProvider(name = "test1")
//    public Object[][] createData1() {
//        return new Object[][] {
//                { "Cedric", new Integer(36) },
//                { "Anne", new Integer(37)},
//        };
//    }


    @Test//(dataProvider = "test1")
    public void testCoreEngineeringLink() throws InterruptedException {
        System.out.println("Begin test 1");

        EpamHomePage page = new EpamHomePage(driver);
        page.pointCursor(driver);
        page.menuCoreEngineering.click();




    }




}

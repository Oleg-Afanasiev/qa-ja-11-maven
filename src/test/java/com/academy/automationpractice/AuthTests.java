package com.academy.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AuthTests {
    private WebDriver driver;
    private String baseUrl;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        // инициализация Chrome
//        System.setProperty("webdriver.chrome.driver", "C:/Users/af_oleg/Documents/QA-JA-11/maven-project/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
        // инициализация Firefox
        System.setProperty("webdriver.gecko.driver", "C:/Users/af_oleg/Documents/QA-JA-11/maven-project/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "http://automationpractice.com/index.php";
        // настройка ожиданий
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void testAuthError() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("user");
        driver.findElement(By.xpath("//form[@id='login_form']/div/div")).click();
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("user");
        driver.findElement(By.xpath("//form[@id='login_form']/div/p[2]")).click();
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }
}

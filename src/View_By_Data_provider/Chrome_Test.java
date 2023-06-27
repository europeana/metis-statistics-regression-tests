package View_By_Data_provider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.IOException;

import static util.ConfigReader.*;

public class Chrome_Test {

    public WebDriver driver;

    // @Parameters("browserName")
    @Test
    public void TestStatisticsDashboard() throws InterruptedException, IOException {
        //if (browser.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepti Pandit\\IdeaProjects\\Sandbox_Regression_Acceptance_1\\Resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get(getUrl());
        // maximize the browser
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //GetOn to Data Provider page
        WebElement element =  driver.findElement(By.cssSelector("div.entry-card-pair:nth-child(4) > div:nth-child(1) > div:nth-child(2) > a:nth-child(2)"));
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(2000);

        //Enable and Disable Content tier
        driver.findElement(By.cssSelector("label.filter-title")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("label.filter-title")).click();

        //Back to Home screen
        driver.findElement(By.cssSelector("a.filter-title:nth-child(2)")).click();

        //Close the browser
        driver.close();
    }
}
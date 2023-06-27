package View_By_Countries;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
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

        //GetOn to Countries page

        WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-landing/main/div/div[2]/div/a"));
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(2000);

        //Enable and Disable Content tier
        driver.findElement(By.cssSelector("label.filter-title")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("label.filter-title")).click();
        Thread.sleep(2000);

        //Export data
        driver.findElement(By.cssSelector(".export-opener-link")).click();
        driver.findElement(By.cssSelector("li.icon-item:nth-child(7) > a:nth-child(1)")).click();


        //Back to Home screen
        driver.findElement(By.cssSelector("a.filter-title:nth-child(2)")).click();

        //Close the browser
        driver.close();

    }
}
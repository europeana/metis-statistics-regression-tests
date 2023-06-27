package View_By_provider;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import static util.ConfigReader.*;

public class Edge_Test {
    public WebDriver driver;

    // @Parameters("browserName")
    @Test
    public void EdgeTest() throws InterruptedException, IOException {
        //if (browser.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Deepti Pandit\\IdeaProjects\\Sandbox_Regression_Acceptance_1\\Resources\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new EdgeDriver(options);
        driver.get(getUrl());
        // maximize the browser
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //GetOn to Provider page
        WebElement element = driver.findElement(By.cssSelector("div.entry-card-pair:nth-child(4) > div:nth-child(2) > div:nth-child(2) > a:nth-child(2)"));
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

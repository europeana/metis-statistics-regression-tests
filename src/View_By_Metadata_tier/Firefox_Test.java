package View_By_Metadata_tier;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import static util.ConfigReader.*;

public class Firefox_Test {
    public WebDriver driver;

    @Test
    public void FirefoxTest() throws InterruptedException, IOException {
        System.setProperty("webdriver.firefox.driver", "C:\\Users\\Deepti Pandit\\IdeaProjects\\Sandbox_Regression_Acceptance_1\\Resources\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(getUrl());
        // maximize the browser
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //GetOn to Metadata Tier page
        driver.findElement(By.cssSelector("main.fit-to-page > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > a:nth-child(3)")).click();
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

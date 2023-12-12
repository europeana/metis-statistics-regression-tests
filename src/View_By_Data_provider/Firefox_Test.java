package View_By_Data_provider;

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
        String driverPath = System.getProperty("driverPath");
        WebDriver driver = new FirefoxDriver();
        driver.get(getUrl());
        // maximize the browser
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //GetOn to Data Provider page
        driver.findElement(By.cssSelector("div.entry-card-pair:nth-child(4) > div:nth-child(1) > div:nth-child(2) > a:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("label.filter-title")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("label.filter-title")).click();

        //Close the browser
        driver.close();
    }
}

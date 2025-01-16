package Member_Cyprus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.io.IOException;
import static util.ConfigReader.getUrl;

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

        //Accept Cookies
        driver.findElement(By.xpath("/html/body/app-root/div/sb-cookie-consent/div/div/div/button[3]")).click();
        Thread.sleep(2000);

        //Country Page
        driver.findElement(By.xpath("/html/body/app-root/app-header/header/div[1]/span/span[2]")).click();
        Thread.sleep(2000);

        //Cyprus State Page
        driver.findElement(By.xpath("/html/body/app-root/app-header/header/div/span/span[3]/span/a[9]/span[2]")).click();
        Thread.sleep(2000);

        //Cyprus 3D page
        driver.findElement(By.xpath("/html/body/app-root/ng-component/main/div[1]/div[1]/div[1]/div/a")).click();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        WebElement element_to_hover = driver.findElement(By.xpath("/html/body/app-root/app-overview/main/form/div/div[2]/div[3]/div[1]/span"));
        action.moveToElement(element_to_hover).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-overview/main/form/div/div[2]/div[3]/div[1]/app-speech-bubble/span/ul/li/a/span[3]")).click();
        Thread.sleep(2000);

        //Cyprus HQ data
        driver.findElement(By.xpath("/html/body/app-root/ng-component/main/div[1]/div[1]/div[2]/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-header/header/div/span/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-header/header/div/span/span[3]/span/a[9]/span[2]")).click();
        Thread.sleep(2000);

        //Cyprus All data
        driver.findElement(By.xpath("/html/body/app-root/ng-component/main/div[1]/div[1]/div[3]/div/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-header/header/div/span/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-header/header/div/span/span[3]/span/a[9]/span[2]")).click();
        Thread.sleep(2000);

        driver.close();
    }
}

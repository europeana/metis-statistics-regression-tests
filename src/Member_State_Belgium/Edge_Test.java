package Member_State_Belgium;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.io.IOException;

import static util.ConfigReader.getUrl;

public class Edge_Test {
    public WebDriver driver;

    // @Parameters("browserName")
    @Test
    public void EdgeTest() throws InterruptedException, IOException {
        //if (browser.equalsIgnoreCase("chrome")) {
        String driverPath = System.getProperty("driverPath1");
        //System.setProperty("webdriver.edge.driver", "C:\\Users\\Deepti Pandit\\IdeaProjects\\Sandbox_Regression_Acceptance_1\\Resources\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new EdgeDriver(options);
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

        //Belgium State Page
        driver.findElement(By.xpath("/html/body/app-root/app-header/header/div[1]/span/span[3]/span/a[5]/span[2]")).click();
        Thread.sleep(2000);

        //Belgium 3D page
        driver.findElement(By.xpath("/html/body/app-root/ng-component/main/div[1]/div[1]/div[1]/div/a")).click();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        WebElement element_to_hover = driver.findElement(By.xpath("/html/body/app-root/app-overview/main/form/div/div[2]/div[3]/div[1]/span"));
        action.moveToElement(element_to_hover).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-overview/main/form/div/div[2]/div[3]/div[1]/app-speech-bubble/span/ul/li/a/span[2]")).click();
        Thread.sleep(2000);

        //Belgium HQ data
        driver.findElement(By.xpath("/html/body/app-root/ng-component/main/div[1]/div[1]/div[2]/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-header/header/div/span/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-header/header/div/span/span[3]/span/a[5]/span[2]")).click();
        Thread.sleep(2000);

        //Belgium All data
        driver.findElement(By.xpath("/html/body/app-root/ng-component/main/div[1]/div[1]/div[3]/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-header/header/div/span/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-header/header/div/span/span[3]/span/a[5]/span[2]")).click();
        Thread.sleep(2000);

        driver.close();
    }
}

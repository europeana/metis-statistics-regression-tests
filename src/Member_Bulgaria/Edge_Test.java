package Member_Bulgaria;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.io.IOException;
import static util.ConfigReader.*;

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
    }
}

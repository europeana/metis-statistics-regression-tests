package View_By_Content_tier;

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

        //GetOn to Content Tier page
        driver.findElement(By.xpath("/html/body/app-root/app-landing/main/div/div[1]/div[1]/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("label.filter-title")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("label.filter-title")).click();

        WebElement selectDropDown = driver.findElement(By.xpath("/html/body/app-root/app-overview/main/form/div/div[2]/div[1]/h1/select"));
        Select dropdown = new Select(selectDropDown);
        dropdown.selectByIndex(0);
        Thread.sleep(2000);

        // Validating the labels in Content tier
        WebElement topTier = driver.findElement(By.cssSelector("span.total:nth-child(3)"));
        System.out.println("Top Tier in Content Tier: " + topTier.getText());
        WebElement totalTier = driver.findElement(By.cssSelector("span.total:nth-child(4)"));
        System.out.println("Total Tier in Content Tier : " + totalTier.getText());
        WebElement topTierPercentage = driver.findElement(By.cssSelector("span.total:nth-child(7)"));
        System.out.println("Top Tier Percentage in Content Tier : " + topTierPercentage.getText());
        WebElement totalTierRecords = driver.findElement(By.cssSelector("span.total:nth-child(8)"));
        System.out.println("Total records in Tier in Content Tier : " + totalTierRecords.getText());
        WebElement topTierRecordsCount = driver.findElement(By.cssSelector("span.total:nth-child(11)"));
        System.out.println("Top Tier Records Count in Content Tier : " + topTierRecordsCount.getText());


        dropdown.selectByIndex(1);
        Thread.sleep(2000);

        // Validating the labels in Metadata tier
        WebElement topTier1 = driver.findElement(By.cssSelector("span.total:nth-child(3)"));
        System.out.println("Top Tier in Metadata Tier : " + topTier1.getText());
        WebElement totalTier1 = driver.findElement(By.cssSelector("span.total:nth-child(4)"));
        System.out.println("Total Tier in Metadata Tier : " + totalTier1.getText());
        WebElement topTierPercentage1 = driver.findElement(By.cssSelector("span.total:nth-child(7)"));
        System.out.println("Top Tier Percentage in Metadata Tier : " + topTierPercentage1.getText());
        WebElement totalTierRecords1 = driver.findElement(By.cssSelector("span.total:nth-child(8)"));
        System.out.println("Total records in Metadata Tier : " + totalTierRecords1.getText());
        WebElement topTierRecordsCount1 = driver.findElement(By.cssSelector("span.total:nth-child(11)"));
        System.out.println("Top Tier Records Count in Metadata Tier : " + topTierRecordsCount1.getText());

        dropdown.selectByIndex(2);
        Thread.sleep(2000);

        // Validating the labels in Country
        WebElement topTier2 = driver.findElement(By.cssSelector("span.total:nth-child(3)"));
        System.out.println("Top Country : " + topTier2.getText());
        WebElement totalTier2 = driver.findElement(By.cssSelector("span.total:nth-child(4)"));
        System.out.println("Total Countries : " + totalTier2.getText());
        WebElement topTierPercentage2 = driver.findElement(By.cssSelector("span.total:nth-child(7)"));
        System.out.println("Top Country Percentage: " + topTierPercentage2.getText());
        WebElement totalTierRecords2 = driver.findElement(By.cssSelector("span.total:nth-child(8)"));
        System.out.println("Total records in Countries : " + totalTierRecords2.getText());
        WebElement topTierRecordsCount2 = driver.findElement(By.cssSelector("span.total:nth-child(11)"));
        System.out.println("Top Country records count: " + topTierRecordsCount2.getText());

        dropdown.selectByIndex(3);
        Thread.sleep(2000);

        // Validating the labels in Data Provider
        WebElement topTier3 = driver.findElement(By.cssSelector("span.total:nth-child(3)"));
        System.out.println("Top CHI : " + topTier3.getText());
        WebElement totalTier3 = driver.findElement(By.cssSelector("span.total:nth-child(4)"));
        System.out.println("Total CHI : " + totalTier3.getText());
        WebElement topTierPercentage3 = driver.findElement(By.cssSelector("span.total:nth-child(7)"));
        System.out.println("Top CHI Percentage : " + topTierPercentage3.getText());
        WebElement totalTierRecords3 = driver.findElement(By.cssSelector("span.total:nth-child(8)"));
        System.out.println("Total records in CHI : " + totalTierRecords3.getText());
        WebElement topTierRecordsCount3 = driver.findElement(By.cssSelector("span.total:nth-child(11)"));
        System.out.println("Top CHI records count : " + topTierRecordsCount3.getText());

        dropdown.selectByIndex(4);
        Thread.sleep(2000);

        // Validating the labels in Provider
        WebElement topTier4 = driver.findElement(By.cssSelector("span.total:nth-child(3)"));
        System.out.println("Top Provider : " + topTier4.getText());
        WebElement totalTier4 = driver.findElement(By.cssSelector("span.total:nth-child(4)"));
        System.out.println("Total Providers : " + totalTier4.getText());
        WebElement topTierPercentage4 = driver.findElement(By.cssSelector("span.total:nth-child(7)"));
        System.out.println("Top Provider percentage: " + topTierPercentage4.getText());
        WebElement totalTierRecords4 = driver.findElement(By.cssSelector("span.total:nth-child(8)"));
        System.out.println("Total records in Provider : " + totalTierRecords4.getText());
        WebElement topTierRecordsCount4 = driver.findElement(By.cssSelector("span.total:nth-child(11)"));
        System.out.println("Top Provider Records Count : " + topTierRecordsCount4.getText());

        dropdown.selectByIndex(5);
        Thread.sleep(2000);

        // Validating the labels in Rights Category
        WebElement topTier5 = driver.findElement(By.cssSelector("span.total:nth-child(3)"));
        System.out.println("Top Rights Category : " + topTier5.getText());
        WebElement totalTier5 = driver.findElement(By.cssSelector("span.total:nth-child(4)"));
        System.out.println("Total Rights Category : " + totalTier5.getText());
        WebElement topTierPercentage5 = driver.findElement(By.cssSelector("span.total:nth-child(7)"));
        System.out.println("Top Rights Category Percentage : " + topTierPercentage5.getText());
        WebElement totalTierRecords5 = driver.findElement(By.cssSelector("span.total:nth-child(8)"));
        System.out.println("Total records in Rights Category : " + totalTierRecords5.getText());
        WebElement topTierRecordsCount5 = driver.findElement(By.cssSelector("span.total:nth-child(11)"));
        System.out.println("Top Rights Category records Count : " + topTierRecordsCount5.getText());

        dropdown.selectByIndex(6);
        Thread.sleep(2000);

        // Validating the labels in Media Type
        WebElement topTier6 = driver.findElement(By.cssSelector("span.total:nth-child(3)"));
        System.out.println("Top Type : " + topTier6.getText());
        WebElement totalTier6 = driver.findElement(By.cssSelector("span.total:nth-child(4)"));
        System.out.println("Total Types : " + totalTier6.getText());
        WebElement topTierPercentage6 = driver.findElement(By.cssSelector("span.total:nth-child(7)"));
        System.out.println("Top Type Percentage : " + topTierPercentage6.getText());
        WebElement totalTierRecords6 = driver.findElement(By.cssSelector("span.total:nth-child(8)"));
        System.out.println("Total records in Types : " + totalTierRecords6.getText());
        WebElement topTierRecordsCount6 = driver.findElement(By.cssSelector("span.total:nth-child(11)"));
        System.out.println("Top Type records Count : " + topTierRecordsCount6.getText());

        //Selecting Content tier from Filter
        driver.findElement(By.cssSelector("ul.filters:nth-child(3) > li:nth-child(1) > app-filter:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1) > span:nth-child(1) > span:nth-child(2) > span:nth-child(1)")).click();
        WebElement tier1 = driver.findElement(By.cssSelector(".checkboxes-list > li:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > app-checkbox:nth-child(1) > label:nth-child(1) > span:nth-child(2)"));
        tier1.click();

        WebElement tier2 = driver.findElement(By.cssSelector(".checkboxes-list > li:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > app-checkbox:nth-child(1) > label:nth-child(1) > span:nth-child(2)"));
        tier2.click();

        WebElement tier3 = driver.findElement(By.cssSelector(".checkboxes-list > li:nth-child(1) > ul:nth-child(3) > li:nth-child(1) > app-checkbox:nth-child(1) > label:nth-child(1) > span:nth-child(2)"));
        tier3.click();
        Thread.sleep(2000);

        WebElement tier4 = driver.findElement(By.cssSelector(".checkboxes-list > li:nth-child(1) > ul:nth-child(4) > li:nth-child(1) > app-checkbox:nth-child(1) > label:nth-child(1) > span:nth-child(2)"));
        tier4.click();
        Thread.sleep(2000);

        //Selecting Metadata tier from filter
        WebElement element =  driver.findElement(By.xpath("/html/body/app-root/app-overview/main/form/div/div[1]/div/ul[2]/li/app-filter[2]/ul/li/a/span/span[2]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

        WebElement tier0 = driver.findElement(By.cssSelector(".checkboxes-list > li:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > app-checkbox:nth-child(1) > label:nth-child(1) > span:nth-child(2)"));
        tier0.click();
        Thread.sleep(2000);

        WebElement tierA = driver.findElement(By.cssSelector(".checkboxes-list > li:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > app-checkbox:nth-child(1) > label:nth-child(1) > span:nth-child(2)"));
        tierA.click();
        Thread.sleep(2000);

        WebElement tierB = driver.findElement(By.cssSelector(".checkboxes-list > li:nth-child(1) > ul:nth-child(3) > li:nth-child(1) > app-checkbox:nth-child(1) > label:nth-child(1) > span:nth-child(2)"));
        tierB.click();
        Thread.sleep(2000);

        WebElement tierC = driver.findElement(By.cssSelector(".checkboxes-list > li:nth-child(1) > ul:nth-child(4) > li:nth-child(1) > app-checkbox:nth-child(1) > label:nth-child(1) > span:nth-child(2)"));
        tierC.click();
        Thread.sleep(2000);

        //Selecting Country from filter
        WebElement element1 = driver.findElement(By.xpath("/html/body/app-root/app-overview/main/form/div/div[1]/div/ul[2]/li/app-filter[3]/ul/li[1]/a/span/span[2]/span"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click();", element1);

        WebElement country_Austria = driver.findElement(By.cssSelector(".checkboxes-list > li:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > app-checkbox:nth-child(1) > label:nth-child(1) > span:nth-child(2)"));
        country_Austria.click();
        Thread.sleep(2000);

        //Selecting Data Provider from filter
        WebElement element2 = driver.findElement(By.xpath( "/html/body/app-root/app-overview/main/form/div/div[1]/div/ul[2]/li/app-filter[4]/ul/li[1]/a/span/span[2]/span"));
        JavascriptExecutor executor2 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click();", element2);

        WebElement data_provider = driver.findElement(By.cssSelector(".checkboxes-list > li:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > app-checkbox:nth-child(1) > label:nth-child(1) > span:nth-child(2)"));;
        data_provider.click();
        Thread.sleep(2000);

        //Selecting Provider from filter
        WebElement element3 = driver.findElement(By.xpath( "/html/body/app-root/app-overview/main/form/div/div[1]/div/ul[2]/li/app-filter[5]/ul/li[1]/a/span/span[2]/span"));
        JavascriptExecutor executor3 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click();", element3);

        WebElement provider = driver.findElement(By.cssSelector(".provider > span:nth-child(2)"));
        provider.click();
        Thread.sleep(2000);

        //Selecting Rights Category from filter
        WebElement rights_category = driver.findElement(By.cssSelector(".open > span:nth-child(1) > span:nth-child(2) > span:nth-child(1)"));
        rights_category.click();
        Thread.sleep(2000);

        dropdown.selectByIndex(1);
        Thread.sleep(2000);

        //Selecting Media Type
        WebElement element4 = driver.findElement(By.xpath("/html/body/app-root/app-overview/main/form/div/div[1]/div/ul[2]/li/app-filter[7]/ul/li[1]/a/span"));
        JavascriptExecutor executor4 = (JavascriptExecutor)driver;
        executor4.executeScript("arguments[0].click();", element4);
        Thread.sleep(2000);
        WebElement media_type = driver.findElement(By.cssSelector(".type > span:nth-child(2)"));
        media_type.click();
        Thread.sleep(2000);

        //Back to Home screen
        driver.findElement(By.cssSelector("a.filter-title:nth-child(2)")).click();

        //Close the browser
        driver.close();
    }


}

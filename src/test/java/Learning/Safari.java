package Learning;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class Safari {

    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        String ProjectPath = System.getProperty("user.dir");
        System.getProperty("webdriver.chrome.driver", ProjectPath+"src/main/resources/drivers/chromedriver-win32/chromedriver.exe");
        System.out.println("Inside Step - user is on login page");
        //System.out.println("Inside Step - user is on login page");

        driver.get("https://partners.shopify.com/organizations");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//input[@id='account_email']")).sendKeys("theboxx420@yahoo.com");
        //System.out.println(driver.getPageSource());



        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='account_lookup']//button[@type = 'submit']")));
        driver.findElement(By.xpath("//form[@id='account_lookup']//button[@type = 'submit']")).click();
        System.out.println("Button clicked");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id = 'account_password']")));
        driver.findElement(By.xpath("//input[@id = 'account_password']")).sendKeys("Proveway@123");

        try {
            Thread.sleep(10000);  // Adjust as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Log in')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();


        driver.findElement(By.xpath( "//li[@class = '_OrganizationsList__listItemWrapper_1395x_6']//div//span[contains(text(), 'Cloathingaadfas')]")).click();

        // Optionally, wait for the next page to load
        try {
            Thread.sleep(3000);  // Adjust as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//nav//span[contains(text(), 'Stores')]")).click();
        driver.findElement(By.xpath("//div[@id='74191798529']//form/button[contains(text(), 'Log in')]")).click();

        //Tab switch

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(windowHandles);
        driver.switchTo().window(tabs.get(1));
        try {
            Thread.sleep(5000);  // Adjust as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Cloathing asa')]")));
        driver.findElement(By.xpath("//div[contains(text(), 'Cloathing asa')]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span//a[@class='Polaris-Navigation__Item']//span[contains(text(), 'Pumper Bundles')]")));
        driver.findElement(By.xpath("//span//a[@class='Polaris-Navigation__Item']//span[contains(text(), 'Pumper Bundles')]")).click();

        //Original Solution
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[2]/div[1]/*[name()='svg'][1]")));
        //WebElement clone = driver.findElement(By.xpath("//td/div[@class = 'actions']//div[@class = 'clone-btn']"));


        driver.switchTo().frame("app-iframe");
        try {
            Thread.sleep(3000);  // Adjust as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//td/div[@class = 'actions']//div[@class = 'clone-btn']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//td/div[@class = 'actions']//div[@class = 'delete-btn']")).click();


        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//:r2s:
    }
}

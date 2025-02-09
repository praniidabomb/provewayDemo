package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Safari {

    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        String ProjectPath = System.getProperty("user.dir");
        System.getProperty("webdriver.chrome.driver", ProjectPath+"src/main/resources/drivers/chromedriver-win32/chromedriver.exe");
        System.out.println("Inside Step - user is on login page");
        //System.out.println("Inside Step - user is on login page");


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://partners.shopify.com/organizations");

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

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Log in')]")));
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

        driver.findElement(By.xpath("sdafdsafdsafdsa"));

        //driver.quit();
    }
}

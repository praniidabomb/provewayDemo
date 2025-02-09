package StepDefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class loginSteps {



    @Given("user is on login page")
    public void user_is_on_login_page() {
        WebDriver driver = new ChromeDriver();
        //String ProjectPath = System.getProperty("user.dir");
        //System.getProperty("webdriver.chrome.driver", ProjectPath+"src/main/resources/drivers/chromedriver-win32/chromedriver.exe");
        System.out.println("Inside Step - user is on login page");
        //System.out.println("Inside Step - user is on login page");


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://partners.shopify.com/organizations");

        String title = driver.getTitle();

        System.out.println(title+ " Start counting 0");
        driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("theboxx420@yahoo.com");
        System.out.println("20 Seconds done");
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        if(title.contains("Partners")){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type = 'submit']")));
            driver.findElement(By.xpath("//button[@type = 'submit']")).click();

            System.out.println("Button clicked");
            driver.findElement(By.xpath("//input[@id = \"account_password\"]")).sendKeys("Proveway@123");
            driver.findElement(By.xpath( "//button[@type = 'submit']//span[contains(text(),'Log in')]")).click();

        }
        // Optionally, wait for the next page to load
        try {
            Thread.sleep(3000);  // Adjust as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //driver.quit();
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Step - user enters username and password");
//        WebDriver driver = new FirefoxDriver();
//
//        driver.get("https://accounts.shopify.com/login?rid=36edf279-ed3e-4f6f-8e82-d74d4312141a");
//
//        System.out.println("Firefox Done");
//
//        driver.quit();
    }
    @And("clicks on login button")
    public void clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Step - user clicks on login button");
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Step - user is navigated to the home page");
    }
}

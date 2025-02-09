package Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko {

    public static void main(String args[])
    {
        //String ProjectPath = System.getProperty("user.dir");
        //System.getProperty("webdriver.gecko.driver", ProjectPath+"src/main/resources/drivers/chromedriver-win32/chromedriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");

        System.out.println("Firefox Done");
    }
}

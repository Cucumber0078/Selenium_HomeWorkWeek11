package webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiWeb {
        static String browser = "chrome";
        static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        static WebDriver driver;

        public static void main(String[] args) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.firefox.driver", "drivers/Firefoxdriver.exe");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.Edge.driver", "drivers/Edgedriver.exe");
                driver = new EdgeDriver();
            } else {
                System.out.println("Wrong Browser Name");

            }
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            WebElement emailField = driver.findElement(By.id("Email"));
            emailField.sendKeys("test123@gmail.com");
            WebElement passwordFiled = driver.findElement(By.name("Password"));
            passwordFiled.sendKeys("test123");
        }


    }

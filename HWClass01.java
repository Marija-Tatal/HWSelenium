package Class01.HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HWClass01 {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver", ".Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.amazon.com/");
        driver.getCurrentUrl();
       String URL= driver.getCurrentUrl();
        System.out.println("This is the current url for the Aamazon website: "+URL);
        String title = driver.getTitle();
        System.out.println("This is the current title for the Amazon website:" + title);
        driver.close();



        }
    }


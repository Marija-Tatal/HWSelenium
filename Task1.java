package HW6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {
       // System.setProperty("web-driver.chrome.driver", ".Drivers/chromedriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        WebElement element =driver.findElement(By.xpath("//div[@id='finish']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].setAttribute('style','visibility:visible;');",element);
        WebElement text =driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
        System.out.println("The hidden word is "+ text.getText());


    }
}

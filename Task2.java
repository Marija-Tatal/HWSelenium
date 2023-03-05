package HWClass04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web-driver.chrome.driver", ".Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> demoBoxes = driver.findElements(By.cssSelector("input[class='cb1-element']"));
        for (WebElement demobox : demoBoxes) {
            String box = demobox.getAttribute("value");
            if (box.equals("Option-4"))
                demobox.click();
            Thread.sleep(2000);
            driver.quit();

        }
    }
}

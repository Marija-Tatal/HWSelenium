package HW6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox=driver.findElement(By.xpath("//body[@id='tinymce']"));
        textBox.click();
        textBox.clear();
        textBox.sendKeys("Hello World!");
        System.out.println(textBox.getText());

        driver.switchTo().defaultContent();
        Thread.sleep(4000);
        driver.quit();


    }
}

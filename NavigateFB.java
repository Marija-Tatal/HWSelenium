package HW0102;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFB {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("web-driver.chrome.driver", ".Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("firstname")).sendKeys("Mia");
        driver.findElement(By.name("lastname")).sendKeys("Martin");
        driver.findElement(By.name("reg_email__")).sendKeys("m.rtin@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("m.rtin@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("123123");
        driver.findElement(By.id("day")).sendKeys("25");
        driver.findElement(By.id("month")).sendKeys("Jan");
        driver.findElement(By.id("year")).sendKeys("1998");
        driver.findElement(By.cssSelector("input[type='radio'][value='1']")).click();

        driver.findElement(By.className("_6j")).click();
        Thread.sleep(5000);

        driver.quit();




    }
}

package HW0102;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateHW {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver",".Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(" https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Marija");
        driver.findElement(By.id("customer.lastName")).sendKeys("Tatalovic");
        driver.findElement(By.id("customer.address.street")).sendKeys("M.B.02");
        driver.findElement(By.name("customer.address.city")).sendKeys("Nis");
        driver.findElement(By.name("customer.address.state")).sendKeys("Serbia");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("18000");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("+38118552693");
        driver.findElement(By.name("customer.ssn")).sendKeys("+38118552693");
        driver.findElement(By.name("customer.username")).sendKeys("Masha");
        driver.findElement(By.name("customer.password")).sendKeys("1234456");
        driver.findElement(By.name("repeatedPassword")).sendKeys("123456");
        driver.findElement(By.className("button")).click();

        Thread.sleep(3000);

        driver.quit();



    }
}

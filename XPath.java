package class3.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web-driver.chrome.driver",".Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter')]")).sendKeys("Tester");
        driver.findElement(By.xpath("//button[contains(@onclick,'showInput()')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("20");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("30");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[text()= 'Get Total']")).click();
        String totalValue = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();

        System.out.println("Total value of a + b = " + totalValue);

        Thread.sleep(5000);
        driver.quit();


    }
}

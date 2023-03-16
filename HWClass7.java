package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HWClass7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // 1.button
        driver.findElement(By.xpath("//button[contains(text(), 'Click')]")).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();


        //2.button
        driver.findElement(By.xpath("//button[contains(text(), 'Change')]")).click();
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='h2']"), "Selenium Webdriver"));
        String text = driver.findElement(By.xpath("//h2[@id='h2']")).getText();
        System.out.println("text displayed is: " + text);


        //3.button
        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
        System.out.println("Is 'Enabled' button displayed: " + driver.findElement(By.xpath("//button[@id='hidden']")).isDisplayed());

        //4.button
        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='disable']")));
        System.out.println("Is 'Button' enabled: " + driver.findElement(By.xpath("//button[@id='disable']")).isEnabled());

        //5. button
        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//input[@id='ch']"), true));
        System.out.println("Is checkbox clicked: " + driver.findElement(By.xpath("//input[@id='ch']")).isSelected());
        driver.quit();


    }
}

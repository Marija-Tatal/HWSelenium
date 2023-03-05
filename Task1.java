package HWClass04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver",".Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkBtn = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean isSelectedBtn = checkBtn.isSelected();
        System.out.println("Is checkbox selected? " + isSelectedBtn);
        if (!isSelectedBtn) {
            checkBtn.click();
        }
        isSelectedBtn = checkBtn.isSelected();
        System.out.println("Check box selected  " + isSelectedBtn);



    }
}

package HomeWork6;

import Utils.commonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class taskN2 extends commonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
//click on get new user
//print the firstname of user
        WebElement button= driver.findElement(By.xpath("//button[text()='Get New User']"));
       button.click();
        //wait
       WebDriverWait waitTime=new WebDriverWait(driver, Duration.ofSeconds(15));
        waitTime.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='First-Name']")));

        WebElement name= driver.findElement(By.xpath("//div[@id='First-Name']"));
        System.out.println(name.getText());
        driver.close();
    }
}

package HomeWork6;

import Utils.commonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class taskN1 extends commonMethods {
    public static void main(String[] args) {
        String url=" http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //click on the start button
        WebElement butt=driver.findElement(By.xpath("//button[@id='startButton']"));
        butt.click();

        //wait
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[@style='padding: 10%;']")));

        //get the text
        WebElement text= driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println(text.getText());
        driver.close();

    }
}

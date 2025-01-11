package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    private static WebDriver driver = Driver.getDriver();
    private static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public static void waitUntilElmIsVisible(WebElement elm){

        wait.until(ExpectedConditions.visibilityOf(elm));
    }

    public static void sleep(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package utilities;

import org.openqa.selenium.JavascriptExecutor;

import static utilities.BasePage.driver;

public class BrowserUtils {

    public static void scrollDownAndUp() {
        for (int i = 0; i < 2; i++){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight / 3);");
            WaitUtils.sleep(1);
            js.executeScript("window.scrollTo(0, 0);");
        }
    }
}

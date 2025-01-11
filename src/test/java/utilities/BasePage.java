package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected static WebDriver driver = Driver.getDriver();

    public BasePage(){
        PageFactory.initElements(driver, this);
    }
}


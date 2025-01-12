package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;
import utilities.WaitUtils;

public class SingleBrokerPage extends BasePage {

    @FindBy(xpath = "//span[contains(@class, 'MuiTypography-caption mui-style-1i36267') and contains(text(), '/')]")
    private WebElement address;

    @FindBy(xpath = "//span[contains(@class, 'MuiTypography-caption mui-style-14qs989')]")
    private WebElement properties;

    @FindBy(xpath = "(//*[contains(@class, 'MuiLink-underlineNone mui-style-1ktzac6')])[1]")
    private WebElement firstPhoneNumber;

    @FindBy(xpath = "(//*[contains(@class, 'MuiLink-underlineNone mui-style-1ktzac6')])[2]")
    private WebElement secondPhoneNumber;


    public boolean isAddressDisplayed(){
        WaitUtils.waitUntilElmIsVisible(address);
        return address.isDisplayed();
    }

    public boolean arePropertiesDisplayed(){
        WaitUtils.waitUntilElmIsVisible(properties);
        return properties.isDisplayed();
    }

    public boolean isFirstNumberDisplayed(){
        WaitUtils.waitUntilElmIsVisible(firstPhoneNumber);
        return firstPhoneNumber.isDisplayed();
    }

    public boolean isSecondNumberDisplayed(){
        WaitUtils.waitUntilElmIsVisible(secondPhoneNumber);
        return secondPhoneNumber.isDisplayed();
    }


}

package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;
import utilities.BrowserUtils;
import utilities.WaitUtils;

import java.util.*;

public class AllBrokersPage extends BasePage {

    @FindBy(xpath = "//*[contains(@class, 'MuiTypography-h6')]")
    private WebElement brokerName;

    @FindBy(id = "broker-keyword")
    private WebElement searchBar;

    //We use Set instead of a List in case the list of brokers is duplicated and by doing this we avoid duplications
    private Set<String> brokersName = new HashSet<>();

    public Set<String> getAllBrokerNames() {

        WaitUtils.waitUntilElmIsVisible(brokerName);
        //We use this method that is declared on BrowserUtils to scroll down and up so we can get all brokers
        BrowserUtils.scrollDownAndUp();
        List<WebElement> brokers = driver.findElements(By.xpath("//*[contains(@class, 'MuiTypography-h6')]"));

        for (WebElement elm : brokers) {
            brokersName.add(elm.getText());
        }
        return brokersName;
    }

    public void searchForABroker(String str) {
        searchBar.sendKeys(str);
    }

    public void openSingleBroker() {
        WaitUtils.sleep(1);
        brokerName.click();
    }
}
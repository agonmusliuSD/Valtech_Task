package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;
import utilities.WaitUtils;

import java.util.ArrayList;
import java.util.List;

public class AllBrokersPage extends BasePage {

    @FindBy(xpath = "//*[contains(@class, 'MuiTypography-h6')]")
    private WebElement brokerName;

    @FindBy(id = "broker-keyword")
    private WebElement searchBar;

    private List<String> brokersName = new ArrayList<>();

    public List<String> getAllBrokerNames(){

        WaitUtils.waitUntilElmIsVisible(brokerName);
        List<WebElement> brokers = driver.findElements(By.xpath("//*[contains(@class, 'MuiTypography-h6')]"));

        for(WebElement elm: brokers){
            brokersName.add(elm.getText());
        }
        return brokersName;
    }

    public void searchForABroker(String str){
        searchBar.sendKeys(str);
    }

    public void openSingleBroker(){
        WaitUtils.sleep(1);
        brokerName.click();
    }
}
package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.AllBrokersPage;
import pages.SingleBrokerPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.*;

public class BrokerDetailsStepDefs {

    private WebDriver driver = Driver.getDriver();
    private AllBrokersPage allBrokersPage = new AllBrokersPage();
    private SingleBrokerPage singleBrokerPage = new SingleBrokerPage();

    @Given("I am on the Yavlena brokers page")
    public void iAmOnTheYavlenaBrokersPage() {

        driver.get(ConfigurationReader.getProperty("url"));
    }

    @When("I extract all broker names displayed on the page")
    public void iExtractAllBrokerNamesDisplayedOnThePage() {
        allBrokersPage.getAllBrokerNames();
    }

    @Then("I search for each broker and verify the address, phone numbers, and property count for each broker")
    public void iSearchForEachBrokerByTheirName() {

        for(String str: allBrokersPage.getAllBrokerNames()){

            allBrokersPage.searchForABroker(str + Keys.ENTER);
            allBrokersPage.openSingleBroker();
            assertTrue(singleBrokerPage.arePropertiesDisplayed());
            assertTrue(singleBrokerPage.isAddressDisplayed());
            assertTrue(singleBrokerPage.isFirstNumberDisplayed());

            //There are brokers with just one phone number so that's why the use of try/catch block
            try{
                assertTrue(singleBrokerPage.isSecondNumberDisplayed());
            }catch (Exception e){
                System.out.println( str + " has only one phone number");
            }

            driver.navigate().back();
            driver.navigate().back();
            WaitUtils.sleep(1);
        }
    }
}

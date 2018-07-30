package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.Ticketstoworldimpl;

public class StepDefinitions {

    Ticketstoworldimpl obj = null;

    @Given("^launchApplication$")
    public void launchapplication() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        obj=  new Ticketstoworldimpl();
        obj.SetDriverDetailsAndlaunchBrowser();
        System.out.println("welcome");
    }

    @And("^fillFlightDetailsForm$")
    public void fillflightdetailsform() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        obj.fillFlightSearchDetails();
        System.out.println("welcome");

    }

    @Then("^Searchflights$")
    public void searchflights() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("welcome");

    }
}

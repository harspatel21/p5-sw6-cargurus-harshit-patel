package au.com.carguide.steps;

import au.com.carguide.pages.BuyPage;
import au.com.carguide.pages.SearchUsedCarPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuySteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage()  {

    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab(){
        new BuyPage().mouseHoverOnBuyAndSell();

    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink(){
        new BuyPage().clickOnSerchCars();

    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage()  {

    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make){
        new BuyPage().selectMake(make);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model){
       new BuyPage().selectModel(model);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location){
       new BuyPage().selectLocation(location);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price){
        new BuyPage().selectPrice(price);

    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab(){
        new BuyPage().clickOnFindMyNextCarButton();

    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make)  {

    }

    @And("^I click ‘Used’ link$")
    public void iClickUsedLink()  {
        new SearchUsedCarPage().clickOnUsedLink();

    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage()  {

    }

}

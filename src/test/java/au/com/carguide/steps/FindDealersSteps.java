package au.com.carguide.steps;

import au.com.carguide.pages.FindDealerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class FindDealersSteps {
    @And("^I click ‘Find a Dealer’$")
    public void iClickFindADealer() {
        new FindDealerPage().clickOnFindADealerLink();
    }

    @Then("^I navigate to ‘car-dealers’ page$")
    public void iNavigateToCarDealersPage() {
    }

    @And("^I should see the dealer names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealerName) {
        new FindDealerPage().verifyDealerNamesAreDesplayed(dealerName);
    }
}

package pruebaChoucair.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class pruebaChoucairStepDefinitions {

    @Before
    public void setstage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Miguel wants to automatize creation of user in utest$")
    public void thanMiguelWantsToAutomatizeCreationOfUserInUtest() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^he fill the information$")
    public void heFillTheInformation() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^he create a new user$")
    public void heCreateANewUser() {
        // Write code here that turns the phrase above into concrete actions
    }
}

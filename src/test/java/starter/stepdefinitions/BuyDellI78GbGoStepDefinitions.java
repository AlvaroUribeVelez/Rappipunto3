package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.WebDriver;
import starter.navigation.Compra;
import starter.navigation.NavegaA;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.CoreMatchers.*;
import static starter.matchers.StringContainsIgnoringCase.containsIgnoringCase;


public class BuyDellI78GbGoStepDefinitions {

    public WebDriver driver;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) esta en la pagina principal")
    public void estaEnLaPaginaPrincipal(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.DemoBlazeHomePage());
    }

    @When("Ella/El navega a {string}")
    public void navegaA(String term) {

        withCurrentActor(
                NavegaA.term(term)
        );
    }
    @When("Ella/El selecciona {string}")
    public void selecciona(String term) {

        withCurrentActor(
                NavegaA.term(term)
        );
    }
    @When("Ella/El compra el producto")
    public void compra() {

        withCurrentActor(
                Compra.comprar()
        );
    }


}

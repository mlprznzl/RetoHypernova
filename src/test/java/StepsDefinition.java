import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepsDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) accede a la pagina de Hypernova")
    public void accede_a_la_pagina_de_hypernova(String actor) {
        theActorCalled(actor).attemptsTo(CargarSitio.accederASitio());
        theActorInTheSpotlight().attemptsTo(CargarSitio.cerrarPopup());
    }
    @And("selecciona el modulo de Contacto")
    public void selecciona_el_modulo_de_contacto() {
        theActorInTheSpotlight().attemptsTo(CargarSitio.navegarAContacto());
    }
    @When("completa el formulario con un correo invalido")
    public void completa_el_formulario_con_un_correo_invalido() {
        theActorInTheSpotlight().attemptsTo(FormularioContacto.llenarFormularioContacto());
    }
    @Then("el sistema retorna mensajes de error debido al correo invalido")
    public void el_sistema_retorna_mensajes_de_error_debido_al_correo_invalido() {
        OnStage.withCurrentActor(Ensure.that(FormularioContacto.errorForm).text().contains("One or more fields have an error. Please check and try again."));
    }

}
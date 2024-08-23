package co.com.sqasa.automation.stepdefinitions;

import co.com.sqasa.automation.questions.ValidarRespuesta;
import co.com.sqasa.automation.questions.ValidarRespuestaEliminada;
import co.com.sqasa.automation.tasks.VerificarCompra;
import co.com.sqasa.automation.tasks.VerificarCompraEliminada;
import co.com.sqasa.automation.utils.Contants;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class SimulacionStepDefinition {

    @Managed
    WebDriver driver;

    @Before
    public void configurar() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Automatizador");

    }

    @Dado("que el usuario esta en la página inicial")
    public void queElUsuarioEstaEnLaPáginaInicial() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Contants.BASE_URL));
    }

    @Cuando("el usuario agrega productos en el carrito de compras")
    public void elUsuarioAgregaProductosEnElCarritoDeCompras() {
      OnStage.theActorInTheSpotlight().attemptsTo(
              VerificarCompra.compra()
      );
    }

    @Entonces("el usuario completa compra {string}")
    public void elUsuarioCompletaCompra(String string) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarRespuesta.message(), Matchers.is(true)));
    }


    @Cuando("el usuario elimina productos en el carrito de compras")
    public void elUsuarioEliminaProductosEnElCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VerificarCompraEliminada.compra()
        );
    }

    @Entonces("el usuario completa la eliminacion {string}")
    public void elUsuarioCompletaLaEliminacion(String string) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarRespuestaEliminada.message(), Matchers.is(true)));
    }
}

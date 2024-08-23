package co.com.sqasa.automation.questions;

import co.com.sqasa.automation.userinterfaces.EliminarPag;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebElement;

public class ValidarRespuestaEliminada implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElement mensajeElement = EliminarPag.MENSAJE2.resolveFor(actor);
        return mensajeElement.isDisplayed();
    }

    public static ValidarRespuestaEliminada message() {
        return new ValidarRespuestaEliminada();
    }
}

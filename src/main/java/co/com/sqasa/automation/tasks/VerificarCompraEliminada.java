package co.com.sqasa.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.sqasa.automation.userinterfaces.CompraPag.BTN_AÑADIR;
import static co.com.sqasa.automation.userinterfaces.EliminarPag.*;

public class VerificarCompraEliminada implements Task {
    public VerificarCompraEliminada() {
    }

    public static VerificarCompraEliminada compra (){
        return new VerificarCompraEliminada();
    }

    @Override
    public <T extends Actor> void performAs (T actor){


        actor.attemptsTo(

                Click.on(BTN_CAT_CUMPLE),
                Click.on(BTN_PRODUCTO2),
                Click.on(BTN_AÑADIR),
                Click.on(BTN_ELIMINAR)

        );
    }
}

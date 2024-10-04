package co.com.choucair.certification.reto_autom.tasks;

import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Quitar implements Task {

    public static Quitar articulo() {
        return Tasks.instrumented(Quitar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ObjetosProductos.BTN_REMOVE));
    }
}

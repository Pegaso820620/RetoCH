package co.com.choucair.certification.reto_autom.tasks;

import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AnadirCarrito implements Task {
    public static AnadirCarrito producto() {
        return Tasks.instrumented(AnadirCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ObjetosProductos.PRODUCTO_A)
        );
    }
}

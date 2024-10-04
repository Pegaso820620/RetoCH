package co.com.choucair.certification.reto_autom.tasks;

import co.com.choucair.certification.reto_autom.models.TablaCompras;
import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Llenar implements Task {

    public TablaCompras tablaCompras;
    public Llenar(TablaCompras tablaCompras) {this.tablaCompras = tablaCompras;}

    public static Llenar campos(TablaCompras tablaCompras) {
        return Tasks.instrumented(Llenar.class, tablaCompras);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tablaCompras.getNombre()).into(ObjetosCompra.NOMBRE),
                Enter.theValue(tablaCompras.getZip()).into(ObjetosCompra.ZIP),
                Click.on(ObjetosCompra.BTN_CONTINUE));
    }
}




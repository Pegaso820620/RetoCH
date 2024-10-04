package co.com.choucair.certification.reto_autom.tasks;

import co.com.choucair.certification.reto_autom.models.TablaCompras;
import co.com.choucair.certification.reto_autom.models.TablaUsuarios;
import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosCompra;
import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Digitar implements Task{
    public TablaCompras tablaCompras;
    public Digitar(TablaCompras tablaCompras){
        this.tablaCompras = tablaCompras;
    }

    public static Digitar datosEnvio(TablaCompras tablaCompras) {
        return Tasks.instrumented(Digitar.class, tablaCompras);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tablaCompras.getNombre()).into(ObjetosCompra.NOMBRE),
                Enter.theValue(tablaCompras.getApellido()).into(ObjetosCompra.APELLIDO),
                Enter.theValue(tablaCompras.getZip()).into(ObjetosCompra.ZIP),
                Click.on(ObjetosCompra.BTN_CONTINUE),
                Click.on(ObjetosCompra.BTN_FINISH));
    }
}






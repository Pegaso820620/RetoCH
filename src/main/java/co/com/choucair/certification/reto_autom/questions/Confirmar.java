package co.com.choucair.certification.reto_autom.questions;

import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosCompra;
import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.checkerframework.checker.units.qual.C;

public class Confirmar implements Question {
    public static Confirmar laCompra() {
        return new Confirmar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ObjetosCompra.CONF_COMPRA).answeredBy(actor);
    }
}




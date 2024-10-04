package co.com.choucair.certification.reto_autom.questions;

import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validar implements Question {

    public static Validar Carrito() {
        return new Validar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ObjetosProductos.CONF_PRODUCTO).answeredBy(actor);
    }
}

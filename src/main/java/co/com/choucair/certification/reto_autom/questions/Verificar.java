package co.com.choucair.certification.reto_autom.questions;

import co.com.choucair.certification.reto_autom.userinterfaces.ObjetosLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question {
    public static Verificar Error() {
        return new Verificar();
    }


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ObjetosLogin.ERROR).answeredBy(actor);
    }
}

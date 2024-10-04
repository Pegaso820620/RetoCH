package co.com.choucair.certification.reto_autom.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjetosCompra {
    public static final Target BTN_CHECKOUT = Target.the("Boton para iniciar proceso de compra").located(By.id("checkout"));
    public static final Target NOMBRE = Target.the("Nombre del comprador").located(By.id("first-name"));
    public static final Target APELLIDO = Target.the("Apellido del comprador").located(By.id("last-name"));
    public static final Target ZIP = Target.the("Codigo postal").located(By.id("postal-code"));
    public static final Target BTN_CONTINUE = Target.the("Boton para continuar").located(By.id("continue"));
    public static final Target BTN_FINISH = Target.the("Boton para finalizar la compra").located(By.id("finish"));
    public static final Target CONF_COMPRA = Target.the("Confirmacion de la compra").located(By.xpath("//*[contains(text(),'Thank you for your order!')]"));
    public static final Target CONF_ALERTA = Target.the("Mensaje por campo vacio").located(By.xpath("//*[contains(text(),'Error:')]"));
}



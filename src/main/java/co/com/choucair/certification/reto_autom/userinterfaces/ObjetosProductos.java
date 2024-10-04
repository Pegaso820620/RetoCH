package co.com.choucair.certification.reto_autom.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjetosProductos {
    public static final Target PRODUCTO_A = Target.the("Seleccionar producto ").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target PRODUCTO_B = Target.the("Seleccionar producto ").located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target PRODUCTO_C = Target.the("Seleccionar producto ").located(By.id("add-to-cart-sauce-labs-onesie"));
    public static final Target BTN_CARRITO = Target.the("Ingresar al carrito").located(By.xpath("//a[@class='shopping_cart_link']"));
    public static final Target CONF_PRODUCTO = Target.the("Confirmacion del producto").located(By.xpath("//div[@class='inventory_item_name']"));
    public static final Target BTN_REMOVE = Target.the("Boton para remover producto").located(By.id("remove-sauce-labs-backpack"));
    public static final Target TOTAL_PRODUCTOS = Target.the("Total de productos en el carrito").located(By.xpath("//span[@class='shopping_cart_badge']"));


}

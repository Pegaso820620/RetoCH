package co.com.choucair.certification.reto_autom.stepdefinitions;

import co.com.choucair.certification.reto_autom.models.TablaCompras;
import co.com.choucair.certification.reto_autom.models.TablaUsuarios;
import co.com.choucair.certification.reto_autom.questions.*;
import co.com.choucair.certification.reto_autom.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class StepDefinitions {

    @DataTableType
    public TablaUsuarios tablaUsuariosEntry(Map<String, String> entry) {
        return new TablaUsuarios(entry.get("usuario"), entry.get("contrasenna"));
    }

    @DataTableType
    public TablaCompras tablaComprasEntry(Map<String, String> entry){
        return new TablaCompras(entry.get("nombre"), entry.get("apellido"), entry.get("zip") );
    }


    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario ingresa a la tienda virtual")
    public void queElUsuarioIngresaALaTiendaVirtual() {
        OnStage.theActorCalled("Usuario").wasAbleTo(Abrir.laPagina());
    }

    @When("ingrese usuario y contrasenna")
    public void ingreseUsuarioYContrasenna(List<TablaUsuarios> tablaUsuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales(tablaUsuarios.get(0)));
    }

    @Then("se verifica que ingreso correctamente")
    public void seVerificaQueIngresoCorrectamente(List<String> msj) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Comprobar.Mensaje(), Matchers.equalTo(msj.get(1))));
    }

    //Caso3: confirmación mensaje de error
    @Then("verifica el mensaje de error")
    public void verificaElMensajeDeError(List<String> msj) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.Error(), Matchers.equalTo(msj.get(1))));
    }

    // HU2_Caso1: Añadir producto
    @And("selecciona un producto para ingresarlo al carrito")
    public void seleccionaUnProductoParaIngresarloAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AnadirCarrito.producto());
    }

    @And("ingreso al carrito de compras")
    public void ingresoAlCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCarrito.carrito());
    }

    @Then("en el carrito de compras se mostrara el producto seleccionado")
    public void enElCarritoDeComprasSeMostraraElProductoSeleccionado(List<String> msj) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.Carrito(), Matchers.equalTo(msj.get(1))));
    }

    // HU2_Caso2: Seleccionar varios productos
    @And("selecciona varios productos para ingresarlo al carrito")
    public void seleccionaVariosProductosParaIngresarloAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarACarrito.productos());
    }

    @Then("en el carrito de compras se mostrara el total de productos seleccionados")
    public void enElCarritoDeComprasSeMostraraElTotalDeProductosSeleccionados(List<String> msj) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Totalizar.articulos(), Matchers.equalTo(msj.get(1))));
    }

    //HU2_Caso3: Remover producto
    @And("remuevo un producto seleccionado del carrito")
    public void remuevoUnProductoSeleccionadoDelCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(Quitar.articulo());
    }

    //HU3_Caso1: Compra exitosa
    @And("inicie el checkout")
    public void inicieElCheckout() {
        OnStage.theActorInTheSpotlight().attemptsTo(Comprar.compra());
    }

    @And("ingrese los datos y finalice la compra")
    public void ingreseLosDatosYFinaliceLaCompra(List<TablaCompras> tablaCompras) {
        OnStage.theActorInTheSpotlight().attemptsTo(Digitar.datosEnvio(tablaCompras.get(0)));
    }

    @Then("la compra se realize de forma correcta")
    public void laCompraSeRealizeDeFormaCorrecta(List<String> msj){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Confirmar.laCompra(), Matchers.equalTo(msj.get(1))));
    }

    //HU3_Caso2: Compra exitosa
    @And("ingrese los datos")
    public void ingreseLosDatos(List<TablaCompras> tablaCompras) {
        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.campos(tablaCompras.get(0)));
    }

    @Then("el sistema mostrar un mensaje de alerta")
    public void elSistemaMostrarUnMensajeDeAlerta(List<String> msj) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Alertar.vacio(), Matchers.equalTo(msj.get(1))));
    }


}



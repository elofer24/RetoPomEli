package co.com.sanangel.stepDefinitions;

import co.com.sanangel.steps.PaginaInicioStep;
import co.com.sanangel.steps.AccesoStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinition {

    @Steps
    PaginaInicioStep paginaInicioStep;

    @Steps
    AccesoStep accesoStep;

    @Dado("^el usuario se encuentra en la pagina web$")
    public void elUsuarioSeEncuentraEnLaPaginaWeb() throws IOException {
    paginaInicioStep.abrirNavegador();
    paginaInicioStep.clicIngresar();
    accesoStep.ingresarCorreo();
    accesoStep.ingresarClave();
    paginaInicioStep.clicAcceder();


    }

    @Cuando("^ingrese el correo con la clave asi podra seleccionar agregar producto al carrito$")
    public void ingreseElCorreoConLaClaveAsiPodraSeleccionarAgregarProductoAlCarrito() throws IOException {
    paginaInicioStep.clicSeleccionar();
    paginaInicioStep.clicAmor();
    paginaInicioStep.clicCarrito();
    paginaInicioStep.clicCumple();

    }


    @Entonces("^el visualizara en su perfil sus compras realizadas$")
    public void elVisualizaraEnSuPerfilSusComprasRealizadas() {

    }












}

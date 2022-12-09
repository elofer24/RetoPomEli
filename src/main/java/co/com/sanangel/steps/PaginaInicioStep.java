package co.com.sanangel.steps;

import co.com.sanangel.pageObjects.PaginaInicioPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaInicioStep {

    PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();


    @Step
    public void abrirNavegador (){
        paginaInicioPageObject.open();
    }

   @Step
    public void clicIngresar (){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnMiCuenta()).click();
   }

   @Step
    public void clicAcceder (){
        paginaInicioPageObject.open();

   }

   @Step
    public void clicSeleccionar(){
        paginaInicioPageObject.open();
   }

   @Step
    public void clicAmor(){
        paginaInicioPageObject.open();
   }

   @Step
    public void clicCarrito(){
        paginaInicioPageObject.open();
   }
   @Step
    public void clicCumple(){
        paginaInicioPageObject.open();

   }



}

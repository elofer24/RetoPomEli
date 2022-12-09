package co.com.sanangel.steps;

import co.com.sanangel.pageObjects.PaginaAccesoPageObject;
import co.com.sanangel.utils.Datos;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class AccesoStep {

    PaginaAccesoPageObject paginaAccesoPageObject = new PaginaAccesoPageObject();
    Datos datos = new Datos();




    @Step
    public void ingresarCorreo() throws IOException {
    paginaAccesoPageObject.getDriver().findElement(paginaAccesoPageObject.getTxtCorreo())
            .sendKeys(datos.leerDatosExcel("DatosExcel.xlsx","DatosAcceso",1,0));


    }
   @Step
    public void ingresarClave() throws IOException {
    paginaAccesoPageObject.getDriver().findElement(paginaAccesoPageObject.getTxtClave())
            .sendKeys(datos.leerDatosExcel("DatosExcel.xlsx","DatosAcceso",1,1));

   }





}

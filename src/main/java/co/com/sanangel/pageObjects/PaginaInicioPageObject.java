package co.com.sanangel.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://sanangel.com.co/")

public class PaginaInicioPageObject extends PageObject {


By btnMiCuenta = By.xpath("//a[@href='https://sanangel.com.co/mi-cuenta/'][1]");

By btnAcceder = By.xpath("//button[@value='Acceder']");

By btnSeleccionar = By.xpath("//a[@href='https://sanangel.com.co/categoria/4-amor-y-romance-flores-san-angel-floristerias/'][1]");

By imgAmor = By.xpath("//a[@href='https://sanangel.com.co/producto/caja-agata-24-rosas/'][1]");

By aggCarrito = By.linkText("Añadir al carrito");


By imgCumple = By.xpath("//a[@href='https://sanangel.com.co/categoria/8-ramos-de-flores-para-cumpleanos'][1]");



    public By getBtnMiCuenta() {
        return btnMiCuenta;
    }


    public By getBtnAcceder() {
        return btnAcceder;
    }

    public By getBtnSeleccionar() {
        return btnSeleccionar;
    }


    public By getImgAmor() {
        return imgAmor;
    }

    public By getAggCarrito() {
        return aggCarrito;
    }


    public By getImgCumple() {
        return imgCumple;
    }


}





package co.com.sanangel.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaAccesoPageObject extends PageObject {

    By txtCorreo = By.xpath("//input[@id='username']");
    By txtClave = By.xpath("//input[@autocomplete='current-password']");


    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtClave() {
        return txtClave;
    }


}

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://hypernovalabs.com/")
public class SitioHypernova extends PageObject {

    static By popupDiv = By.id("pum_popup_title_6710");
    static By popupClose = By.xpath("//button[@type=\"button\"]");
    static By moduloContacto = By.xpath("(//a[@href='https://hypernovalabs.com/contact/'][contains(.,'Contact')])[1]");

}
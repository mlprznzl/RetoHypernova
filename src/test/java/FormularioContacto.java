import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class FormularioContacto extends PageObject {

    static By campoPrimerNombre = By.xpath("//input[@name='first-name']");
    static By campoApellido = By.xpath("//input[@name='last-name']");
    static By campoEmpresa = By.xpath("//input[@name='company']");
    static By campoEmail = By.xpath("//input[@name='email']");
    static By campoAsunto = By.xpath("//input[@placeholder='Asunto']");
    static By campoMensaje = By.xpath("//textarea[@name=\"message\"]");
    static By botonSend = By.xpath("//input[@value=\"Send\"]");

    static Target errorForm = Target.the("Mensaje de error").locatedBy("//div[@class=\"wpcf7-response-output\"]");

    public static Performable llenarCampoPrimerNombre() {
        return Task.where("^(.*) llena el campo de Primer nombre",
                Clear.field(campoPrimerNombre),
                Enter.theValue("Test").into(campoPrimerNombre)
        );
    }

    public static Performable llenarCampoApellido() {
        return Task.where("^(.*) llena el campo de Apellido",
                Clear.field(campoApellido),
                Enter.theValue("Test").into(campoApellido)
        );
    }

    public static Performable llenarCampoEmpresa() {
        return Task.where("^(.*) llena el campo de Empresa",
                Clear.field(campoEmpresa),
                Enter.theValue("Test").into(campoEmpresa)
        );
    }

    public static Performable llenarCampoEmail() {
        return Task.where("^(.*) llena el campo de Email",
                Clear.field(campoEmail),
                Enter.theValue("test@").into(campoEmail)
        );
    }

    public static Performable llenarCampoAsunto() {
        return Task.where("^(.*) llena el campo de Asunto",
                Clear.field(campoAsunto),
                Enter.theValue("Test").into(campoAsunto)
        );
    }

    public static Performable llenarCampoMensaje() {
        return Task.where("^(.*) llena el campo de Mensaje",
                Clear.field(campoMensaje),
                Enter.theValue("Test").into(campoMensaje)
        );
    }

    public static Performable clicSend() {
        return Task.where("^(.*) hace clic en el boton de Send",
                Click.on(botonSend)
        );
    }

    public static Performable llenarFormularioContacto() {
        return Task.where("^(.*) hace clic en el boton de Send",
                Scroll.to(campoPrimerNombre),
                llenarCampoPrimerNombre(),
                llenarCampoApellido(),
                llenarCampoEmpresa(),
                llenarCampoEmail(),
                llenarCampoAsunto(),
                llenarCampoMensaje(),
                clicSend()
        );
    }

}
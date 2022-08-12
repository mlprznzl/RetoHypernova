import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class CargarSitio {

    public static Performable accederASitio() {
        return Task.where("^(.*) carga el sitio de Hypernova",
                Open.browserOn().the(SitioHypernova.class)
        );
    }

    public static Performable cerrarPopup() {
        return Task.where("^(.*) cierra el pop-up emergente",
                Click.on(SitioHypernova.popupDiv),
                Click.on(SitioHypernova.popupClose)
        );
    }

    public static Performable navegarAContacto() {
        return Task.where("^(.*) navega a seccion de Contacto",
                Click.on(SitioHypernova.moduloContacto)
        );
    }

}
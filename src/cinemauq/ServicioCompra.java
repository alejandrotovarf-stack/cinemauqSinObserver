package cinemauq;

/**
 * Coordinador: confirma la compra y, a continuacion, hace las llamadas
 * explicitas a cada servicio que debe reaccionar.
 * (En CinemaUQ esta clase corresponde a ServicioCompraFacade.)
 */
public class ServicioCompra {
    private final ServicioPuntos servicioPuntos;
    private final ServicioNotificaciones servicioNotificaciones;

    public ServicioCompra(ServicioPuntos servicioPuntos, ServicioNotificaciones servicioNotificaciones) {
        this.servicioPuntos = servicioPuntos;
        this.servicioNotificaciones = servicioNotificaciones;
    }

    public void confirmar(Compra compra, boolean darPuntos) {
        if (compra.confirmar()) {
            if (darPuntos) servicioPuntos.acumularPorCompra(compra);   // reaccion 1
            servicioNotificaciones.notificar(compra);                   // reaccion 2
            // Si manana se necesita otra reaccion, hay que agregarla AQUI.
        }
    }
}

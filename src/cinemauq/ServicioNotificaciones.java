package cinemauq;

import java.util.ArrayList;
import java.util.List;

/** Guarda en una bandeja el aviso que ve el cliente cuando cambia su compra. */
public class ServicioNotificaciones {
    private final List<String> bandeja = new ArrayList<>();

    public void notificar(Compra compra) {
        String mensaje = "Tu compra " + compra.getId() + " ahora esta " + compra.getEstado();
        bandeja.add(mensaje);
        System.out.println("[ServicioNotificaciones] " + mensaje);
    }

    public List<String> getBandeja() { return bandeja; }
}

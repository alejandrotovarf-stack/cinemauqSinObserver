package cinemauq;

/**
 * Representa una compra de CinemaUQ.
 * Solo guarda sus datos y su estado; no sabe nada de puntos ni de notificaciones.
 */
public class Compra {
    private final String id;
    private final String cliente;
    private final double total;
    private String estado = "PENDIENTE";

    public Compra(String id, String cliente, double total) {
        this.id = id;
        this.cliente = cliente;
        this.total = total;
    }

    /**
     * Pasa la compra de PENDIENTE a CONFIRMADA.
     *
     * @return true si el estado realmente cambio; false si ya estaba confirmada.
     */
    public boolean confirmar() {
        if ("CONFIRMADA".equals(estado)) return false;
        estado = "CONFIRMADA";
        return true;
    }

    public String getId() { return id; }
    public String getCliente() { return cliente; }
    public double getTotal() { return total; }
    public String getEstado() { return estado; }
}

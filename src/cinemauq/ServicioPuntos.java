package cinemauq;

/** Regla de negocio: 1 punto por cada $1.000 de una compra confirmada. */
public class ServicioPuntos {
    private static final double VALOR_POR_PUNTO = 1000;
    private int puntosAcumulados = 0;

    public void acumularPorCompra(Compra compra) {
        if (!"CONFIRMADA".equals(compra.getEstado())) return;
        int puntos = (int) (compra.getTotal() / VALOR_POR_PUNTO);
        puntosAcumulados += puntos;
        System.out.println("[ServicioPuntos] +" + puntos + " puntos para " + compra.getCliente());
    }

    public int getPuntosAcumulados() { return puntosAcumulados; }
}

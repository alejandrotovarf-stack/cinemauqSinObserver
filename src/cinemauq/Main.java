package cinemauq;

/** Demostracion: confirmar compras SIN el patron Observer. */
public class Main {
    public static void main(String[] args) {
        ServicioPuntos puntos = new ServicioPuntos();
        ServicioNotificaciones notificaciones = new ServicioNotificaciones();
        ServicioCompra servicio = new ServicioCompra(puntos, notificaciones);

        System.out.println("=== Compra 1: con puntos y notificacion ===");
        Compra compra1 = new Compra("CMP-001", "Laura", 45000);
        servicio.confirmar(compra1, true);

        System.out.println("\n=== Compra 2: solo notificacion (sin puntos) ===");
        Compra compra2 = new Compra("CMP-002", "Laura", 30000);
        servicio.confirmar(compra2, false);

        System.out.println("\n=== Resultado ===");
        System.out.println("Puntos acumulados: " + puntos.getPuntosAcumulados());
        System.out.println("Bandeja: " + notificaciones.getBandeja());
    }
}

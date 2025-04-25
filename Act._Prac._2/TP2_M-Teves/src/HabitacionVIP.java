public class HabitacionVIP extends Habitacion {
    private String serviciosExtra;

    public HabitacionVIP(int numero, String tipo, double precio, String serviciosExtra) {
        super(numero, tipo, precio);
        this.serviciosExtra = serviciosExtra;
    }

    public String getServiciosExtra() {
        return serviciosExtra;
    }
}
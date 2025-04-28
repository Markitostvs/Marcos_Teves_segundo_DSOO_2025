package Hotel;

public class Habitacion_VIP extends Habitacion{
    private String servicio_extra;

    public Habitacion_VIP(int numero, double precio, String tipo, String servicio_extra){
        super(numero, precio, tipo);
        this.servicio_extra = servicio_extra;
    }

    public void setServicio_extra(String servicio_extra) {
        this.servicio_extra = servicio_extra;
    }

    public String getServicio_extra() {
        return servicio_extra;
    }
}
/*
 * Clase HabitaciónVIP hereda de Habitación.
 * Relación: Herencia.
 */
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private String direccion;
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public void realizarReserva(Reserva r) {
        reservas.add(r);
    }

    public List<Reserva> obtenerReservasPorCliente(String dni) {
        List<Reserva> resultado = new ArrayList<>();
        for (Reserva r : reservas) {
            if (r.getCliente().getDni().equals(dni)) {
                resultado.add(r);
            }
        }
        return resultado;
    }
}
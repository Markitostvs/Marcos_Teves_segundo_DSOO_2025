import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private Persona cliente;
    private Habitacion habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Pago pago;

    public Reserva(Persona cliente, Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.pago = new Pago(calcularCostoTotal()); // composición
    }

    public long calcularDuracion() {
        return ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    }

    public double calcularCostoTotal() {
        return calcularDuracion() * habitacion.getPrecio();
    }

    public Persona getCliente() { return cliente; }
    public Habitacion getHabitacion() { return habitacion; }
    public Pago getPago() { return pago; }
}
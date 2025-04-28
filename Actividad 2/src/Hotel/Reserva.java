package Hotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private Persona cliente;
    private Habitacion habitacion;
    private LocalDate fecha_Inicio;
    private LocalDate fecha_Fin;
    private Pago pago;
    private String metodo;

    public Reserva(Persona cliente, Habitacion habitacion, LocalDate fecha_Inicio, LocalDate fecha_Fin, String metodo){
        this. cliente = cliente;
        this. habitacion = habitacion;
        this. fecha_Inicio = fecha_Inicio;
        this. fecha_Fin = fecha_Fin;
        this. metodo = metodo;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDate getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFechaInicio(LocalDate fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public LocalDate getFecha_Fin() {
        return fecha_Fin;
    }

    public void setFecha_Fin(LocalDate fecha_Fin) {
        this.fecha_Fin = fecha_Fin;
    }

    public Pago getPago() {
        return pago;
    }

    public long calcular_Duracion() {
        return ChronoUnit.DAYS.between(fecha_Inicio, fecha_Fin);
    }

    public double calcularCostoTotal() {
        return calcular_Duracion() * habitacion.getPrecio();
    }

}
/*
 * Clase Reserva representa una reserva de una habitación hecha por una persona.
 * Relación: Asociación con Persona y Habitacion, Composición con Pago.
 */
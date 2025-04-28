package Hotel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Gran Hotel", "27 e 6 y 5");

        // Crear habitaciones
        Habitacion habitacion1 = new Habitacion(101, 5000, "simple");
        Habitacion_VIP habitacionVIP = new Habitacion_VIP(201, 10000, "Suite", "Jacuzzi y Desayuno incluido");

        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacionVIP);

        // Crear persona
        Persona cliente = new Persona("María", "López", "12345678");

        // Crear reserva
        Reserva reserva = new Reserva(cliente, habitacion1, LocalDate.of(2025, 5, 1), LocalDate.of(2025, 5, 5), "Tarjeta");

        hotel.realizarReserva(reserva);

        // Mostrar información
        System.out.println("Hotel: " + hotel.getNombre());
        System.out.println("Cliente: " + reserva.getCliente().getNombre() + " " + reserva.getCliente().getApellido());
        System.out.println("Habitación: " + reserva.getHabitacion().getTipo());
        System.out.println("Duración: " + reserva.calcular_Duracion() + " noches");
        System.out.println("Costo total: $" + reserva.calcularCostoTotal());
        System.out.println("Método de pago: " + reserva.getMetodo());
    }
}
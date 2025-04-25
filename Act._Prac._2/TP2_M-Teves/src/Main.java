import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Estrella", "Av. Principal 123");

        Habitacion h1 = new Habitacion(101, "simple", 5000);
        HabitacionVIP h2 = new HabitacionVIP(201, "suite", 12000, "Spa, desayuno, TV 4K");

        hotel.agregarHabitacion(h1);
        hotel.agregarHabitacion(h2);

        Persona cliente = new Persona("Juan", "Pérez", "12345678");

        Reserva reserva = new Reserva(cliente, h2, LocalDate.of(2025, 5, 1), LocalDate.of(2025, 5, 5));
        hotel.realizarReserva(reserva);

        System.out.println("Duración: " + reserva.calcularDuracion() + " días");
        System.out.println("Costo total: $" + reserva.calcularCostoTotal());
        System.out.println("Servicios extra: " + ((HabitacionVIP) h2).getServiciosExtra());
    }
}
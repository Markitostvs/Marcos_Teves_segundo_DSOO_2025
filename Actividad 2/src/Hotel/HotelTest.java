package Hotel;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HotelTest {
    @Test
    void testHotel() {
        Hotel hotel = new Hotel("Hotel Prueba", "Calle Falsa 123");

        Habitacion habitacion = new Habitacion(1, 5000, "Simple");
        hotel.agregarHabitacion(habitacion);

        Persona cliente = new Persona("Lucas", "Perez", "98765");
        Reserva reserva = new Reserva(cliente, habitacion, LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 3), "Tarjeta");
        hotel.realizarReserva(reserva);

        List<Reserva> reservasCliente = hotel.obtenerReservasPorCliente(cliente);

        assertEquals(1, reservasCliente.size());
    }
}
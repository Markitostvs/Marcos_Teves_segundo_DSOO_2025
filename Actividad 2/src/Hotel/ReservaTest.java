package Hotel;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReservaTest {
    @Test
    void testReserva() {
        Persona persona = new Persona("Pedro", "Gómez", "54321");
        Habitacion habitacion = new Habitacion(2, 6000, "Doble");
        Reserva reserva = new Reserva(persona, habitacion, LocalDate.of(2025, 5, 1), LocalDate.of(2025, 5, 3), "Efectivo");

        assertEquals(2, reserva.calcular_Duracion());
        assertEquals(12000, reserva.calcularCostoTotal());
    }
}
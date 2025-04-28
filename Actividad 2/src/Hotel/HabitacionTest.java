package Hotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HabitacionTest {
    @Test
    void testHabitacion() {
        Habitacion habitacion = new Habitacion(1, 4000, "Simple");

        assertEquals(1, habitacion.getNumero());
        assertEquals("Simple", habitacion.getTipo());
        assertEquals(4000, habitacion.getPrecio());
    }
}
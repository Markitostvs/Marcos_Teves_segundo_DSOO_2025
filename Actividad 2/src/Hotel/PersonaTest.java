package Hotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonaTest {
    @Test
    void testPersona() {
        Persona persona = new Persona("Ana", "Martinez", "12345");

        assertEquals("Ana", persona.getNombre());
        assertEquals("Martinez", persona.getApellido());
        assertEquals("12345", persona.getDni());
    }
}
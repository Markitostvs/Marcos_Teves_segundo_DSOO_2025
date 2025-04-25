import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Calle 456");

        Autor autor = new Autor("Gabriel García Márquez", "Colombiano");
        Editorial editorial = new Editorial("Sudamericana");
        Libro libro = new Libro("Cien años de soledad", "123456789", autor, editorial);
        LibroElectronico libroE = new LibroElectronico("El Aleph", "987654321", new Autor("Jorge Luis Borges", "Argentino"), new Editorial("Emecé"), "PDF");

        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libroE);

        Lector lector = new Lector(1, "Ana López", "Calle Falsa 123");
        biblioteca.registrarLector(lector);

        Prestamo prestamo = new Prestamo(lector, libro, LocalDate.of(2025, 4, 1), LocalDate.of(2025, 4, 10));
        biblioteca.realizarPrestamo(prestamo);

        System.out.println("Días de préstamo: " + prestamo.calcularDiasPrestamo());
        System.out.println("Libro prestado: " + prestamo.getLibro().getTitulo());
    }
}
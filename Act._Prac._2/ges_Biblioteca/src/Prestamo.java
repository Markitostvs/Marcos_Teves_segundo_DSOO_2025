import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prestamo {
    private Lector lector;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Lector lector, Libro libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.lector = lector;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public long calcularDiasPrestamo() {
        return ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucion);
    }

    public Lector getLector() {
        return lector;
    }
    public Libro getLibro() {
        return libro;
    }
}

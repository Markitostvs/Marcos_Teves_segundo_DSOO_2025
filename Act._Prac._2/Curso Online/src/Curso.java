import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private Instructor instructor;
    private List<Modulo> modulos;

    public Curso(String nombre, Instructor instructor) {
        this.nombre = nombre;
        this.instructor = instructor;
        this.modulos = new ArrayList<>();
    }

    public void agregarModulo(Modulo modulo) {
        modulos.add(modulo);
    }

    public int calcularDuracionTotal() {
        int total = 0;
        for (Modulo m : modulos) {
            total += m.getDuracion();
        }
        return total;
    }

    public String getNombre() { return nombre; }
    public Instructor getInstructor() { return instructor; }
    public List<Modulo> getModulos() { return modulos; }
}
import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private String nombre;
    private List<Curso> cursos;
    private List<Estudiante> estudiantes;
    private List<Inscripcion> inscripciones;

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
        this.inscripciones = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void inscribirEstudiante(Inscripcion inscripcion) {
        inscripciones.add(inscripcion);
    }

    public List<Curso> obtenerCursosPorEstudiante(int idEstudiante) {
        List<Curso> resultado = new ArrayList<>();
        for (Inscripcion i : inscripciones) {
            if (i.getEstudiante().getIdEstudiante() == idEstudiante) {
                resultado.add(i.getCurso());
            }
        }
        return resultado;
    }
}

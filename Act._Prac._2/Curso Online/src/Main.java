import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma("EduOnline");

        Instructor instructor = new Instructor("Lucía Ramírez", "Programación Web");

        Curso curso = new Curso("Java desde Cero", instructor);

        Recurso recurso = new Recurso("PDF con teoría básica");
        Modulo m1 = new Modulo("Introducción", 2, recurso);
        ModuloConVideo m2 = new ModuloConVideo("POO", 4, new Recurso("Ejercicios en Java"), "https://video.com/java-poo");

        curso.agregarModulo(m1);
        curso.agregarModulo(m2);

        plataforma.agregarCurso(curso);

        Estudiante estudiante = new Estudiante(101, "Carlos Gómez", "carlos@gmail.com");
        plataforma.registrarEstudiante(estudiante);

        Inscripcion inscripcion = new Inscripcion(estudiante, curso, LocalDate.of(2025, 4, 20));
        plataforma.inscribirEstudiante(inscripcion);

        System.out.println("Cursos de " + estudiante.getNombre() + ":");
        for (Curso c : plataforma.obtenerCursosPorEstudiante(101)) {
            System.out.println("- " + c.getNombre() + " (Duración total: " + c.calcularDuracionTotal() + " hs)");
        }
    }
}
public class Modulo {
    private String titulo;
    private int duracion; // en horas
    private Recurso recurso;

    public Modulo(String titulo, int duracion, Recurso recurso) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.recurso = new Recurso(recurso.getDescripcion()); // composición
    }

    public String getTitulo() { return titulo; }
    public int getDuracion() { return duracion; }
    public Recurso getRecurso() { return recurso; }
}

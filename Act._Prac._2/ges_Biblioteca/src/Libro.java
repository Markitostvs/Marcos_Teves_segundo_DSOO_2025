public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = new Editorial(editorial.getNombre()); // composición
    }

    public String getTitulo() {
        return titulo;
    }
    public String getIsbn() {
        return isbn;
    }
    public Autor getAutor() {
        return autor;
    }
    public Editorial getEditorial() {
        return editorial;
    }
}

public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
}
/* Asociacion: hay en libro - autor debido a que el autor
               existe por mas que el libro no , lo mismo
               pasa con prestamo - lector , lectot no depende de prestamo

 Agregacion : hay ne bilbioteca - libros , ellos existen fuera de la biblioteca

 Compocision : hay en libro - editorial porque la editorial esta pegada al libro
               y no tiene sentido sacarla

 Herencia : hay en libroelec. y libro debido a que es literalmene igual, nada mas que
            a libroelec. agrega el atributo formato
 */
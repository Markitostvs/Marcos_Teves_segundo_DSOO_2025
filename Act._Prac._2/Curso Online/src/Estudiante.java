public class Estudiante {
    private int idEstudiante;
    private String nombre;
    private String email;

    public Estudiante(int idEstudiante, String nombre, String email) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.email = email;
    }

    public int getIdEstudiante() { return idEstudiante; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
}
/* Asociacion: hay en curso - instructor ya que el istructor puede existir
               sin depender del curso

   Agregacion: hay en plataforma - cursos debido a que la plataforma administra
               muchos cursos , al igual pasa en plataforma - estudiantes y
               plataforma - inscripcion

   Composicion: hay en modelo - recurso ya que en la clase modulo se crea recurso
                como constructor, es decir recurso no va a existir por si mismo

   Herencia : hay en moduloCV - modulo , son iguales excepto que moduloCV agrega
              el atributo urlVideo

*/
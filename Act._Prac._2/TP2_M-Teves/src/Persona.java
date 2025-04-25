public class Persona {
    private String nombre;
    private String apellido;
    private String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDni() { return dni; }
}
/* ASOCIACION: hay en reserva - persona debido a que reserba tiene un atributo de tipo persona "cliente"

 Agragacion : hay en hotel - habitaciones  porque la habitacion existen fuera del hotel , estas pueden ser reutilizadas o camniar de hotel por eje.

 Compocicion: hay en reserva - pago debido a que pago no tinee sentido por si solo y no puede existir sin reserva

 Herencia: hay en habitacion - habitacionVIP ya que la vip es una extencion, es decir, viene de habitacion
 */



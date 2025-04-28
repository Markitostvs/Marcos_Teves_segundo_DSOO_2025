package Hotel;

public class Habitacion {
    private int numero;
    private double precio;
    private String tipo;

    public Habitacion(int numero, double precio, String tipo){
        this.numero = numero;
        this.precio = precio;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
/*
 * Clase Habitación representa una habitación del hotel.
 * Relación: Asociación con Reserva, Agregación en Hotel.
 */

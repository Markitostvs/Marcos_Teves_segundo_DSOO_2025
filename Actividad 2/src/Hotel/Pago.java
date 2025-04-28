package Hotel;

public class Pago {
    private double monto;
    private String metodo;

    public Pago(double monto, String metodo){
        this. metodo = metodo;
        this. monto = monto;
    }

    public double getMonto(){
        return monto;
    }
    public String getMetodo(){
        return metodo;
    }

    public void setMetodo(String metodo){
        this. metodo = metodo;
    }
    public void setMonto(double monto){
        this. monto = monto;
    }

}
/*
 * Clase Pago representa el pago de una reserva.
 * Relación: Composición dentro de Reserva.
 */
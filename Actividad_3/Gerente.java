package Actividad_3;

public abstract class Gerente extends Empleado{
    public Gerente(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    public double calcularSalario(double salarioBase) {
        return salarioBase + 2000;
    }
}

package Actividad_3;

public abstract class BancoA extends Banco{
    @Override
    public double calcularInteres(double monto){
        return  monto * 0.05;
    }
}

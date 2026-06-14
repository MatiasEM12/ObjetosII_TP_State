package ejercicio_2;

public class Inicial implements EstadoCalculadora{

    private Calculadora calculadora;

    public  Inicial (Calculadora calculadora){
        this.calculadora = calculadora;
    }

    @Override
    public String name() {
        return "";
    }

    @Override
    public void mas() {
        calculadora.cambiarEstado(new EsperandoOperando(calculadora));
    }

    @Override
    public void borrar() {

    }

    @Override
    public void valor(double valor) {

    }

    @Override
    public void mostrar() {

    }
}

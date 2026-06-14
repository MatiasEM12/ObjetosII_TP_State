package ejercicio_2;

public class Error implements EstadoCalculadora{

    private Calculadora calculadora;

    public  Error (Calculadora calculadora){
        this.calculadora = calculadora;
    }
    @Override
    public String name() {
        return "";
    }

    @Override
    public void mas() {

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

package ejercicio_2;

public class EsperandoOperando implements EstadoCalculadora{

    private Calculadora calculadora;

    public  EsperandoOperando (Calculadora calculadora){
        this.calculadora = calculadora;
    }

    @Override
    public String name() {
        return "";
    }

    @Override
    public void mas(){
        calculadora.cambiarEstado(new Error(calculadora));
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

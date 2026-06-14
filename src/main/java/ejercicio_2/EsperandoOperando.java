package ejercicio_2;

public class EsperandoOperando implements EstadoCalculadora{

    public static final String NOMBRE = "ESPERANDO_OPERANDO";
    private Calculadora calculadora;

    public  EsperandoOperando (Calculadora calculadora){
        this.calculadora = calculadora;
    }

    @Override
    public String name() {
        return NOMBRE;
    }

    @Override
    public void mas(){
        calculadora.cambiarEstado(new Error(calculadora));
    }

    @Override
    public void borrar() {
        calculadora.cambiarEstado(new Inicial(calculadora));
        calculadora.cambiarValorAcumulado(new Inicial(calculadora).valorInicial());
    }

    @Override
    public double valor(double valor) {
        calculadora.cambiarEstado(new Inicial(calculadora));
        return calculadora.valorAcumulado() + valor;
    }

    @Override
    public void mostrar() {
        calculadora.cambiarEstado(new Error(calculadora));
    }

    @Override
    public double valorInicial() {
        return new Inicial(calculadora).valorInicial();
    }
}

package ejercicio_2;

public class Inicial implements EstadoCalculadora{

    public static final String NOMBRE = "INICIAL";
    private Calculadora calculadora;
    static final double VALOR_INICIAL = 0.0;
    public  Inicial (Calculadora calculadora){
        this.calculadora = calculadora;
    }

    @Override
    public String name() {
        return NOMBRE;
    }

    @Override
    public void mas() {
        calculadora.cambiarEstado(new EsperandoOperando(calculadora, new Suma()));
    }

    @Override
    public void borrar() {
        calculadora.cambiarEstado(new Inicial(calculadora));
        calculadora.cambiarValorAcumulado(VALOR_INICIAL);
    }

    @Override
    public double valor(double valor) {
        return valor;
    }

    @Override
    public void menos(double valor) {
        calculadora.cambiarEstado(new EsperandoOperando(calculadora, new Resta()));
    }

    @Override
    public void dividido(double valor) {
        calculadora.cambiarEstado(new EsperandoOperando(calculadora, new Divicion()));
    }

    @Override
    public void por(double valor) {
        calculadora.cambiarEstado(new EsperandoOperando(calculadora, new Multiplicacion()));
    }


    @Override
    public void mostrar() {
        System.out.println(calculadora.valorAcumulado());
    }

    @Override
    public double valorInicial() {
        return VALOR_INICIAL;
    }
}

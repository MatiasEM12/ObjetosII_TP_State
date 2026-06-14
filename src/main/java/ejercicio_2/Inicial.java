package ejercicio_2;

public class Inicial extends EstadoCalculadora{

    public static final String NOMBRE = "INICIAL";

    static final double VALOR_INICIAL = 0.0;
    public  Inicial (Calculadora calculadora){
        super(calculadora);
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
    public void menos() {
        calculadora.cambiarEstado(new EsperandoOperando(calculadora, new Resta()));
    }

    @Override
    public void dividido() {
        calculadora.cambiarEstado(new EsperandoOperando(calculadora, new Divicion()));
    }

    @Override
    public void por() {
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

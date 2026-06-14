package ejercicio_2;

public class EsperandoOperando extends EstadoCalculadora{

    public static final String NOMBRE = "ESPERANDO_OPERANDO";
    private Operacion operacion;

    public  EsperandoOperando (Calculadora calculadora, Operacion operacion){
        super(calculadora);
        this.operacion = operacion;
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

        try {
            calculadora.cambiarEstado(new Inicial(calculadora));
            return operacion.operacion(calculadora.valorAcumulado(),valor);
        }catch (RuntimeException e){
            calculadora.cambiarEstado(new Error(calculadora));
        }

        return 0;
    }

    @Override
    public void menos() {
        calculadora.cambiarEstado(new Error(calculadora));
    }

    @Override
    public void dividido() {
        calculadora.cambiarEstado(new Error(calculadora));
    }

    @Override
    public void por() {
        calculadora.cambiarEstado(new Error(calculadora));
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

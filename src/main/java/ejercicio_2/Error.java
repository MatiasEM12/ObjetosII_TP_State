package ejercicio_2;

public class Error extends EstadoCalculadora{
    static final String MSG_ESTADO_ERROR = "La calculadora está en estado de error";
    public static final String NOMBRE = "ERROR";


    public  Error (Calculadora calculadora){
        super(calculadora);
    }
    @Override
    public String name() {
        return NOMBRE;
    }

    @Override
    public void mas() {
        System.out.println(MSG_ESTADO_ERROR );
    }

    @Override
    public void borrar() {
        calculadora.cambiarEstado(new Inicial(calculadora));
        calculadora.cambiarValorAcumulado(new Inicial(calculadora).valorInicial());
    }

    @Override
    public double valor(double valor) {
        System.out.println(MSG_ESTADO_ERROR);
        return 0;
    }

    @Override
    public void menos() {
        System.out.println(MSG_ESTADO_ERROR);
    }

    @Override
    public  void dividido() {
        System.out.println(MSG_ESTADO_ERROR);
    }

    @Override
    public void por() {
        System.out.println(MSG_ESTADO_ERROR);
    }

    @Override
    public void mostrar() {
        System.out.println(MSG_ESTADO_ERROR);
    }

    @Override
    public double valorInicial() {
        return new Inicial(calculadora).valorInicial();
    }
}

package ejercicio_2;

public class Divicion implements Operacion  {

    @Override
    public double operacion(double operandoX, double operandoY) {
        validarDivisor(operandoY);
        return operandoX / operandoY;
    }

    private void validarDivisor(double operandoY) {
        if(operandoY==0) throw new RuntimeException();
    }
}

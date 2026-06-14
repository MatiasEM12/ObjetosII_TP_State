package ejercicio_2;


public abstract class EstadoCalculadora {

    protected Calculadora calculadora;

    protected EstadoCalculadora (Calculadora calculadora){
        this.calculadora = calculadora;
    }
    public  abstract String name();

    public abstract void mas();

    public abstract void borrar();

    public abstract double valor(double valor);

    public abstract void menos();

    public  abstract void dividido ();

    public abstract void por();

    public abstract void mostrar();

    public abstract double valorInicial();
}
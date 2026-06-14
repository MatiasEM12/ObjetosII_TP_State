package ejercicio_2;


public interface EstadoCalculadora {

    public  String name();

    public void mas();

    public void borrar();

    public double valor(double valor);

    public void menos(double valor);

    public  void dividido (double valor);

    public void por(double valor);

    public void mostrar();

    double valorInicial();
}
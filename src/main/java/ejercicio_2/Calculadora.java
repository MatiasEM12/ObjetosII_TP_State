package ejercicio_2;




public class Calculadora {


    private double valorAcumulado;
    private EstadoCalculadora estado;

    public Calculadora() {
        this.estado = new Inicial(this);
        this.valorAcumulado = estado.valorInicial();
    }

    String estado() {
        return this.estado.name();
    }

    public  void cambiarEstado(EstadoCalculadora estado){
        this.estado = estado;
    }

    public void mas() {
        estado.mas();
    }

    public void borrar() {
        estado.borrar();

    }

    public void valor(double valor) {

        this.valorAcumulado = estado.valor(valor);

    }

    public void mostrar() {
        estado.mostrar();
    }

    public  double valorAcumulado(){
        return valorAcumulado;
    }

    public void cambiarValorAcumulado(double valor){
        this.valorAcumulado = valor;
    }
}
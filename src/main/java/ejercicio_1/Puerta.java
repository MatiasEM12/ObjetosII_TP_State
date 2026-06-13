package ejercicio_1;


public class Puerta {

    private EstadoPuerta estadoPuerta;

    public Puerta (){
        this.estadoPuerta = new Cerrada(this);
    }

    public String estado() {
       return estadoPuerta.nombre();
    }

    public void abrir() {
        estadoPuerta.abrir();
    }

    public void cerrar() {
        estadoPuerta.cerrar();
    }

    public void cambiarEstado(EstadoPuerta estadoPuerta){
        this.estadoPuerta = estadoPuerta;
    }
}
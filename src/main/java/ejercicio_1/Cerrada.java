package ejercicio_1;

public class Cerrada implements EstadoPuerta{

    public final static String nombre = "CERRADA";
    private Puerta puerta;

    public Cerrada (Puerta puerta){
        this.puerta = puerta;
    }
    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public void abrir() {
        System.out.print("Abriendo la puerta...");
        this.puerta.cambiarEstado(new Abierta(puerta));
    }

    @Override
    public void cerrar() {
        System.out.println("no se puede cerrar una puerta cerrada");
    }
}

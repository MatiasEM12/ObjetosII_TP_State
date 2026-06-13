package ejercicio_1;

public class Abierta implements EstadoPuerta{

    public final static String nombre = "ABIERTA";
    private Puerta puerta;

    public Abierta (Puerta puerta){
        this.puerta = puerta;
    }
    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public void abrir() {
        System.out.println("NO se puede abrir una puerta abierta");
    }

    @Override
    public void cerrar() {
        System.out.print("Cerrando la puerta...");
        this.puerta.cambiarEstado(new Cerrada(puerta));
    }
}

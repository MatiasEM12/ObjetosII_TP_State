package ejercicio_4;


import java.util.ArrayList;
import java.util.List;

public class OrdenDeCompra {

    private Estado estado;
    private List<Producto> productos;
    private double monto;
    private String numeroSeguimiento;

    public OrdenDeCompra() {

        this.productos = new ArrayList<>();
        this.monto = 0;
        this.numeroSeguimiento = null;
        this.estado = new Iniciada(this);
    }


    public void agregarProducto(Producto producto) {
        estado.agregarProducto(producto);
    }

    public void confirmarCompra() {

        estado.confirmarCompra();
    }

    public void enviar() {
        estado.enviar();
    }

    public void cancelar() {
        estado.cancelar();
    }

    public String estado() {
        return this.estado.name();
    }

    public double monto() {
        return this.monto;
    }

    public String numeroSeguimiento() {
        return this.numeroSeguimiento;
    }

    public List<Producto> productos() {
        return new ArrayList<>(this.productos);
    }

    private double calcularMonto() {
        return this.productos.stream().mapToDouble(Producto::precio).sum();
    }

    private String generarNumeroSeguimiento() {
        return "SEG-" + System.currentTimeMillis();
    }


    public void cambiarEstado( Estado estado){
        this.estado = estado;
    }
    public boolean estaVacia() {
        return productos.isEmpty();
    }

    void insertarProducto(Producto producto) {
        this.productos.add(producto);
    }

    void actualizarMonto() {
        this.monto = calcularMonto();
    }

   void actualizarNumeroSeguimiento() {
        this.numeroSeguimiento = generarNumeroSeguimiento();
   }
}
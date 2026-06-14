package ejercicio_4;

public class Iniciada extends Estado{



    public Iniciada (OrdenDeCompra ordenDeCompra){
        super(ordenDeCompra);
        this.name = "INICIADA";

    }

    @Override
    public void agregarProducto(Producto producto) {
        ordenDeCompra.insertarProducto(producto);
    }

    @Override
    public void confirmarCompra() {

        if (ordenDeCompra.estaVacia()) {
            throw new IllegalStateException(MSG_ERROR_SIN_PRODUCTOS);
        }
        ordenDeCompra.cambiarEstado(new EnPreparacion(ordenDeCompra));
        ordenDeCompra.actualizarMonto();

    }

    @Override
    public void enviar() {
        throw new IllegalStateException(MSG_ERROR_ENVIAR);
    }

    @Override
    public void cancelar() {
        ordenDeCompra.cambiarEstado(new Cancelada(ordenDeCompra));
    }
}

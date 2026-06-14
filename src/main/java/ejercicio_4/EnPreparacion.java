package ejercicio_4;

public class EnPreparacion extends Estado{

    public EnPreparacion(OrdenDeCompra ordenDeCompra){
        super(ordenDeCompra);
        this.name = "EN_PREPARACION";
    }

    @Override
    public void agregarProducto(Producto producto) {
        throw new IllegalStateException(MSG_ERROR_AGREGAR_PRODUCTO);
    }

    @Override
    public void confirmarCompra() {
        throw new IllegalStateException(MSG_ERROR_PREPARACION);
    }

    @Override
    public void enviar() {
        ordenDeCompra.cambiarEstado( new Enviado(ordenDeCompra));
        ordenDeCompra.actualizarNumeroSeguimiento();

    }

    @Override
    public void cancelar() {
        ordenDeCompra.cambiarEstado(new Cancelada(ordenDeCompra));
    }
}

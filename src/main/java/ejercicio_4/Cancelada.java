package ejercicio_4;

public class Cancelada extends Estado{


   public Cancelada (OrdenDeCompra ordenDeCompra){
       super(ordenDeCompra);
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
        throw new IllegalStateException(MSG_ERROR_ENVIAR);
    }

    @Override
    public void cancelar() {
        throw new IllegalStateException(MSG_ERROR_CANCELAR);
    }
}

package ejercicio_4;

public abstract class Estado {
    static final String MSG_ERROR_PREPARACION = "La orden solo puede pasar a preparacion desde iniciada";
    static final String MSG_ERROR_SIN_PRODUCTOS = "La orden debe tener al menos un producto";
    static final String MSG_ERROR_ENVIAR = "La orden solo puede enviarse desde en preparacion";
    static final String MSG_ERROR_CANCELAR = "La orden no puede cancelarse en este estado";
    static final String MSG_ERROR_AGREGAR_PRODUCTO = "No se pueden agregar productos en este estado";

    protected OrdenDeCompra ordenDeCompra;

    protected Estado  (OrdenDeCompra ordenDeCompra){
        this.ordenDeCompra = ordenDeCompra;
    }

    public abstract void agregarProducto(Producto producto);
    public abstract void confirmarCompra();
    public abstract void enviar();
    public abstract void cancelar();
}
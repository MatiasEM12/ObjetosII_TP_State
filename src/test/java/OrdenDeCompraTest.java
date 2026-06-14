
import ejercicio_4.OrdenDeCompra;
import ejercicio_4.Producto;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class OrdenDeCompraTest {

    @Test
    void unaOrdenNuevaComienzaIniciada() {
        OrdenDeCompra orden = new OrdenDeCompra();
        assertEquals("INICIADA", orden.estado());
    }

    @Test
    void sePuedeAgregarProductoEnEstadoIniciada() {
        OrdenDeCompra orden = new OrdenDeCompra();
        Producto producto = new Producto("Mouse", 100);

        orden.agregarProducto(producto);

        assertEquals(1, orden.productos().size());
    }

    @Test
    void confirmarCompraPasaAEnPreparacion() {
        OrdenDeCompra orden = new OrdenDeCompra();

        orden.agregarProducto(new Producto("Mouse", 100));
        orden.confirmarCompra();

        assertEquals("EN_PREPARACION", orden.estado());
    }

    @Test
    void confirmarCompraCalculaMonto() {
        OrdenDeCompra orden = new OrdenDeCompra();

        orden.agregarProducto(new Producto("Mouse", 100));
        orden.agregarProducto(new Producto("Monitor", 200));

        orden.confirmarCompra();

        assertEquals(300, orden.monto());
    }

    @Test
    void enviarPasaAEnviada() {
        OrdenDeCompra orden = new OrdenDeCompra();

        orden.agregarProducto(new Producto("Teclado", 100));
        orden.confirmarCompra();

        orden.enviar();

        assertEquals("ENVIADO", orden.estado());
    }

    @Test
    void enviarGeneraNumeroSeguimiento() {
        OrdenDeCompra orden = new OrdenDeCompra();

        orden.agregarProducto(new Producto("TV", 100));
        orden.confirmarCompra();
        orden.enviar();

        assertNotNull(orden.numeroSeguimiento());
    }

    @Test
    void cancelarDesdeIniciadaPasaACancelada() {
        OrdenDeCompra orden = new OrdenDeCompra();

        orden.cancelar();

        assertEquals("CANCELADA", orden.estado());
    }

    @Test
    void cancelarDesdePreparacionPasaACancelada() {
        OrdenDeCompra orden = new OrdenDeCompra();

        orden.agregarProducto(new Producto("Celular", 100));
        orden.confirmarCompra();

        orden.cancelar();

        assertEquals("CANCELADA", orden.estado());
    }

    @Test
    void noSePuedeConfirmarCompraSinProductos() {
        OrdenDeCompra orden = new OrdenDeCompra();
        String excepcion = "";
        try{
            orden.confirmarCompra();
        }catch (IllegalStateException e){
            excepcion = e.getMessage();
        }

        assertEquals("La orden debe tener al menos un producto", excepcion);
    }

    @Test
    void noSePuedeAgregarProductoEnPreparacion() {
        OrdenDeCompra orden = new OrdenDeCompra();

        orden.agregarProducto(new Producto("Mouse", 100));
        orden.confirmarCompra();
        String excepcion = "";
        try{
            orden.agregarProducto(new Producto("USB", 50));
        }catch (IllegalStateException e){
            excepcion = e.getMessage();
        }

        assertEquals("No se pueden agregar productos en este estado", excepcion);
    }

    @Test
    void noSePuedeEnviarDesdeIniciada() {
        OrdenDeCompra orden = new OrdenDeCompra();

        String excepcion = "";
        try{
            orden.enviar();
        }catch ( IllegalStateException e){
            excepcion = e.getMessage();
        }
        assertEquals("La orden solo puede enviarse desde en preparacion", excepcion);
    }

    @Test
    void noSePuedeConfirmarDosVeces() {
        OrdenDeCompra orden = new OrdenDeCompra();

        orden.agregarProducto(new Producto("Teclado", 100));
        orden.confirmarCompra();

        String excepcion = "";
        try{
            orden.confirmarCompra();
        }catch (IllegalStateException e){
            excepcion = e.getMessage();
        }

        assertEquals("La orden solo puede pasar a preparacion desde iniciada", excepcion );
    }

    @Test
    void noSePuedeCancelarUnaOrdenEnviada() {
        OrdenDeCompra orden = new OrdenDeCompra();

        orden.agregarProducto(new Producto("A", 100));
        orden.confirmarCompra();
        orden.enviar();

        String excepcion = "";
        try{
            orden.cancelar();
        }catch (IllegalStateException e){
            excepcion = e.getMessage();
        }

        assertEquals("La orden no puede cancelarse en este estado", excepcion);
    }

    @Test
    void noSePuedeCancelarDosVeces() {
        OrdenDeCompra orden = new OrdenDeCompra();

        orden.cancelar();

        String excepcion = "";
        try{
            orden.cancelar();
        }catch (IllegalStateException e){
            excepcion = e.getMessage();
        }

        assertEquals("La orden no puede cancelarse en este estado", excepcion);
    }

    @Test
    void noSePuedeAgregarProductoEnviada() {
        OrdenDeCompra orden = new OrdenDeCompra();

        orden.agregarProducto(new Producto("A", 100));
        orden.confirmarCompra();
        orden.enviar();

        String excepcion = "";
        try{
            orden.agregarProducto(new Producto("TV", 100));
        }catch (IllegalStateException e){
            excepcion = e.getMessage();
        }

        assertEquals("No se pueden agregar productos en este estado", excepcion);

    }
}

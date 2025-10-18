
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Fideos", 2000);
        Producto p2 = new Producto("Aceite", 3000);
        Producto p3 = new Producto("Piedritas Sanitarias", 5000);
        Pedido pedido = new Pedido();
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);
        pedido.mostrarProductos();

        double montoPedido = pedido.calcularTotal();

        PagoConDescuento tc = new TarjetaCredito();
        tc.procesarPago(tc.aplicarDescuento(montoPedido));

        PagoConDescuento paypal = new PayPal();
        paypal.procesarPago(paypal.aplicarDescuento(montoPedido));

    }
}
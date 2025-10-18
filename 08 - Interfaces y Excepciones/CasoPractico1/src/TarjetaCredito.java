public class TarjetaCredito implements PagoConDescuento{
    private final double DESCUENTO_TARJETACREDITO = 5.00;

    @Override
    public double aplicarDescuento(double montoOriginal) {
        System.out.println("Aplicando descuento: % " + DESCUENTO_TARJETACREDITO);
        double descuento = montoOriginal * (DESCUENTO_TARJETACREDITO / 100);
        System.out.println("Monto: " + montoOriginal);
        System.out.println("Descuento:" + descuento);
        return montoOriginal - descuento;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando el pago final de: $ " + monto + " con Tarjeta de Crédito.");
    }
}

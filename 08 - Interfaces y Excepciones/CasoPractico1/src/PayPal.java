public class PayPal implements PagoConDescuento{
    private final double DESCUENTO_PAYPAL = 15.00;

    @Override
    public double aplicarDescuento(double montoOriginal) {
        System.out.println("Aplicando descuento: % " + DESCUENTO_PAYPAL);
        double descuento = montoOriginal * (DESCUENTO_PAYPAL / 100);
        System.out.println("Monto: " + montoOriginal);
        System.out.println("Descuento:" + descuento);
        return montoOriginal - descuento;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando el pago final de: $ " + monto + " con PayPal.");
    }
}

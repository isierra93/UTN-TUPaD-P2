//● Interfaz: Pagable con metodo pagar()
//● Clases: TarjetaCredito, Transferencia, Efectivo implementan Pagable
//● Metodo: procesarPago(Pagable medio) genérico para todos los tipos
//● Tarea: Crear distintas formas de pago y procesarlas con una sola función

public class Main {
    public static void main(String[] args) {

        Efectivo e = new Efectivo();
        TarjetaCredito tc = new TarjetaCredito();
        Transferencia trans = new Transferencia();

        procesarPago(e);
        procesarPago(tc);
        procesarPago(trans);
        
    }

    public static void procesarPago(Pagable medio) {
        System.out.println("Realizando cobro:");
        medio.pagar();
    }
}
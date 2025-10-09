public class Efectivo implements Pagable{

    @Override
    public void pagar() {
        System.out.println("Pago realizado en Efectivo.");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author sierr
 */
public class GeneradorQR {
    public static void generar(String valor, Usuario usuario) {
        CodigoQR codigoQR = new CodigoQR(valor);
        codigoQR.setUsuario(usuario);
        System.out.println("Se creo el QR: " + codigoQR.getValor());
        System.out.println("Usuario: " + codigoQR.getUsuario().getNombre());
    }
}

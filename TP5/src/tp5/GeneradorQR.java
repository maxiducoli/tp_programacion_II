/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class GeneradorQR {
 /**
     * Método que demuestra dependencia de creación:
     * crea un objeto CodigoQR dentro del método, pero no lo guarda como atributo.
     */
    public void generar(String valor, Usuario02 usuario) {
        if (valor != null && !valor.trim().isEmpty() && usuario != null) {
            // Creación temporal de CodigoQR (dependencia de creación)
            CodigoQR codigo = new CodigoQR(valor, usuario);
            System.out.println("Código QR generado:");
            System.out.println(codigo);
        } else {
            System.out.println("No se puede generar un código QR con datos nulos o vacíos.");
        }
    }   
}

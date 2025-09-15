/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class Calculadora {
 /**
     * Método que demuestra dependencia de uso:
     * recibe un Impuesto como parámetro, pero no lo guarda como atributo.
     */
    public void calcular(Impuesto impuesto) {
        if (impuesto != null) {
            double monto = impuesto.getMonto();
            double interes = monto * 0.10; // Interés del 10%
            System.out.println("Cálculo realizado:");
            System.out.println("Monto base: $" + monto);
            System.out.println("Interés (10%): $" + interes);
            System.out.println("Total: $" + (monto + interes));
        } else {
            System.out.println("No hay impuesto para calcular.");
        }
    }   
}

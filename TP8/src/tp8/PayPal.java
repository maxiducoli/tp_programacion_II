package tp8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mdd_1
 */
public class PayPal implements PagoConDescuento {
    private String email;
    private boolean cuentaVerificada;

    public PayPal(String email, boolean cuentaVerificada) {
        this.email = email;
        this.cuentaVerificada = cuentaVerificada;
    }

    @Override
    public void procesarPago(double monto) {
        if (cuentaVerificada) {
            System.out.println("Pago de $" + String.format("%.2f", monto) +
                    " procesado exitosamente mediante PayPal (cuenta: " + email + ").");
        } else {
            System.out.println("Error: La cuenta de PayPal " + email + " no está verificada.");
        }
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        double descuentoFinal = Math.min(porcentaje, 30); // Máx. 30% en PayPal
        System.out.println("Descuento del " + descuentoFinal + "% aplicado (máx. permitido: 30%).");
    }
}

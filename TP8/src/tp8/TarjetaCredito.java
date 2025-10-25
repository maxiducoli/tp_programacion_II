package tp8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mdd_1
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private double saldoDisponible;

    public TarjetaCredito(String numeroTarjeta, double saldoDisponible) {
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public void procesarPago(double monto) {
        if (saldoDisponible >= monto) {
            saldoDisponible -= monto;
            System.out.println("Pago realizado con tarjeta " + maskNumero(numeroTarjeta) +
                    ": $" + String.format("%.2f", monto));
        } else {
            System.out.println("Error: Saldo insuficiente en tarjeta " + maskNumero(numeroTarjeta));
        }
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 50) {
            System.out.println("Descuento del " + porcentaje + "% aplicado en pago con tarjeta.");
        } else {
            System.out.println("Descuento inválido: " + porcentaje + "%. Máximo permitido: 50%");
        }
    }

    // Método auxiliar para ocultar parte del número de tarjeta
    private String maskNumero(String num) {
        if (num.length() < 4) return "****";
        return "**** **** **** " + num.substring(num.length() - 4);
    }
}

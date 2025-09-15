/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // Composición
    private Titular01 titular;               // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldoInicial, String claveInicial, Titular01 titular) {
        this.cbu = cbu;
        this.saldo = saldoInicial;
        this.claveSeguridad = new ClaveSeguridad(claveInicial); // Se crea dentro
        this.titular = titular;
        // Establecer asociación bidireccional
        this.titular.setCuenta(this);
    }

    // Métodos de negocio
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    // Getters y setters
    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }

    public ClaveSeguridad getClaveSeguridad() { return claveSeguridad; }
    public void cambiarClave(String nuevaClave) {
        this.claveSeguridad.setCodigo(nuevaClave);
    }

    public Titular01 getTitular() { return titular; }
    public void setTitular(Titular01 titular) {
        this.titular = titular;
        if (titular != null) {
            titular.setCuenta(this);
        }
    }
}

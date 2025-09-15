/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;           // Agregación
        this.cliente = cliente;       // Asociación
        // Establecer relación bidireccional
        this.cliente.setTarjeta(this);
    }

    // Getters y setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null) {
            cliente.setTarjeta(this);
        }
    }

    public Banco getBanco() { return banco; }
    public void setBanco(Banco banco) { this.banco = banco; } 
}

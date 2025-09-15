/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class Reserva {
     private String fecha;
    private String hora;
    private Cliente01 cliente;   // Asociación unidireccional
    private Mesa mesa;         // Agregación

    public Reserva(String fecha, String hora, Cliente01 cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    // Getters y setters
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public Cliente01 getCliente() { return cliente; }
    public void setCliente(Cliente01 cliente) { this.cliente = cliente; }

    public Mesa getMesa() { return mesa; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }
}

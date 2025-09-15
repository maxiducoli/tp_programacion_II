/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class Cliente {
   private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;  // Referencia a su tarjeta

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public TarjetaDeCredito getTarjeta() { return tarjeta; }
    public void setTarjeta(TarjetaDeCredito tarjeta) { this.tarjeta = tarjeta; }  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class Titular01 {
   private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // Referencia a su cuenta bancaria

    public Titular01(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public CuentaBancaria getCuenta() { return cuenta; }
    public void setCuenta(CuentaBancaria cuenta) { this.cuenta = cuenta; } 
}

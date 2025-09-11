/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author mdd_1
 */
public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + ", Especie: " + especie + ", Edad: " + edad + " años");
    }

    // Método para cumplir un año más
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido " + edad + " años.");
    }
    
}

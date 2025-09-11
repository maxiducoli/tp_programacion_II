/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author mdd_1
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    // Constructor
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    // Método para poner huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + " puso un huevo. Total de huevos: " + huevosPuestos);
    }

    // Método para envejecer
    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + " ahora tiene " + edad + " meses.");
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina + ", Edad: " + edad + " meses, Huevos puestos: " + huevosPuestos);
    }
}

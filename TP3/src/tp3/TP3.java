/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author mdd_1
 */
public class TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("=== TRABAJO PRÁCTICO 3 - INTRODUCCIÓN A LA POO ===\n");

        // --- 1. Estudiante ---
        System.out.println("1. REGISTRO DE ESTUDIANTE");
        Estudiante estudiante = new Estudiante("Ana", "López", "Programación II", 7.5);
        estudiante.mostrarInfo();
        estudiante.subirCalificacion(1.0);
        estudiante.bajarCalificacion(0.5);
        estudiante.mostrarInfo();
        System.out.println();

        // --- 2. Mascota ---
        System.out.println("2. REGISTRO DE MASCOTA");
        Mascota mascota = new Mascota("Firulais", "Perro", 3);
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.mostrarInfo();
        System.out.println();

        // --- 3. Libro ---
        System.out.println("3. CLASE LIBRO CON ENCAPSULAMIENTO");
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        libro.mostrarInfo();
        libro.setAñoPublicacion(2025); // Inválido
        libro.setAñoPublicacion(1800); // Válido
        libro.mostrarInfo();
        System.out.println();

        // --- 4. Gallinas ---
        System.out.println("4. GESTIÓN DE GALLINAS");
        Gallina g1 = new Gallina(1, 6);
        Gallina g2 = new Gallina(2, 4);

        g1.envejecer();
        g1.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();

        g1.mostrarEstado();
        g2.mostrarEstado();
        System.out.println();

        // --- 5. Nave Espacial ---
        System.out.println("5. SIMULACIÓN DE NAVE ESPACIAL");
        NaveEspacial nave = new NaveEspacial("Enterprise", 50);
        nave.mostrarEstado();
        nave.avanzar(30); // No debería poder (necesita 60, tiene 50)
        nave.recargarCombustible(30); // Sube a 80
        nave.avanzar(25); // Necesita 50 -> puede hacerlo
        nave.mostrarEstado();
    }
    
}

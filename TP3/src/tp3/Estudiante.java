/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author mdd_1
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido +
                ", Curso: " + curso + ", Calificación: " + calificacion);
    }

    // Método para subir calificación
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Calificación aumentada en " + puntos + ". Nueva calificación: " + calificacion);
    }

    // Método para bajar calificación
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) calificacion = 0; // Evitar calificaciones negativas
        System.out.println("Calificación disminuida en " + puntos + ". Nueva calificación: " + calificacion);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author mdd_1
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion); // Usa el setter para validación
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    // Setter con validación
    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0 && añoPublicacion <= 2024) {
            this.añoPublicacion = añoPublicacion;
            System.out.println("Año de publicación actualizado a: " + añoPublicacion);
        } else {
            System.out.println("Error: El año de publicación debe estar entre 1 y 2024.");
        }
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Año: " + añoPublicacion);
    }
    
}

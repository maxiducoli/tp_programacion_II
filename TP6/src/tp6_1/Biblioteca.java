/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_1;

/**
 *
 * @author mdd_1
 */
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Método: agregarLibro
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
        System.out.println("Libro agregado: " + titulo + " (ISBN: " + isbn + ")");
    }

    // Método: listarLibros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca '" + nombre + "' está vacía.");
            return;
        }
        System.out.println("\n--- Libros en la Biblioteca '" + nombre + "' ---");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    // Método: buscarLibroPorIsbn
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null; // No encontrado
    }

    // Método: eliminarLibro
    public boolean eliminarLibro(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            System.out.println("Libro eliminado: " + encontrado.getTitulo());
            return true;
        } else {
            System.out.println("Libro con ISBN " + isbn + " no encontrado.");
            return false;
        }
    }

    // Método: obtenerCantidadLibros
    public int obtenerCantidadLibros() {
        int total = libros.size();
        System.out.println("Total de libros en la biblioteca: " + total);
        return total;
    }

    // Método: filtrarLibrosPorAnio
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n--- Libros publicados en el año " + anio + " ---");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros publicados en el año " + anio + ".");
        }
    }

    // Método: mostrarAutoresDisponibles
    public void mostrarAutoresDisponibles() {
        System.out.println("\n--- Autores disponibles en la biblioteca ---");
        List<Autor> autoresMostrados = new ArrayList<>();
        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (!autoresMostrados.contains(autor)) {
                autor.mostrarInfo();
                autoresMostrados.add(autor);
            }
        }
        if (autoresMostrados.isEmpty()) {
            System.out.println("No hay autores registrados.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class Libro {
     private String titulo;
    private String isbn;
    private Autor autor;       // Asociación unidireccional
    private Editorial editorial; // Agregación

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    // Getters y setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }

    public Editorial getEditorial() { return editorial; }
    public void setEditorial(Editorial editorial) { this.editorial = editorial; }
}

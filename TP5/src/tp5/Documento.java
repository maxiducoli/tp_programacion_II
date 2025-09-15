/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class Documento {
     private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // Composición

    public Documento(String titulo, String contenido, Usuario01 firmante) {
        this.titulo = titulo;
        this.contenido = contenido;
        // Crear la firma digital como parte del documento (composición)
        this.firmaDigital = new FirmaDigital(generarHash(), firmante);
    }

    // Método auxiliar para simular generación de hash
    private String generarHash() {
        return "SHA-" + System.currentTimeMillis(); // Hash simulado
    }

    // Getters y setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }

    public FirmaDigital getFirmaDigital() { return firmaDigital; }

    // No se permite cambiar la firma (por ser composición), pero se podría regenerar
    public void firmarCon(Usuario01 nuevoFirmante) {
        this.firmaDigital = new FirmaDigital(generarHash(), nuevoFirmante);
    }
}

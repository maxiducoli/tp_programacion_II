/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class Reproductor {
   /**
     * Método que demuestra dependencia de uso:
     * recibe una Cancion como parámetro, pero no la guarda como atributo.
     */
    public void reproducir(Cancion cancion) {
        if (cancion != null) {
            System.out.println("🎵 Reproduciendo: " + cancion);
        } else {
            System.out.println("❌ No hay canción para reproducir.");
        }
    }  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class EditorVideo {
   /**
     * Método que demuestra dependencia de creación:
     * crea un objeto Render dentro del método, pero no lo guarda como atributo.
     */
    public void exportar(String formato, Proyecto proyecto) {
        if (formato != null && !formato.trim().isEmpty() && proyecto != null) {
            // Creación temporal de Render (dependencia de creación)
            Render render = new Render(formato.toLowerCase(), proyecto);
            System.out.println("Exportando video...");
            System.out.println("Formato: " + render.getFormato());
            System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
            System.out.println("Archivo generado: " + render);
        } else {
            System.out.println("No se puede exportar: datos incompletos.");
        }
    }  
}

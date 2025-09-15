/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class ClaveSeguridad {
 private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo) {
        this.codigo = codigo;
        this.ultimaModificacion = new String();
    }

    // Getters y setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
        this.ultimaModificacion = new String(); // Actualiza fecha al cambiar
    }

    public String getUltimaModificacion() { return ultimaModificacion; }   
}

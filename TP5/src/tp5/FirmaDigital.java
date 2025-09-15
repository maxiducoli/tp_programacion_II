/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class FirmaDigital {
   private String codigoHash;
    private String fecha;
    private Usuario01 firmante; // Agregación: referencia al usuario que firmó

    public FirmaDigital(String codigoHash, Usuario01 firmante) {
        this.codigoHash = codigoHash;
        this.fecha = new String();
        this.firmante = firmante;
    }

    // Getters y setters
    public String getCodigoHash() { return codigoHash; }
    public void setCodigoHash(String codigoHash) { this.codigoHash = codigoHash; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public Usuario01 getFirmante() { return firmante; }
    public void setFirmante(Usuario01 firmante) { this.firmante = firmante; }  
}

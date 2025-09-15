/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class CodigoQR {
 private String valor;
    private Usuario02 creador;

    public CodigoQR(String valor, Usuario02 creador) {
        this.valor = valor;
        this.creador = creador;
    }

    // Getters y setters
    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }

    public Usuario02 getCreador() { return creador; }
    public void setCreador(Usuario02 creador) { this.creador = creador; }

    @Override
    public String toString() {
        return "Código QR: " + valor + " | Creado por: " + creador.getNombre();
    }   
}

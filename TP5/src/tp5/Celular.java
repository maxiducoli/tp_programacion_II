/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class Celular {
     private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;  // Agregación: la batería puede cambiar o existir por separado
        this.usuario = usuario;
        // Establecer asociación bidireccional
        this.usuario.setCelular(this);
    }

    // Getters y setters
    public String getImei() { return imei; }
    public void setImei(String imei) { this.imei = imei; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public Bateria getBateria() { return bateria; }
    public void setBateria(Bateria bateria) { this.bateria = bateria; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null) {
            usuario.setCelular(this);
        }
    }
}

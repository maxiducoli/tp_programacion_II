package tp8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mdd_1
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación enviada a " + nombre + " (" + email + "):");
        System.out.println(" → " + mensaje);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}
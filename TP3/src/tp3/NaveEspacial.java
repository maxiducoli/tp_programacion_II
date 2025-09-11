/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author mdd_1
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;

    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.min(combustibleInicial, MAX_COMBUSTIBLE);
    }

    // Método despegar
    public void despegar() {
        if (combustible >= 10) {
            System.out.println(nombre + " está despegando...");
            combustible -= 10;
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }

    // Método avanzar
    public void avanzar(int distancia) {
        int consumo = distancia * 2; // 2 unidades por km
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km. Se necesita " + consumo + ", disponible: " + combustible);
        }
    }

    // Método recargar combustible
    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida para recargar.");
            return;
        }
        int nuevoTotal = combustible + cantidad;
        if (nuevoTotal > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("Combustible recargado. Máximo alcanzado: " + MAX_COMBUSTIBLE);
        } else {
            combustible = nuevoTotal;
            System.out.println("Combustible recargado. Nuevo nivel: " + combustible);
        }
    }

    // Método mostrar estado
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + ", Combustible: " + combustible + "/100");
    }
}

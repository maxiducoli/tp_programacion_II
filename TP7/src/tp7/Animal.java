/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7;

/**
 *
 * @author mdd_1
 */
public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void hacerSonido() {
        System.out.println(especie + " hace un sonido genérico.");
    }

    public void describirAnimal() {
        System.out.println("Este es un " + especie.toLowerCase() + ".");
    }
}
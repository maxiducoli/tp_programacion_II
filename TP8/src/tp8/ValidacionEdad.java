package tp8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mdd_1
 */
import java.util.Scanner;

public class ValidacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("La edad " + edad + " no es válida. Debe estar entre 0 y 120.");
            }
            System.out.println("Edad registrada correctamente: " + edad + " años.");
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

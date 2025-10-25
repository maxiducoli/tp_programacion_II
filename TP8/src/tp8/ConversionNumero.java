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

public class ConversionNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        String entrada = scanner.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número convertido exitosamente: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + entrada + "' no es un número válido.");
            System.out.println("Asegúrese de ingresar solo dígitos.");
        } finally {
            scanner.close();
        }
    }
}
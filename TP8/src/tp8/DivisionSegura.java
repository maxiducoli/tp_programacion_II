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

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        double dividendo = scanner.nextDouble();

        System.out.print("Ingrese el divisor: ");
        double divisor = scanner.nextDouble();

        try {
            double resultado = dividendo / divisor;
            System.out.println("Resultado: " + dividendo + " / " + divisor + " = " + String.format("%.2f", resultado));
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            scanner.close();
        }
    }
}

package tp8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mdd_1
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del archivo a leer (con extensión): ");
        String nombreArchivo = scanner.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            System.out.println("\nContenido del archivo:\n");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + nombreArchivo + "' no fue encontrado.");
            System.out.println("Verifique el nombre y la ruta del archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

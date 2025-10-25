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
import java.io.IOException;
import java.util.Scanner;

public class LecturaConResources {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del archivo a leer: ");
        String nombreArchivo = scanner.nextLine();

        // try-with-resources: cierra automáticamente el recurso
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            System.out.println("\nContenido del archivo '" + nombreArchivo + "':\n");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            System.out.println("El archivo podría no existir o no tener permisos de lectura.");
        }

        scanner.close();
    }
}

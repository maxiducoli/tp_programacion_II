/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mdd_1
 */
public class TP7 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===============================================");
        System.out.println("   TRABAJO PRÁCTICO 7 - HERENCIA Y POLIMORFISMO");
        System.out.println("===============================================\n");

        // --- Consigna 1: Vehículos ---
        System.out.println("👉 1. PRUEBA DE VEHÍCULOS (Herencia básica)");
        Auto auto = new Auto("Honda", "Civic", 4);
        auto.mostrarInfo();
        System.out.println();

        // --- Consigna 2: Figuras ---
        System.out.println("👉 2. PRUEBA DE FIGURAS (Polimorfismo y clases abstractas)");
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(3, 7),
            new Circulo(1),
            new Rectangulo(10, 2)
        };

        for (Figura figura : figuras) {
            System.out.println(figura.getNombre() + " → Área: " + String.format("%.2f", figura.calcularArea()));
        }
        System.out.println();

        // --- Consigna 3: Empleados ---
        System.out.println("👉 3. PRUEBA DE EMPLEADOS (Polimorfismo e instanceof)");
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Sofía", 2400, 600));
        empleados.add(new EmpleadoTemporal("Diego", 90, 16));
        empleados.add(new EmpleadoPlanta("Camila", 2600, 800));
        empleados.add(new EmpleadoTemporal("Tomás", 70, 20));

        double totalSueldos = 0;
        int contPlanta = 0, contTemporal = 0;

        for (Empleado emp : empleados) {
            double sueldo = emp.calcularSueldo();
            totalSueldos += sueldo;
            System.out.println(emp.getNombre() + ": $" + String.format("%.2f", sueldo));

            if (emp instanceof EmpleadoPlanta) {
                contPlanta++;
            } else if (emp instanceof EmpleadoTemporal) {
                contTemporal++;
            }
        }

        System.out.println("Total a pagar: $" + String.format("%.2f", totalSueldos));
        System.out.println("Empleados de planta: " + contPlanta);
        System.out.println("Empleados temporales: " + contTemporal);
        System.out.println();

        // --- Kata 4: Animales ---
        System.out.println("👉 4. PRUEBA DE ANIMALES (Sobrescritura con @Override)");
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());
        animales.add(new Animal("Criatura desconocida"));

        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("---");
        }

        System.out.println("✅ Todas las pruebas se ejecutaron correctamente.");
    }
    
}

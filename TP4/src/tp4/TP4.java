/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author mdd_1
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Creamos algunos empleados usando ambos constructores

        // Usando el constructor completo
        Empleado emp1 = new Empleado(1, "Ana López", "Desarrolladora", 50000.0);

        // Usando el constructor corto (solo nombre y puesto)
        Empleado emp2 = new Empleado("Carlos Ruiz", "Analista");
        Empleado emp3 = new Empleado("Lucía Gómez", "Diseñadora");

        // Probamos los métodos sobrecargados para actualizar salario

        emp1.actualizarSalario(10); // Aumento del 10%
        emp2.actualizarSalario(5000); // Aumento de $5000

        // Mostramos la información de cada empleado
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        // Mostramos el total de empleados creados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
    
}

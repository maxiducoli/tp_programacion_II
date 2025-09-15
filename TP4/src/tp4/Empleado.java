/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author mdd_1
 */
public class Empleado {
    // Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático: compartido por todas las instancias
    private static int totalEmpleados = 0;

    // Constructor que recibe todos los parámetros
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Sumamos uno al contador global
    }

    // Segundo constructor: solo nombre y puesto
    // El id será automático (por ejemplo, secuencial), y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = 1000 + totalEmpleados; // Un id simple basado en el número de empleados
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.0; // Salario por defecto
        totalEmpleados++; // También incrementamos el contador
    }

    // Métodos getter y setter para cada atributo (encapsulamiento)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método sobrecargado: actualizarSalario con porcentaje
    public void actualizarSalario(double porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje / 100);
        } else {
            System.out.println("El porcentaje debe ser positivo.");
        }
    }

    // Método sobrecargado: actualizarSalario con monto fijo
    public void actualizarSalario(int montoFijo) {
        if (montoFijo > 0) {
            this.salario += montoFijo;
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    // Método toString para mostrar información clara del empleado
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }

    // Método estático para obtener el total de empleados creados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}

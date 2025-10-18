/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7;

/**
 *
 * @author mdd_1
 */
public class EmpleadoPlanta extends Empleado {
    private double salarioBase;
    private double bonificacion;

    public EmpleadoPlanta(String nombre, double salarioBase, double bonificacion) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + bonificacion;
    }
}

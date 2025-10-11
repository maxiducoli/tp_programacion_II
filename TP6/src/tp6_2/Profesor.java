/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_2;

/**
 *
 * @author mdd_1
 */
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; // Cursos que dicta

    // Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // Método: agregarCurso (con sincronización)
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            // Importante: esto solo se llama cuando ya se asignó desde Curso.setProfesor()
            System.out.println("Curso '" + c.getNombre() + "' agregado a " + nombre);
        }
    }

    // Método: eliminarCurso (con sincronización)
    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            System.out.println("Curso '" + c.getNombre() + "' eliminado de " + nombre);
        }
    }

    // Método: listarCursos
    public void listarCursos() {
        System.out.println("\n--- Cursos que dicta " + nombre + " ---");
        if (cursos.isEmpty()) {
            System.out.println("No tiene cursos asignados.");
        } else {
            for (Curso curso : cursos) {
                System.out.println("Código: " + curso.getCodigo() +
                        ", Nombre: " + curso.getNombre());
            }
        }
    }

    // Método: mostrarInfo
    public void mostrarInfo() {
        System.out.println("Profesor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", cantidadCursos=" + cursos.size() +
                '}');
    }

    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }
}
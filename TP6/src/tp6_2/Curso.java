/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_2;

/**
 *
 * @author mdd_1
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    // Constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // Método setProfesor (sincroniza ambos lados)
    public void setProfesor(Profesor nuevoProfesor) {
        // 1. Si ya tenía un profesor anterior, quitarse de su lista
        if (this.profesor != null && this.profesor != nuevoProfesor) {
            this.profesor.eliminarCurso(this);
        }

        // 2. Asignar el nuevo profesor
        this.profesor = nuevoProfesor;

        // 3. Agregar este curso a la lista del nuevo profesor (si no es null)
        if (nuevoProfesor != null) {
            // Aquí llamamos al método del profesor para que agregue el curso
            nuevoProfesor.agregarCurso(this);
        }

        System.out.println("Curso '" + nombre + "' asignado al profesor: " +
                (nuevoProfesor != null ? nuevoProfesor.getNombre() : "ninguno"));
    }

    // Método: mostrarInfo
    public void mostrarInfo() {
        System.out.println("Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", profesor='" + (profesor != null ? profesor.getNombre() : "sin asignar") + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Curso{" + codigo + ": " + nombre + "}";
    }
}

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

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // Métodos: agregarProfesor y agregarCurso
    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
            System.out.println("Profesor agregado: " + p.getNombre());
        } else {
            System.out.println("El profesor con ID " + p.getId() + " ya está registrado.");
        }
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            System.out.println("Curso agregado: " + c.getNombre());
        } else {
            System.out.println("El curso con código " + c.getCodigo() + " ya existe.");
        }
    }

    // Método: asignarProfesorACurso
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("Curso con código " + codigoCurso + " no encontrado.");
            return false;
        }
        if (profesor == null) {
            System.out.println("Profesor con ID " + idProfesor + " no encontrado.");
            return false;
        }

        // Usa el método seguro que sincroniza ambos lados
        curso.setProfesor(profesor);
        return true;
    }

    // Métodos: buscarProfesorPorId y buscarCursoPorCodigo
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    // Métodos: listarProfesores y listarCursos
    public void listarProfesores() {
        System.out.println("\n--- Profesores de la Universidad '" + nombre + "' ---");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            for (Profesor p : profesores) {
                p.mostrarInfo();
            }
        }
    }

    public void listarCursos() {
        System.out.println("\n--- Cursos de la Universidad '" + nombre + "' ---");
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
        } else {
            for (Curso c : cursos) {
                c.mostrarInfo();
            }
        }
    }

    // Método: eliminarCurso
    public boolean eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // 1. Si tiene profesor, eliminar el curso de su lista
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            // 2. Eliminar de la lista de la universidad
            cursos.remove(curso);
            System.out.println("Curso eliminado: " + curso.getNombre());
            return true;
        } else {
            System.out.println("Curso con código " + codigo + " no encontrado.");
            return false;
        }
    }

    // Método: eliminarProfesor
    public boolean eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // 1. Para cada curso que dictaba, poner profesor = null
            for (Curso curso : profesor.getCursos()) {
                curso.setProfesor(null); // Esto automáticamente lo quita del lado del profesor
            }
            // 2. Eliminar de la lista de la universidad
            profesores.remove(profesor);
            System.out.println("Profesor eliminado: " + profesor.getNombre());
            return true;
        } else {
            System.out.println("Profesor con ID " + id + " no encontrado.");
            return false;
        }
    }

    // Método: reporte cantidad de cursos por profesor
    public void reporteCursosPorProfesor() {
        System.out.println("\n--- Reporte: Cantidad de Cursos por Profesor ---");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " (" + p.getEspecialidad() + "): " +
                    p.getCursos().size() + " curso(s)");
        }
    }
}

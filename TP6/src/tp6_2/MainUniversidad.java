/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_2;

/**
 *
 * @author mdd_1
 */
public class MainUniversidad {
    public static void main(String[] args) {
        // Tarea 1: Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("PR001", "Dr. Ana López", "Matemáticas");
        Profesor p2 = new Profesor("PR002", "Ing. Carlos Ruiz", "Programación");
        Profesor p3 = new Profesor("PR003", "Dra. Lucía Fernández", "Física");

        Curso c1 = new Curso("MAT101", "Álgebra Lineal");
        Curso c2 = new Curso("MAT202", "Cálculo Avanzado");
        Curso c3 = new Curso("PROG101", "Introducción a Java");
        Curso c4 = new Curso("PROG202", "POO Avanzada");
        Curso c5 = new Curso("FIS101", "Física Cuántica");

        // Tarea 2: Agregar profesores y cursos a la universidad.
        Universidad uni = new Universidad("Universidad Nacional del Sur");
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Tarea 3: Asignar profesores a cursos usando asignarProfesorACurso(...)
        uni.asignarProfesorACurso("MAT101", "PR001"); // Ana → Álgebra
        uni.asignarProfesorACurso("MAT202", "PR001"); // Ana → Cálculo
        uni.asignarProfesorACurso("PROG101", "PR002"); // Carlos → Java
        uni.asignarProfesorACurso("PROG202", "PR002"); // Carlos → POO
        uni.asignarProfesorACurso("FIS101", "PR003"); // Lucía → Física

        // Tarea 4: Listar cursos con su profesor y profesores con sus cursos.
        uni.listarCursos();
        p1.listarCursos();
        p2.listarCursos();
        p3.listarCursos();

        // Tarea 5: Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("\n=== Reasignando 'Álgebra Lineal' de Ana a Carlos ===");
        uni.asignarProfesorACurso("MAT101", "PR002"); // Ahora Carlos dicta Álgebra

        // Verificar: Ana ya no debe tener Álgebra, Carlos sí
        p1.listarCursos(); // Ya no debe aparecer Álgebra
        p2.listarCursos(); // Debe tener 3 cursos ahora
        uni.listarCursos(); // MAT101 ahora dice profesor Carlos

        // Tarea 6: Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\n=== Eliminando curso 'FIS101' ===");
        uni.eliminarCurso("FIS101");
        p3.listarCursos(); // Ya no debe tener cursos

        // Tarea 7: Remover un profesor y dejar profesor=null en sus cursos.
        System.out.println("\n=== Eliminando profesor 'PR002' (Carlos) ===");
        uni.eliminarProfesor("PR002");
        // Verificamos estado de cursos que tenía
        uni.listarCursos(); // PROG101, PROG202 y MAT101 deben tener profesor "sin asignar"

        // Tarea 8: Mostrar un reporte: cantidad de cursos por profesor.
        uni.reporteCursosPorProfesor();
    }
}
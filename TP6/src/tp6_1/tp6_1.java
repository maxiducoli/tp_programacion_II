/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_1;

/**
 *
 * @author mdd_1
 */
public class tp6_1 {
public static void main(String[] args) {
        // Tarea 1: Creamos una biblioteca.
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Tarea 2: Crear al menos tres autores
        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("A002", "Stephen King", "Estadounidense");
        Autor a3 = new Autor("A003", "J.K. Rowling", "Británica");

        // Tarea 3: Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblioteca.agregarLibro("978-0060850524", "Cien Años de Soledad", 1967, a1);
        biblioteca.agregarLibro("978-0307743657", "It", 1986, a2);
        biblioteca.agregarLibro("978-0747532699", "Harry Potter y la Piedra Filosofal", 1997, a3);
        biblioteca.agregarLibro("978-0452284234", "El Amor en los Tiempos del Cólera", 1985, a1);
        biblioteca.agregarLibro("978-0385523954", "Doctor Sueño", 2013, a2);

        // Tarea 4: Listar todos los libros con su información y la del autor.
        biblioteca.listarLibros();

        // Tarea 5: Buscar un libro por su ISBN y mostrar su información.
        String isbnBuscar = "978-0307743657";
        Libro encontrado = biblioteca.buscarLibroPorIsbn(isbnBuscar);
        if (encontrado != null) {
            System.out.println("\n--- Libro encontrado por ISBN " + isbnBuscar + " ---");
            encontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado con ISBN: " + isbnBuscar);
        }

        // Tarea 6: Filtrar y mostrar los libros publicados en un año específico.
        biblioteca.filtrarLibrosPorAnio(1985); // Debería mostrar "El Amor en los Tiempos del Cólera"

        // Tarea 7: Eliminar un libro por su ISBN y listar los libros restantes.
        biblioteca.eliminarLibro("978-0747532699"); // Harry Potter
        biblioteca.listarLibros(); // Mostrar después de eliminar

        // Tarea 8: Mostrar la cantidad total de libros en la biblioteca.
        biblioteca.obtenerCantidadLibros();

        // Tarea 9: Listar todos los autores de los libros disponibles en la biblioteca.
        biblioteca.mostrarAutoresDisponibles();
    }
}


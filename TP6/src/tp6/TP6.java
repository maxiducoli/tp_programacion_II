/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6;

/**
 *
 * @author mdd_1
 */
public class TP6 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Crear inventario
        Inventario inventario = new Inventario();

        // Tarea 1: Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Producto p1 = new Producto("P001", "Arroz", 950.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Televisor LED", 2500.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Camisa", 1800.0, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Aspiradora", 2200.0, 8, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Galletas", 700.0, 100, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Tarea 2: Listar todos los productos
        inventario.listarProductos();

        // Tarea 3: Buscar un producto por ID
        String idBuscar = "P002";
        Producto encontrado = inventario.buscarProductoPorId(idBuscar);
        if (encontrado != null) {
            System.out.println("\n--- Producto encontrado por ID " + idBuscar + " ---");
            encontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado con ID: " + idBuscar);
        }

        // Tarea 4: Filtrar y mostrar productos por categoría
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // Tarea 5: Eliminar un producto por su ID
        inventario.eliminarProducto("P004"); // Aspiradora
        inventario.listarProductos(); // Mostrar después de eliminar

        // Tarea 6: Actualizar el stock de un producto
        inventario.actualizarStock("P001", 60); // Arroz ahora tiene 60 unidades

        // Tarea 7: Mostrar el total de stock disponible
        inventario.obtenerTotalStock();

        // Tarea 8: Obtener y mostrar el producto con mayor stock
        inventario.obtenerProductoConMayorStock();

        // Tarea 9: Filtrar productos con precios entre $1000 y $3000
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // Tarea 10: Mostrar las categorías disponibles con sus descripciones
        inventario.mostrarCategoriasDisponibles();
    }
    
}

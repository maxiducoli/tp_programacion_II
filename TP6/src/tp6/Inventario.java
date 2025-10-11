/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author mdd_1
 */
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    // Constructor
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Método: agregarProducto
    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre());
    }

    // Método: listarProductos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("\n--- Lista de Productos ---");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    // Método: buscarProductoPorId
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null; // No encontrado
    }

    // Método: eliminarProducto
    public boolean eliminarProducto(String id) {
        Producto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            productos.remove(encontrado);
            System.out.println("Producto eliminado: " + encontrado.getNombre());
            return true;
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
            return false;
        }
    }

    // Método: actualizarStock
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            encontrado.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para " + encontrado.getNombre() + ": " + nuevaCantidad);
            return true;
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
            return false;
        }
    }

    // Método: filtrarPorCategoria
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n--- Productos de la categoría: " + categoria.name() + " ---");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en esta categoría.");
        }
    }

    // Método: obtenerTotalStock
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        System.out.println("Total de unidades en stock: " + total);
        return total;
    }

    // Método: obtenerProductoConMayorStock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return null;
        }
        Producto max = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > max.getCantidad()) {
                max = p;
            }
        }
        System.out.println("Producto con mayor stock: ");
        max.mostrarInfo();
        return max;
    }

    // Método: filtrarProductosPorPrecio
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\n--- Productos con precio entre $" + min + " y $" + max + " ---");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos en ese rango de precio.");
        }
    }

    // Método: mostrarCategoriasDisponibles
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- Categorías Disponibles ---");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat.name() + ": " + cat.getDescripcion());
        }
    }
}
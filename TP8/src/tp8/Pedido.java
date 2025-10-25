package tp8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mdd_1
 */
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private Cliente cliente;
    private boolean confirmado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.confirmado = false;
    }

    public void agregarProducto(Producto producto) {
        if (producto != null) {
            productos.add(producto);
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    // Nuevo: Confirmar el pedido y notificar al cliente
    public void confirmar() {
        if (!confirmado && !productos.isEmpty()) {
            confirmado = true;
            double total = calcularTotal();
            cliente.notificar("Tu pedido ha sido confirmado. Total: $" + String.format("%.2f", total) +
                    ". Gracias por tu compra.");
        } else if (confirmado) {
            System.out.println("El pedido ya fue confirmado anteriormente.");
        } else {
            cliente.notificar("No se puede confirmar el pedido porque no contiene productos.");
        }
    }

    public List<Producto> getProductos() {
        return new ArrayList<>(productos);
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "productos=" + productos +
                ", total=" + String.format("%.2f", calcularTotal()) +
                ", cliente=" + cliente.getNombre() +
                ", confirmado=" + confirmado +
                '}';
    }
}
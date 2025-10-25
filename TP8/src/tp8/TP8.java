/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8;
import java.util.Scanner;

/**
 *
 * @author mdd_1
 */
public class TP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        System.out.println("=== TRABAJO PRÁCTICO 8 - INTERFACES Y EXCEPCIONES ===\n");

        // ========================
        // PARTE 1: E-COMMERCE
        // ========================

        System.out.println("1. TESTEANDO EL SISTEMA DE E-COMMERCE\n");

        // Crear productos
        Producto producto1 = new Producto("Laptop", 1500.0);
        Producto producto2 = new Producto("Mouse", 25.5);
        Producto producto3 = new Producto("Teclado", 70.0);

        System.out.println("Productos creados:");
        System.out.println(" - " + producto1);
        System.out.println(" - " + producto2);
        System.out.println(" - " + producto3);
        System.out.println();

        // Crear cliente
        Cliente cliente = new Cliente("Ana Pérez", "ana@email.com");
        System.out.println("Cliente creado: " + cliente.getNombre() + " (" + cliente.getEmail() + ")");
        System.out.println();

        // Crear pedido
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);

        System.out.println("Pedido actual:");
        System.out.println("Total: $" + pedido.calcularTotal());
        System.out.println();

        // Confirmar pedido → debería notificar al cliente
        System.out.println("Confirmando pedido...");
        pedido.confirmar();
        System.out.println();

        // Agregar otro producto y confirmar otra vez (para ver que no se repite)
        pedido.agregarProducto(producto3);
        System.out.println("\nIntentando confirmar de nuevo...");
        pedido.confirmar(); // Debe decir que ya fue confirmado
        System.out.println();

        // ========================
        // MEDIO DE PAGO
        // ========================

        System.out.println("2. TESTEANDO MEDIOS DE PAGO\n");

        TarjetaCredito tarjeta = new TarjetaCredito("1234567890123456", 2000.0);
        PayPal paypal = new PayPal("user@paypal.com", true);

        System.out.println("Procesando pago con tarjeta...");
        tarjeta.aplicarDescuento(10); // 10% de descuento
        tarjeta.procesarPago(pedido.calcularTotal());

        System.out.println();

        System.out.println("Procesando pago con PayPal...");
        paypal.aplicarDescuento(15); // Aplica hasta 30%
        paypal.procesarPago(pedido.calcularTotal());
        System.out.println();

        // ========================
        // PARTE 2: EXCEPCIONES
        // ========================

        System.out.println("3. TESTEANDO EXCEPCIONES\n");

        // División segura
        System.out.println("→ División por cero:");
        try {
            double resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
        System.out.println();

        // Conversión de número
        System.out.println("→ Conversión de texto a número:");
        String entrada = "abc";
        try {
            int num = Integer.parseInt(entrada);
            System.out.println("Número: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + entrada + "' no es un número válido.");
        }
        System.out.println();

        // Edad inválida
        System.out.println("→ Validación de edad:");
        int edad = -5;
        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("La edad " + edad + " no es válida.");
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== FIN DEL PROGRAMA ===");
        scanner.close();
    }
    
}

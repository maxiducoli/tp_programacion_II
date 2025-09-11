/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion2;
import java.util.Scanner;
/**
 *
 * @author mdd_1
 */
public class tp4 {
// Variable global para el ejercicio 11
static double DESCUENTO_ESPECIAL = 0.10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // === EJERCICIO 1: Verificación de Año Bisiesto ===
        System.out.println("=== Ejercicio 1: Año Bisiesto ===");
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }

        // === EJERCICIO 2: Mayor de Tres Números ===
        System.out.println("\n=== Ejercicio 2: Mayor de Tres Números ===");
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = sc.nextInt();
        int mayor = Math.max(num1, Math.max(num2, num3));
        System.out.println("El mayor es: " + mayor);

        // === EJERCICIO 3: Clasificación de Edad ===
        System.out.println("\n=== Ejercicio 3: Clasificación de Edad ===");
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        String etapa;
        if (edad < 12) {
            etapa = "Niño";
        } else if (edad >= 12 && edad <= 17) {
            etapa = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            etapa = "Adulto";
        } else {
            etapa = "Adulto mayor";
        }
        System.out.println("Eres un " + etapa + ".");

        // === EJERCICIO 4: Calculadora de Descuento por Categoría ===
        System.out.println("\n=== Ejercicio 4: Descuento por Categoría ===");
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = sc.next().toUpperCase().charAt(0);
        double descuento = 0;
        switch (categoria) {
            case 'A': descuento = 0.10; break;
            case 'B': descuento = 0.15; break;
            case 'C': descuento = 0.20; break;
            default:
                System.out.println("Categoría inválida. Se aplicará 0% de descuento.");
        }
        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (int)(descuento*100) + "%");
        System.out.println("Precio final: " + precioFinal);

        // === EJERCICIO 5: Suma de Números Pares (while) ===
        System.out.println("\n=== Ejercicio 5: Suma de Números Pares ===");
        int sumaPares = 0;
        int numero;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();
            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }
        } while (numero != 0);
        System.out.println("La suma de los números pares es: " + sumaPares);

        // === EJERCICIO 6: Contador de Positivos, Negativos y Ceros ===
        System.out.println("\n=== Ejercicio 6: Contador de Números ===");
        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int n = sc.nextInt();
            if (n > 0) positivos++;
            else if (n < 0) negativos++;
            else ceros++;
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        // === EJERCICIO 7: Validación de Nota (do-while) ===
        System.out.println("\n=== Ejercicio 7: Validación de Nota ===");
        double nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");

        // === EJERCICIO 8: Precio Final con Impuesto y Descuento ===
        System.out.println("\n=== Ejercicio 8: Precio Final ===");
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuestoPorc = sc.nextDouble() / 100;
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuentoPorc = sc.nextDouble() / 100;
        double precioFinal8 = calcularPrecioFinal(precioBase, impuestoPorc, descuentoPorc);
        System.out.println("El precio final del producto es: " + precioFinal8);

        // === EJERCICIO 9: Costo de Envío y Total de Compra ===
        System.out.println("\n=== Ejercicio 9: Costo de Envío y Total ===");
        System.out.print("Ingrese el precio del producto: ");
        double precioProd = sc.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.next();
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precioProd, costoEnvio);
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);

        // === EJERCICIO 10: Actualización de Stock ===
        System.out.println("\n=== Ejercicio 10: Actualización de Stock ===");
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = sc.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantVendida = sc.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantRecibida = sc.nextInt();
        int nuevoStock = actualizarStock(stockActual, cantVendida, cantRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        // === EJERCICIO 11: Descuento Especial con Variable Global ===
        System.out.println("\n=== Ejercicio 11: Descuento Especial ===");
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();
        calcularDescuentoEspecial(precioProducto);

        // === EJERCICIO 12: Modificación de Array de Precios ===
        System.out.println("\n=== Ejercicio 12: Modificación de Array de Precios ===");
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};
        System.out.println("Precios originales:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }
        precios[2] = 129.99; // Modificamos el tercer producto
        System.out.println("Precios modificados:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }

        // === EJERCICIO 13: Impresión Recursiva de Arrays ===
        System.out.println("\n=== Ejercicio 13: Impresión Recursiva de Arrays ===");
        double[] precios13 = {199.99, 299.50, 149.75, 399.00, 89.99};
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios13, 0);
        precios13[2] = 129.99;
        System.out.println("Precios modificados:");
        imprimirArrayRecursivo(precios13, 0);

        sc.close();
    }
    
    // === MÉTODO PARA EJERCICIO 8 ===
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }

    // === MÉTODOS PARA EJERCICIO 9 ===
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona desconocida. Se aplicará tarifa nacional.");
            return peso * 5;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    // === MÉTODO PARA EJERCICIO 10 ===
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    // === MÉTODO PARA EJERCICIO 11 ===
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    // === MÉTODO PARA EJERCICIO 13: Impresión recursiva ===
    public static void imprimirArrayRecursivo(double[] array, int indice) {
        if (indice >= array.length) {
            return;
        }
        System.out.println("Precio: $" + array[indice]);
        imprimirArrayRecursivo(array, indice + 1);
    }
    
}


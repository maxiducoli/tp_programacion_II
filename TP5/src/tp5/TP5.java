/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

/**
 *
 * @author mdd_1
 */
public class TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("==================================");
        System.out.println(" TRABAJO PRÁCTICO: RELACIONES UML ");
        System.out.println("       Ejercicios 1 a 14           ");
        System.out.println("==================================\n");

        // ======== EJERCICIO 1: Pasaporte - Foto - Titular ==========
        System.out.println("1. PASAPORTE - FOTO - TITULAR (Composición + Asociación bidireccional)");
        Foto foto = new Foto(new String("MOSTRAR FOTO"), "JPEG");
        Titular titular = new Titular("Ana López", "22333444");
        Pasaporte pasaporte = new Pasaporte("AR123456", new String("FOTO"), foto, titular);
        System.out.println("Pasaporte de: " + pasaporte.getTitular().getNombre());
        System.out.println("Foto formato: " + pasaporte.getFoto().getFormato() + "\n");

        // ======== EJERCICIO 2: Celular - Batería - Usuario =========
        System.out.println("2. CELULAR - BATERÍA - USUARIO (Agregación + Asociación bidireccional)");
        Bateria bateria = new Bateria("Li-Ion 5000mAh", 5000);
        Usuario usuario = new Usuario("Carlos Ruiz", "33444555");
        Celular celular = new Celular("IMEI987654321", "Samsung", "Galaxy S23", bateria, usuario);
        System.out.println("Celular marca: " + celular.getMarca());
        System.out.println("Usuario: " + celular.getUsuario().getNombre());
        System.out.println("Batería capacidad: " + celular.getBateria().getCapacidad() + " mAh\n");

        // ======== EJERCICIO 3: Libro - Autor - Editorial ===========
        System.out.println("3. LIBRO - AUTOR - EDITORIAL (Asociación + Agregación)");
        Autor autor = new Autor("Gabriel García Márquez", "Colombiano");
        Editorial editorial = new Editorial("Sudamericana", "Av. Siempre Viva 123");
        Libro libro = new Libro("Cien Años de Soledad", "978-0060883287", autor, editorial);
        System.out.println("Libro: " + libro.getTitulo() + " - Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre() + "\n");

        // ======== EJERCICIO 4: Tarjeta - Cliente - Banco ============
        System.out.println("4. TARJETA DE CRÉDITO - CLIENTE - BANCO (Asociación bidireccional + Agregación)");
        Banco banco = new Banco("Banco Nación", "30-54321098-7");
        Cliente cliente = new Cliente("Lucía Pérez", "28999888");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", new String(), banco, cliente);
        System.out.println("Tarjeta de: " + tarjeta.getCliente().getNombre());
        System.out.println("Banco emisor: " + tarjeta.getBanco().getNombre() + "\n");

        // ======== EJERCICIO 5: Computadora - PlacaMadre - Propietario ==
        System.out.println("5. COMPUTADORA - PLACA MADRE - PROPIETARIO (Composición + Asociación)");
        PlacaMadre placa = new PlacaMadre("ASUS Prime B650", "AMD B650");
        Propietario propietario = new Propietario("Martín Díaz", "31222333");
        Computadora compu = new Computadora("HP", "SN123456789", placa, propietario);
        System.out.println("Computadora marca: " + compu.getMarca());
        System.out.println("Propietario: " + compu.getPropietario().getNombre());
        System.out.println("Placa modelo: " + compu.getPlacaMadre().getModelo() + "\n");

        // ======== EJERCICIO 6: Reserva - Cliente - Mesa =============
        System.out.println("6. RESERVA - CLIENTE - MESA (Asociación + Agregación)");
        Cliente01 clienteReserva = new Cliente01("Sofía Torres", "35666777");
        Mesa mesa = new Mesa(12, 4);
        Reserva reserva = new Reserva(new String(), "20:00", clienteReserva, mesa);
        System.out.println("Reserva para: " + reserva.getCliente().getNombre());
        System.out.println("Mesa número: " + reserva.getMesa().getNumero() + "\n");

        // ======== EJERCICIO 7: Vehículo - Motor - Conductor =========
        System.out.println("7. VEHÍCULO - MOTOR - CONDUCTOR (Agregación + Asociación)");
        Motor motor = new Motor("V8", "MTR-888888");
        Conductor conductor = new Conductor("Ricardo Fort", "LIC-777");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Ferrari F8", motor, conductor);
        System.out.println("Vehículo patente: " + vehiculo.getPatente());
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Motor tipo: " + vehiculo.getMotor().getTipo() + "\n");

        // ======== EJERCICIO 8: Documento - FirmaDigital - Usuario ====
        System.out.println("8. DOCUMENTO - FIRMA DIGITAL - USUARIO (Composición + Agregación)");
        Usuario01 firmante = new Usuario01("Dr. Elena Martínez", "elena@medicos.org");
        Documento doc = new Documento("Informe Médico", "Contenido confidencial...", firmante);
        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Firmado por: " + doc.getFirmaDigital().getFirmante().getNombre());
        System.out.println("Hash: " + doc.getFirmaDigital().getCodigoHash() + "\n");

        // ======== EJERCICIO 9: CitaMédica - Paciente - Profesional ===
        System.out.println("9. CITA MÉDICA - PACIENTE - PROFESIONAL (Asociaciones unidireccionales)");
        Paciente paciente = new Paciente("Camila Ríos", "PAMI");
        Profesional prof = new Profesional("Dra. Lucía Gómez", "Cardiología");
        CitaMedica cita = new CitaMedica(new String(), "10:30", paciente, prof);
        System.out.println("Cita con: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre() + "\n");

        // ======== EJERCICIO 10: CuentaBancaria - ClaveSeguridad - Titular ==
        System.out.println("10. CUENTA BANCARIA - CLAVE SEGURIDAD - TITULAR (Composición + Asociación)");
        Titular01 titularCuenta = new Titular01("Jorge Luís", "27111222");
        CuentaBancaria cuenta = new CuentaBancaria("00001111222233334444", 5000.0, "1234", titularCuenta);
        System.out.println("Cuenta CBU: " + cuenta.getCbu());
        System.out.println("Saldo: $" + cuenta.getSaldo());
        System.out.println("Titular: " + cuenta.getTitular().getNombre() + "\n");

        // ======== EJERCICIO 11: Reproductor - Canción - Artista ======
        System.out.println("11. REPRODUCTOR - CANCIÓN - ARTISTA (Dependencia de uso)");
        Artista artista = new Artista("Queen", "Rock");
        Cancion cancion = new Cancion("Bohemian Rhapsody", artista);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
        System.out.println();

        // ======== EJERCICIO 12: Impuesto - Contribuyente - Calculadora ==
        System.out.println("12. IMPUESTO - CONTRIBUYENTE - CALCULADORA (Dependencia de uso)");
        Contribuyente contribuyente = new Contribuyente("Empresa SA", "30-12345678-9");
        Impuesto impuesto = new Impuesto(1000.0, contribuyente);
        Calculadora calc = new Calculadora();
        calc.calcular(impuesto);
        System.out.println();

        // ======== EJERCICIO 13: GeneradorQR - Usuario - CódigoQR ====
        System.out.println("13. GENERADOR QR - USUARIO - CÓDIGO QR (Dependencia de creación)");
        Usuario02 usuarioQR = new Usuario02("Ana Silva", "ana@email.com");
        GeneradorQR generador = new GeneradorQR();
        generador.generar("https://miweb.com", usuarioQR);
        System.out.println();

        // ======== EJERCICIO 14: EditorVideo - Proyecto - Render =====
        System.out.println("14. EDITOR VIDEO - PROYECTO - RENDER (Dependencia de creación)");
        Proyecto proyecto = new Proyecto("Spot Publicitario", 5);
        EditorVideo editor = new EditorVideo();
        editor.exportar("mp4", proyecto);
        System.out.println();

        System.out.println("✅ Todos los ejercicios se ejecutaron correctamente.");
    }
    
}

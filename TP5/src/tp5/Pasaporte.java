package tp5;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;  // Composición: la foto es parte integral del pasaporte
        this.titular = titular;
        // Establecer asociación bidireccional
        this.titular.setPasaporte(this);
    }

    // Getters y setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(String fechaEmision) { this.fechaEmision = fechaEmision; }

    public Foto getFoto() { return foto; }
    public void setFoto(Foto foto) { this.foto = foto; }

    public Titular getTitular() { return titular; }
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null) {
            titular.setPasaporte(this);
        }
    }
}
package sebastian.garcia.model;

import java.util.Date;

public class Cancion {
    public Cancion(String titulo, String identificador, Genero genero, Date fecha, Long duracion, String caratula, String descripcion) {
        this.titulo = titulo;
        this.identificador = identificador;
        this.genero = genero;
        this.fecha = fecha;
        this.duracion = duracion;
        this.caratula = caratula;
        this.descripcion = descripcion;
    }
    private String titulo;
    private String identificador;
    private Genero genero;
    private Date fecha;
    private Long duracion;
    private String caratula;
    private String descripcion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getDuracion() {
        return duracion;
    }

    public void setDuracion(Long duracion) {
        this.duracion = duracion;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

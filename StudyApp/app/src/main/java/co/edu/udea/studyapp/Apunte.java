package co.edu.udea.studyapp;

/**
 * Created by Xjuan on 23/03/2018.
 */

public class Apunte {
    private int id;
    private String nombreApunte, descripcionApunte, fechaPublicacion;

    public Apunte(int id, String nombreApunte, String descripcionApunte, String fechaPublicacion) {
        this.id = id;
        this.nombreApunte = nombreApunte;
        this.descripcionApunte = descripcionApunte;
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreApunte() {
        return nombreApunte;
    }

    public void setNombreApunte(String nombreApunte) {
        this.nombreApunte = nombreApunte;
    }

    public String getDescripcionApunte() {
        return descripcionApunte;
    }

    public void setDescripcionApunte(String descripcionApunte) {
        this.descripcionApunte = descripcionApunte;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}

package co.edu.udea.studyapp;

/**
 * Created by Xjuan on 23/03/2018.
 */

public class Materia {
    private int id;
    private String nombreMateria, fechaPublicacion;
    private int image;

    public Materia(int id, String nombreMateria, String fechaPublicacion, int image) {
        this.id = id;
        this.nombreMateria = nombreMateria;
        this.fechaPublicacion = fechaPublicacion;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

package mx.edu.tesoem.isc.dinoapp.ui;

public class Modelo {
    private String nombre, pronunciacion;
    int imagen;

    public Modelo(String nombre, String pronunciacion, int imagen) {
        this.nombre = nombre;
        this.pronunciacion = pronunciacion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPronunciacion() {
        return pronunciacion;
    }

    public void setPronunciacion(String pronunciacion) {
        this.pronunciacion = pronunciacion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}

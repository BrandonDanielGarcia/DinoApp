package mx.edu.tesoem.isc.dinoapp.ui;

public class ModeloFull {
    private String nombre, pronunciacion, significado, dieta, altura, periodo, mya, info;
    int imagen, id;

    public ModeloFull(String nombre, String pronunciacion, String significado, String dieta, String altura, String periodo, String mya, String info, int imagen, int id) {
        this.nombre = nombre;
        this.pronunciacion = pronunciacion;
        this.significado = significado;
        this.dieta = dieta;
        this.altura = altura;
        this.periodo = periodo;
        this.mya = mya;
        this.info = info;
        this.imagen = imagen;
        this.id = id;
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

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getMya() {
        return mya;
    }

    public void setMya(String mya) {
        this.mya = mya;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

package br.com.etecia.myapp;

public class Cars {

    //Varivaies Globais
    private String titulo;
    private int imgCars;

    //constructor

    public Cars() {
    }

    public Cars(String titulo, int imgCars) {
        this.titulo = titulo;
        this.imgCars = imgCars;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImgCars() {
        return imgCars;
    }

    public void setImgCars(int imgCars) {
        this.imgCars = imgCars;
    }
}

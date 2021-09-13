package com.janett.tp3.modelo;

import java.io.Serializable;

public class pelicula implements Serializable {

    private String titulo;
    private int foto;
    private String descripcion;
    private String autor;
    private String director;

    public pelicula(String titulo, int foto, String descripcion, String autor, String director){
        this.titulo = titulo;
        this.foto = foto;
        this.descripcion = descripcion;
        this.autor = autor;
        this.director = director;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

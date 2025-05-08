package com.example.parcial2.User;

public class User {


    public int getnombre;
    private String imagen;
    private String nombre;
    private String Descripcion;

    public User(String imagen, String nombre, String Descripcion) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.Descripcion = Descripcion;

    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
}




package com.bryansilverio.serviciorest.core.models;

/**
 * Created by Bryan Silverio on 18/12/2017.
 */

public class Cliente {
    private int id;
    private String nombre;
    private String telefono;

    public Cliente(){}

    public Cliente(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

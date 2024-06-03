package com.mycompany.veterinaria.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_duenio;
    @Basic
    private String nombre;
    private String celular;

    public Duenio() {
    }

    public Duenio(int id_duenio, String nombre, String celular) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.celular = celular;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Duenio{" + "id_duenio=" + id_duenio + ", nombre=" + nombre + ", celular=" + celular + '}';
    }
    
    
    
    
}

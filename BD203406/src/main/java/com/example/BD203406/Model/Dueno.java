package com.example.BD203406.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Dueño")
public class Dueno {

    @Id
    @Column(name ="IdDueño")
    private String idDueño;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Telefono")
    private String telefono;

    @Column(name = "Direccion")
    private String direccion;

    public Dueno(){

    }
    public Dueno(String idDueño, String nombre, String telefono, String direccion){
        this.idDueño = idDueño;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public String getIdDueño() {
        return idDueño;
    }
    public void setIdDueño(String idDueño){
        this.idDueño = idDueño;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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


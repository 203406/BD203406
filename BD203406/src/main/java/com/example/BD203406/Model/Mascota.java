package com.example.BD203406.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="mascota")
public class Mascota {
    @Id
    @Column(name = "idMascota")
    private String idMascota;

    @Column(name = "nombreMascota")
    private String nombreMascota;

    @Column(name = "tipoMascota")
    private String tipoMascota;

    @Column(name = "fechaIngreso")
    private String fechaIngreso;

    public Mascota() {
    }

    public Mascota(String idMascota, String nombreMascota, String tipoMascota, String fechaIngreso) {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.tipoMascota = tipoMascota;
        this.fechaIngreso = fechaIngreso;
    }

    public String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}


package com.example.BD203406.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cita")
public class Cita {

    @Column(name ="Fecha")
    private String fecha;

    @Column(name = "Hora")
    private String hora;

    @Id
    @Column(name = "IdTipoServicio")
    private String idTipoServicio;

    @Column(name = "IdDueño")
    private String idDueño;


    @Column(name = "IdTipoMascota")
    private String idTipoMascota;

    public Cita(){

    }
    public Cita(String fecha, String hora, String idTipoServicio, String idDueño, String idTipoMascota){
        this.idTipoServicio = idTipoServicio;
        this.idDueño = idDueño;
        this.idTipoMascota = idTipoMascota;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getIdTipoServicio(){
        return idTipoServicio;
    }
    public void setIdTipoServicio(String idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public String getIdDueño() {
        return idDueño;
    }
    public void setIdDueño(String idDueño){
        this.idDueño = idDueño;
    }
    public String getIdTipoMascota(){
        return idTipoMascota;
    }
    public void setIdTipoMascota(String idTipoMascota) {
        this.idTipoMascota = idTipoMascota;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String Hora){
        this.hora = hora;
    }
}


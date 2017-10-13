package com.pablourbano.atletasrestatapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Medalla {
    @Id
    @GeneratedValue
    private Long id;
    private String enumeracion;
    private String especialidad;
    private String competicion;

    @ManyToOne
    private Atleta atleta;
    public Medalla() {
    }

    public Medalla(String enumeracion, String especialidad, String competicion) {
        this.enumeracion = enumeracion;
        this.especialidad = especialidad;
        this.competicion = competicion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnumeracion() {
        return enumeracion;
    }

    public void setEnumeracion(String enumeracion) {
        this.enumeracion = enumeracion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    @Override
    public String toString() {
        return "Medalla{" +
                "id=" + id +
                ", enumeracion='" + enumeracion + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", competicion='" + competicion + '\'' +
                '}';
    }
}

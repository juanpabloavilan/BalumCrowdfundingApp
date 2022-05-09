/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balum.dto;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author javil
 */
@Entity
@Table(name = "donante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Donante.findAll", query = "SELECT d FROM Donante d"),
    @NamedQuery(name = "Donante.findByIddonante", query = "SELECT d FROM Donante d WHERE d.iddonante = :iddonante"),
    @NamedQuery(name = "Donante.findByCorreo", query = "SELECT d FROM Donante d WHERE d.correo = :correo"),
    @NamedQuery(name = "Donante.findByCedula", query = "SELECT d FROM Donante d WHERE d.cedula = :cedula"),
    @NamedQuery(name = "Donante.findByNombre", query = "SELECT d FROM Donante d WHERE d.nombre = :nombre")})
public class Donante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddonante")
    private Integer iddonante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cedula")
    private String cedula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "idDonante")
    private Collection<Donacion> donacionCollection;

    public Donante() {
    }

    public Donante(Integer iddonante) {
        this.iddonante = iddonante;
    }

    public Donante(Integer iddonante, String correo, String cedula, String nombre) {
        this.iddonante = iddonante;
        this.correo = correo;
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Integer getIddonante() {
        return iddonante;
    }

    public void setIddonante(Integer iddonante) {
        this.iddonante = iddonante;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Donacion> getDonacionCollection() {
        return donacionCollection;
    }

    public void setDonacionCollection(Collection<Donacion> donacionCollection) {
        this.donacionCollection = donacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddonante != null ? iddonante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donante)) {
            return false;
        }
        Donante other = (Donante) object;
        if ((this.iddonante == null && other.iddonante != null) || (this.iddonante != null && !this.iddonante.equals(other.iddonante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.balum.dto.Donante[ iddonante=" + iddonante + " ]";
    }
    
}

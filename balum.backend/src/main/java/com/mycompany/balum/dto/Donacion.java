/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balum.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author javil
 */
@Entity
@Table(name = "donacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Donacion.findAll", query = "SELECT d FROM Donacion d"),
    @NamedQuery(name = "Donacion.findByIdDonacion", query = "SELECT d FROM Donacion d WHERE d.idDonacion = :idDonacion"),
    @NamedQuery(name = "Donacion.findByValor", query = "SELECT d FROM Donacion d WHERE d.valor = :valor"),
    @NamedQuery(name = "Donacion.findByFecha", query = "SELECT d FROM Donacion d WHERE d.fecha = :fecha")})
public class Donacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDonacion")
    private Integer idDonacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private int valor;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "idDonante", referencedColumnName = "iddonante")
    @ManyToOne
    private Donante idDonante;
    @JoinColumn(name = "idProyecto", referencedColumnName = "idproyecto")
    @ManyToOne
    private Proyecto idProyecto;

    public Donacion() {
    }

    public Donacion(Integer idDonacion) {
        this.idDonacion = idDonacion;
    }

    public Donacion(Integer idDonacion, int valor) {
        this.idDonacion = idDonacion;
        this.valor = valor;
    }

    public Integer getIdDonacion() {
        return idDonacion;
    }

    public void setIdDonacion(Integer idDonacion) {
        this.idDonacion = idDonacion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Donante getIdDonante() {
        return idDonante;
    }

    public void setIdDonante(Donante idDonante) {
        this.idDonante = idDonante;
    }

    public Proyecto getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Proyecto idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDonacion != null ? idDonacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donacion)) {
            return false;
        }
        Donacion other = (Donacion) object;
        if ((this.idDonacion == null && other.idDonacion != null) || (this.idDonacion != null && !this.idDonacion.equals(other.idDonacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.balum.dto.Donacion[ idDonacion=" + idDonacion + " ]";
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balum.dto;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "emprendedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emprendedor.findAll", query = "SELECT e FROM Emprendedor e"),
    @NamedQuery(name = "Emprendedor.findByIdEmprendedor", query = "SELECT e FROM Emprendedor e WHERE e.idEmprendedor = :idEmprendedor"),
    @NamedQuery(name = "Emprendedor.findByNombre", query = "SELECT e FROM Emprendedor e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Emprendedor.findByCorreo", query = "SELECT e FROM Emprendedor e WHERE e.correo = :correo"),
    @NamedQuery(name = "Emprendedor.findByCedula", query = "SELECT e FROM Emprendedor e WHERE e.cedula = :cedula")})
public class Emprendedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEmprendedor")
    private Integer idEmprendedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 155)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cedula")
    private String cedula;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "responsable")
    private Collection<Proyecto> proyectoCollection;

    public Emprendedor() {
    }

    public Emprendedor(Integer idEmprendedor) {
        this.idEmprendedor = idEmprendedor;
    }

    public Emprendedor(Integer idEmprendedor, String nombre, String correo, String cedula) {
        this.idEmprendedor = idEmprendedor;
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
    }

    public Integer getIdEmprendedor() {
        return idEmprendedor;
    }

    public void setIdEmprendedor(Integer idEmprendedor) {
        this.idEmprendedor = idEmprendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @XmlTransient
    public Collection<Proyecto> getProyectoCollection() {
        return proyectoCollection;
    }

    public void setProyectoCollection(Collection<Proyecto> proyectoCollection) {
        this.proyectoCollection = proyectoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmprendedor != null ? idEmprendedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emprendedor)) {
            return false;
        }
        Emprendedor other = (Emprendedor) object;
        if ((this.idEmprendedor == null && other.idEmprendedor != null) || (this.idEmprendedor != null && !this.idEmprendedor.equals(other.idEmprendedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.balum.dto.Emprendedor[ idEmprendedor=" + idEmprendedor + " ]";
    }
    
}

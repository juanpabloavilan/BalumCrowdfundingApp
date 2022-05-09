/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balum.logica.ejb;

import com.mycompany.balum.dto.Donante;
import com.mycompany.balum.logica.interfaces.IServicioPerfilDonante;
import com.mycompany.balum.persistencia.AbstractFacade;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 *
 * @author javil
 */
@Stateless
public class ServicioPerfilDonante extends AbstractFacade<Donante> implements IServicioPerfilDonante {
    
    @PersistenceContext(unitName="balumPU")
    private EntityManager em;

    
    public ServicioPerfilDonante() {
        super(Donante.class);
    }
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @Override
    public void registrarPerfilDonante(Donante donante) {
        em.persist(donante);
    }

    @Override
    public void actualizarPerfilDonante(Donante donante) {
        em.merge(donante);
    }

    @Override
    public Donante obtenerPerfilDonante(int idDonante) {
        return em.find(Donante.class, idDonante);
    }

    @Override
    public List<Donante> getAllDonantes() {
        return super.findAll();
    }

    
    
}

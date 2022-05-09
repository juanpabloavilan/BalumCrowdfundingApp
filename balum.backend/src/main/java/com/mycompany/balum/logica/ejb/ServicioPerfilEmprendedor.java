/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balum.logica.ejb;


import com.mycompany.balum.dto.Emprendedor;
import com.mycompany.balum.logica.interfaces.IServicioPerfilEmprendedor;
import com.mycompany.balum.persistencia.AbstractFacade;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author javil
 */
@Stateless
public class ServicioPerfilEmprendedor extends AbstractFacade<Emprendedor> implements IServicioPerfilEmprendedor {
    
    @PersistenceContext(unitName="balumPU")
    private EntityManager em;

    

    public ServicioPerfilEmprendedor() {
        super(Emprendedor.class);
    }    
    
    @Override
    protected EntityManager getEntityManager() {
       return em;
    }

    @Override
    public void registrarPerfilEmprendedor(Emprendedor emprendedor) {
        em.persist(emprendedor);
    }

    @Override
    public void actualizarPerfilEmprendedor(Emprendedor emprendedor) {
        em.merge(emprendedor);
    }

    @Override
    public Emprendedor obtenerPerfilEmprendedor(int idEmprendedor) {
        Emprendedor emprendedor = em.find(Emprendedor.class, idEmprendedor);
        return emprendedor;
    }

    @Override
    public List<Emprendedor> getAllEmprendedores() {
        return super.findAll();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balum.logica.ejb;

import com.mycompany.balum.dto.Donacion;
import com.mycompany.balum.dto.Proyecto;
import com.mycompany.balum.logica.interfaces.IServicioDonar;
import com.mycompany.balum.persistencia.AbstractFacade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author javil
 */
@Stateless
public class ServicioDonar extends AbstractFacade<Donacion> implements IServicioDonar {
    
    @PersistenceContext(unitName="balumPU")
    private EntityManager em;

    public ServicioDonar() {
        super(Donacion.class);
    }    

    @Override
    protected EntityManager getEntityManager() {
       return em;
    }

    @Override
    public void donarDinero(int idDonante, int idProyecto, int monto) {
        Donacion donacion = new Donacion();
    }
    
}

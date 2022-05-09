/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balum.logica.ejb;

import com.mycompany.balum.dto.Proyecto;
import com.mycompany.balum.logica.interfaces.IServicioCRUDProyecto;
import com.mycompany.balum.persistencia.AbstractFacade;
import static java.rmi.server.LogStream.log;
import java.util.List;
import java.util.logging.Level;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

/**
 *
 * @author javil
 */
@Stateful
public class ServicioCRUDProyecto extends AbstractFacade<Proyecto> implements IServicioCRUDProyecto {
    
    @PersistenceContext(unitName="balumPU")
    private EntityManager em;

       
    public enum Estados {EN_PREPARACION, PUBLICADO, MONITOREO, CIERRE};
        
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServicioCRUDProyecto() {
        super(Proyecto.class);
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        //proyecto.setEstado(Estados.EN_PREPARACION.toString());
        try{
        em.persist(proyecto);
        }catch (ConstraintViolationException e) {        
            for (ConstraintViolation c :e.getConstraintViolations()){
                System.out.println(c.toString());
            }
        }
    }

    @Override
    public void actualizarProyecto(Proyecto proyecto) {
        em.merge(proyecto);
    }

    @Override
    public Proyecto obtenerProyecto(int idProyecto) {
        Proyecto proyecto = em.find(Proyecto.class, idProyecto);
        return proyecto;
    }

    @Override
    public void eliminarProyecto(int idProyecto) {
        em.remove(idProyecto);
    }

    @Override
    public List<Proyecto> getAllProyectos() {
        return super.findAll();
    }
    
    @Override
    public void postularProyectoCreado(int i) {
        Proyecto p = obtenerProyecto(i);
        p.setEstado(Estados.PUBLICADO.toString());
        actualizarProyecto(p);        
    }

    @Override
    public void cerrarProyecto(int i) {
        Proyecto p = obtenerProyecto(i);
        p.setEstado(Estados.CIERRE.toString());
        actualizarProyecto(p); 
    }
    
    
    
    
    
    
    
    
}

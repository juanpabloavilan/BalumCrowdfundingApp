/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balum.servicios;

import com.mycompany.balum.dto.Proyecto;
import com.mycompany.balum.logica.interfaces.IServicioCRUDProyecto;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author javil
 */
@Stateless
@Path("proyecto")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProyectoService {
    @EJB
    private IServicioCRUDProyecto proyectoEJB;
    
    @POST
    @Path("crearProyecto/")
    public void crearProyecto(Proyecto proyecto) {
        
        proyectoEJB.crearProyecto(proyecto);
    }

    @PUT
    @Path("actualizarProyecto/")
    public void actualizarProyecto(Proyecto proyecto) {
        proyectoEJB.actualizarProyecto(proyecto);
    }

    @GET
    @Path("obtenerProyecto/{id}")
    public Proyecto obtenerProyecto(@PathParam("id") int idProyecto) {
        return proyectoEJB.obtenerProyecto(idProyecto);
    }

    
    @GET
    @Path("getAllProyectos/") 
    public List<Proyecto> getAllProyectos() {
        return proyectoEJB.getAllProyectos();
    }
    
    @PUT
    @Path("postularProyectoCreado/{id}")
    public void postularProyectoCreado(@PathParam("id") int i) {
        proyectoEJB.postularProyectoCreado(i);
    }

    @PUT
    @Path("cerrarProyecto/{id}")
    public void cerrarProyecto(@PathParam("id") int i){
        proyectoEJB.cerrarProyecto(i);
    }
    
}

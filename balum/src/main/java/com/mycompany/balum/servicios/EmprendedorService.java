/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balum.servicios;

import com.mycompany.balum.dto.Emprendedor;
import com.mycompany.balum.logica.interfaces.IServicioPerfilEmprendedor;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author javil
 */
@Path("/emprendedor")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmprendedorService {
    @EJB
    private IServicioPerfilEmprendedor perfilEmprendedorEJB;
    
    @POST
    @Path("registrarPerfilEmprendedor/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void registrarPerfilEmprendedor(Emprendedor emprendedor){
        perfilEmprendedorEJB.registrarPerfilEmprendedor(emprendedor);
    }
    
    @PUT
    @Path("actualizarPerfilEmprendedor/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void actualizarPerfilEmprendedor(Emprendedor emprendedor){
        perfilEmprendedorEJB.actualizarPerfilEmprendedor(emprendedor);
    }
    
    @GET
    @Path("obtenerPerfilEmprendedor/{id}")
    public Emprendedor obtenerPerfilEmprendedor(@PathParam("id") int idEmprendedor){
        return perfilEmprendedorEJB.obtenerPerfilEmprendedor(idEmprendedor);
    }
    
    @GET
    @Path("getAllEmprendedores")
    public List<Emprendedor> getAllEmprendedores(){
        return perfilEmprendedorEJB.getAllEmprendedores();
    }
    
    
    
    
}

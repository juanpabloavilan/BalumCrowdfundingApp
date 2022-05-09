/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balum.servicios;

import com.mycompany.balum.dto.Donante;
import com.mycompany.balum.logica.interfaces.IServicioPerfilDonante;
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
@Path("/donante")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DonanteService {
    @EJB
    private IServicioPerfilDonante perfilDonanteEJB;
    
    @POST
    @Path("registrarPerfilDonante/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void registrarPerfilDonante(Donante donante){
        perfilDonanteEJB.registrarPerfilDonante(donante);
    }
    
    @PUT
    @Path("actualizarPerfilDonante/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void actualizarPerfilDonante(Donante donante){
        perfilDonanteEJB.actualizarPerfilDonante(donante);
    }
    
    @GET
    @Path("obtenerPerfilDonante/{id}")
    public Donante obtenerPerfilDonante(@PathParam("id")int idDonante){
        return perfilDonanteEJB.obtenerPerfilDonante(idDonante);
    }
    
    @GET
    @Path("getAllDonantes/")
    public List<Donante> getAllDonantes(){
        return perfilDonanteEJB.getAllDonantes();
    }
    
}

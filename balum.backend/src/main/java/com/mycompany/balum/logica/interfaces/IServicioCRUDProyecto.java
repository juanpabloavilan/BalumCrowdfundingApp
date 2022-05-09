/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balum.logica.interfaces;

import com.mycompany.balum.dto.Proyecto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author javil
 */
@Local
public interface IServicioCRUDProyecto {
    public void crearProyecto(Proyecto proyecto);
    public void actualizarProyecto(Proyecto proyecto);
    public Proyecto obtenerProyecto(int idProyecto);
    public void eliminarProyecto(int idProyecto);
    public List<Proyecto> getAllProyectos();
    public void postularProyectoCreado(int idProyecto);
    public void cerrarProyecto(int idProyecto);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.balum.logica.interfaces;

import com.mycompany.balum.dto.Donante;
import com.mycompany.balum.dto.Emprendedor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author javil
 */
@Local
public interface IServicioPerfilEmprendedor {
    public void registrarPerfilEmprendedor(Emprendedor emprendedor);
    public void actualizarPerfilEmprendedor(Emprendedor emprendedor);
    public Emprendedor obtenerPerfilEmprendedor(int idEmprendedor);
    public List<Emprendedor> getAllEmprendedores();
}

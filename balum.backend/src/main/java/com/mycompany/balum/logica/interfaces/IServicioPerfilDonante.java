/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.balum.logica.interfaces;

import com.mycompany.balum.dto.Donante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author javil
 */
@Local
public interface IServicioPerfilDonante {
    public void registrarPerfilDonante(Donante donante);
    public void actualizarPerfilDonante(Donante donante);
    public Donante obtenerPerfilDonante(int idDonante);
    public List<Donante> getAllDonantes();
}

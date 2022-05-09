/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.balum.logica.interfaces;

import javax.ejb.Local;

/**
 *
 * @author javil
 */
@Local
public interface IServicioDonar {
    public void donarDinero(int idDonante, int idProyecto, int monto);
}

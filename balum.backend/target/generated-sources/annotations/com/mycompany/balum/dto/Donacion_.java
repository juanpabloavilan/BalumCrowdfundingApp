package com.mycompany.balum.dto;

import com.mycompany.balum.dto.Donante;
import com.mycompany.balum.dto.Proyecto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-05-09T14:37:49")
@StaticMetamodel(Donacion.class)
public class Donacion_ { 

    public static volatile SingularAttribute<Donacion, Date> fecha;
    public static volatile SingularAttribute<Donacion, Proyecto> idProyecto;
    public static volatile SingularAttribute<Donacion, Donante> idDonante;
    public static volatile SingularAttribute<Donacion, Integer> idDonacion;
    public static volatile SingularAttribute<Donacion, Integer> valor;

}
package com.mycompany.balum.dto;

import com.mycompany.balum.dto.Donacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-05-09T14:37:49")
@StaticMetamodel(Donante.class)
public class Donante_ { 

    public static volatile SingularAttribute<Donante, String> cedula;
    public static volatile SingularAttribute<Donante, String> correo;
    public static volatile CollectionAttribute<Donante, Donacion> donacionCollection;
    public static volatile SingularAttribute<Donante, Integer> iddonante;
    public static volatile SingularAttribute<Donante, String> nombre;

}
package com.mycompany.balum.dto;

import com.mycompany.balum.dto.Proyecto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-05-09T14:37:49")
@StaticMetamodel(Emprendedor.class)
public class Emprendedor_ { 

    public static volatile SingularAttribute<Emprendedor, Integer> idEmprendedor;
    public static volatile SingularAttribute<Emprendedor, String> cedula;
    public static volatile SingularAttribute<Emprendedor, String> correo;
    public static volatile CollectionAttribute<Emprendedor, Proyecto> proyectoCollection;
    public static volatile SingularAttribute<Emprendedor, String> nombre;

}
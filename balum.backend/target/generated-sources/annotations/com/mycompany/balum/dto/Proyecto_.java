package com.mycompany.balum.dto;

import com.mycompany.balum.dto.Emprendedor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-05-09T14:37:49")
@StaticMetamodel(Proyecto.class)
public class Proyecto_ { 

    public static volatile SingularAttribute<Proyecto, String> descripcion;
    public static volatile SingularAttribute<Proyecto, String> estado;
    public static volatile SingularAttribute<Proyecto, Emprendedor> responsable;
    public static volatile SingularAttribute<Proyecto, Date> fechaInicio;
    public static volatile SingularAttribute<Proyecto, Integer> idproyecto;
    public static volatile SingularAttribute<Proyecto, Integer> valorObjetivo;
    public static volatile SingularAttribute<Proyecto, Integer> valorActual;
    public static volatile SingularAttribute<Proyecto, Date> fechaFinal;
    public static volatile SingularAttribute<Proyecto, String> tipoProyecto;

}
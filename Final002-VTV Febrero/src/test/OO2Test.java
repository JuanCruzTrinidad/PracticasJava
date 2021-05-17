package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

import org.hibernate.HibernateException;

import datos.Automotor;
import datos.Control;
import datos.Inspeccion;
import datos.Medicion;
import datos.Observacion;
import negocio.AutomotorABM;
import negocio.ControlABM;
import negocio.InspeccionABM;

public class OO2Test {
	public static void main(String[] args) {
		
		AutomotorABM abmAutomotor = new AutomotorABM();
		ControlABM  abmControl = new ControlABM();
		InspeccionABM abmInspeccion = new InspeccionABM();
		
		//CU1 - Traer el automóvil con dominio 'OOJ345'
		Automotor a = abmAutomotor.traerAutomotor("OOJ345");
		System.out.println("Ejercicio 1");
		System.out.println(a);
		
		//CU2 - Traer las inspecciones del automóvil con dominio 'XED456'
		Automotor a2 = abmAutomotor.traerAutomotor("XED456");
		List<Inspeccion> lista = abmInspeccion.traerInspeccion(a2);
		System.out.println("Ejercicio 2");
		for ( Inspeccion inspeccion : lista) {
			System.out.println(inspeccion);
		}
		
		//CU3 - Traer la inspección con ID 3
		int id = 3;
		Inspeccion i = abmInspeccion.traerInspeccion(id);
		System.out.println("Ejercicio 3");
		System.out.println(i);
		
		//CU4 - Traer observación de la inspección con ID 1
		int idInspeccion1 = 1;
		Inspeccion inspeccion1 = abmInspeccion.traerInspeccion(idInspeccion1);
		Observacion o = (Observacion) abmControl.traerObservacion(inspeccion1); // hay que traer todas las propiedades del control?
		System.out.println("Ejercicio 4");
		System.out.println(o);
		
		//CU5 - Traer medición de la inspección con ID 2
		int idInspeccion2 = 2;
		Inspeccion inspeccion2 = abmInspeccion.traerInspeccion(idInspeccion2);
		Medicion o2 = (Medicion) abmControl.traerMedicion(inspeccion2); // hay que traer todas las propiedades del control?
		System.out.println("Ejercicio 5");
		System.out.println(o2);
		
		//CU6 - Traer inspecciones del 15/01/2021
		LocalDate date =  LocalDate.of(2021, 01, 15);
		List<Inspeccion> lista2 = abmInspeccion.traerInspeccion(date);
		System.out.println("Ejercicio 6");
		for ( Inspeccion inspeccion : lista2) {
			System.out.println(inspeccion);
		}
		
		//CU7 - Traer inspecciones del 15/01/2021 con estadoInspeccion 'Rechazado'
		List<Inspeccion> lista3 = abmInspeccion.traerInspeccion(date, "Desaprobado");
		System.out.println("Ejercicio 7");
		for ( Inspeccion inspeccion : lista3) {
			System.out.println(inspeccion);
		}
		
		//CU8 - Traer inspecciones realizadas el 15/01/2021 a las 15:00hs
		LocalTime time = LocalTime.of(15, 0, 0);
		List<Inspeccion> lista4 = abmInspeccion.traerInspeccion(date, time);
		System.out.println(date + "" + time + "" + lista4.size());
		System.out.println("Ejercicio 8");
		for ( Inspeccion inspeccion : lista4) {
			System.out.println(inspeccion);
		}
	}
}

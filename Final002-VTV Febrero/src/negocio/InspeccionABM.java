package negocio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import dao.InspeccionDao;
import datos.Automotor;
import datos.Inspeccion;

public class InspeccionABM {

	InspeccionDao dao = new InspeccionDao();
	
	public List<Inspeccion> traerInspeccion(Automotor automotor) {
		return dao.traerInspeccion(automotor);
	}
	
	public Inspeccion traerInspeccion (int idInspeccion) {
		return dao.traerInspeccion(idInspeccion);
	}
	
	public List<Inspeccion> traerInspeccion(LocalDate date) {
		return dao.traerInspeccion(date);
	}
	
	public List<Inspeccion> traerInspeccion(LocalDate date, String estado) {
		return dao.traerInspeccion(date, estado);
	}
	
	public List<Inspeccion> traerInspeccion(LocalDate date, LocalTime time) {
		return dao.traerInspeccion(date, time);
	}
}

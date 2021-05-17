package negocio;

import dao.ControlDao;
import datos.Control;
import datos.Inspeccion;
import datos.Medicion;
import datos.Observacion;

public class ControlABM {

	ControlDao dao = new ControlDao();
	
	public Control traerObservacion (Inspeccion inspeccion) {
		return dao.traerObservacion(inspeccion);
	}
	
	public Control traerMedicion (Inspeccion inspeccion) {
		return dao.traerMedicion(inspeccion);
	}
}

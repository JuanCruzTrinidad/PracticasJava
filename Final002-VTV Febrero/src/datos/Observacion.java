package datos;

public class Observacion extends Control {

	private int idObservacion;
	private  int legajoInspector;
	private String observacion;
	
	public Observacion() {}
	
	public int getIdObservacion() {
		return idObservacion;
	}
	protected void setIdObservacion(int idObservacion) {
		this.idObservacion = idObservacion;
	}
	public int getLegajoInspector() {
		return legajoInspector;
	}
	public void setLegajoInspector(int legajoInspector) {
		this.legajoInspector = legajoInspector;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Override
	public String toString() {
		return "Observacion [idObservacion=" + this.getIdControl() + ", legajoInspector=" + legajoInspector + ", observacion="
				+ observacion + "]";
	}
	
	
	
}

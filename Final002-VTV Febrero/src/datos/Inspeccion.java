package datos;

import java.time.LocalDate;
import java.util.Set;

public class Inspeccion {

	private int idInspeccion;
	private LocalDate fecha;
	private String estado;
	private Automotor automotor;
	private Set<Control> controles;
	
	public Inspeccion() {}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getIdInspeccion() {
		return idInspeccion;
	}
	protected void  setIdInspeccion(int idInspeccion) {
		this.idInspeccion = idInspeccion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Automotor getAutomotor() {
		return automotor;
	}
	public void setAutomotor(Automotor automotor) {
		this.automotor = automotor;
	}
	public Set<Control> getControles() {
		return controles;
	}
	public void setControles(Set<Control> controles) {
		this.controles = controles;
	}

	@Override
	public String toString() {
		return "Inspeccion [idInspeccion=" + idInspeccion + ", fecha=" + fecha + ", estado=" + estado + "]";
	}
	
	
}

package datos;

import java.time.LocalTime;

public class Control {


	private int idControl;
	private String tipo;
	private String estado;
	private LocalTime hora;
	private Inspeccion inspeccion;
	
	public Control() {}
	
	public int getIdControl() {
		return idControl;
	}
	public void setIdControl(int idControl) {
		this.idControl = idControl;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public Inspeccion getInspeccion() {
		return inspeccion;
	}
	public void setInspeccion(Inspeccion inspeccion) {
		this.inspeccion = inspeccion;
	}

	@Override
	public String toString() {
		return "Control [idControl=" + idControl + ", tipo=" + tipo + ", estado=" + estado + ", hora=" + hora
				+ ", inspeccion=" + inspeccion + "]";
	}
	
	
}

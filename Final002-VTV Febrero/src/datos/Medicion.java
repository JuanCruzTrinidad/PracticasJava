package datos;

public class Medicion extends Control {

	private int	idMedicion;
	private double valor;
	
	public Medicion() {}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getIdMedicion() {
		return idMedicion;
	}
	protected void setIdMedicion(int idMedicion) {
		this.idMedicion = idMedicion;
	}

	@Override
	public String toString() {
		return "Medicion [idMedicion=" + this.getIdControl() + ", valor=" + valor + "]";
	}
	
	
	
}

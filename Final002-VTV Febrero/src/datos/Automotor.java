package datos;

public class Automotor {
	
	private int idAutomotor;
	private String dominio;
	private int modelo;
	private String marca;
	
	public Automotor() { }
	
	public Automotor(String dominio, int modelo, String marca) {
		this.dominio = dominio;
		this.modelo = modelo;
		this.marca = marca;
	}

	public int getIdAutomotor() {
		return idAutomotor;
	}

	public void setIdAutomotor(int idAutomotor) {
		this.idAutomotor = idAutomotor;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	};
	
	@Override
	public String toString() {
		return "Automotor [idAutomotor=" + idAutomotor + ", dominio=" + dominio + ", modelo=" + modelo + ", marca="
				+ marca + "]";
	}
	

}

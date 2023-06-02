package org.example;
public class Ciudad {
	private String pais;
	private String longitud;
	private String latitud;

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getLongitud() {
		return this.longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getLatitud() {
		return this.latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public Ciudad(String pais, String longitud, String latitud) {

		this.pais=pais;
		this.longitud=longitud;
		this.latitud=latitud;
		throw new UnsupportedOperationException();
	}
}
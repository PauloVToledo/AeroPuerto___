package org.example;
public class Pasajero {
	private String nombre;
	private int edad;
	private String rut;
	private PasaporteSanitario_ pasaporteSanitario;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Pasajero(String nombre, int edad, String rut) {
		throw new UnsupportedOperationException();
	}
}
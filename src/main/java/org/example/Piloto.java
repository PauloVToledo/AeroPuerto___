package org.example;
public class Piloto {
	private String nombre;
	private int edad;
	private int idPiloto;
	public Vuelo unnamed_Vuelo_;

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

	public int getIdPiloto() {
		return this.idPiloto;
	}

	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}

	public Piloto(String nombre, int edad, int idPiloto) {
		this.nombre=nombre;
		this.edad=edad;
		this.idPiloto=idPiloto;
		throw new UnsupportedOperationException();
	}
}
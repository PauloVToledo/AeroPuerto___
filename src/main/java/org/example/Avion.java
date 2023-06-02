package org.example;
import java.util.ArrayList;

public class Avion {
	private int anho;
	private String nombre;
	private double kmRecorrido;
	private Aeropuerto aeropuerto;
	private ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

	public int getAnho() {
		return this.anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getKmRecorrido() {
		return this.kmRecorrido;
	}

	public void setKmRecorrido(double kmRecorrido) {
		this.kmRecorrido = kmRecorrido;
	}

	public Avion(int anho, String nombre, double kmRecorrido) {

		this.nombre = nombre;
		this.anho = anho;
		this.kmRecorrido = kmRecorrido;
		this.vuelos = new ArrayList<Vuelo>();
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", año: " + anho + ",KmRecorridos: " + kmRecorrido;
	}

}
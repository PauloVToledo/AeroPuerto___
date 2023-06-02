package org.example;
import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
	private Date fecha;
	private Date hora;
	private Avion avion;
	private Ciudad cuidad_Destino;
	private Ciudad cuidad_Origen;
	private ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	public ArrayList<Piloto> unnamed_Piloto_ = new ArrayList<Piloto>();

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return this.hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Ciudad getCiudad1() {
		throw new UnsupportedOperationException();
	}

	public Ciudad getCiudad2() {
		throw new UnsupportedOperationException();
	}

	public Vuelo(Ciudad ciudad1, Ciudad ciudad2, Date hora, Date fecha) {

		this.fecha = fecha;
		this.pasajeros=new ArrayList<Pasajero>();
		this.hora=hora;


		throw new UnsupportedOperationException();
	}
}
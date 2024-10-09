package edu.pe.cibertec.model;

public class Ciudad {

	private int codCiudad;
	private String nomCiudad;
	private String nomTerrapuerto;
	
	
	public Ciudad() {
		super();
	}


	public Ciudad(int codCiudad, String nomCiudad, String nomTerrapuerto) {
		super();
		this.codCiudad = codCiudad;
		this.nomCiudad = nomCiudad;
		this.nomTerrapuerto = nomTerrapuerto;
	}


	public int getCodCiudad() {
		return codCiudad;
	}


	public void setCodCiudad(int codCiudad) {
		this.codCiudad = codCiudad;
	}


	public String getNomCiudad() {
		return nomCiudad;
	}


	public void setNomCiudad(String nomCiudad) {
		this.nomCiudad = nomCiudad;
	}


	public String getNomTerrapuerto() {
		return nomTerrapuerto;
	}


	public void setNomTerrapuerto(String nomTerrapuerto) {
		this.nomTerrapuerto = nomTerrapuerto;
	}
	
	
	
}

package edu.uacm.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name="aeropuerto")
@Entity
public class Aeropuerto {
	@Id
	@NotNull
	private int idaeropuerto;
	@NotNull
	private String nombreaeropuerto;
	@NotNull
	private String ciudad;
	@NotNull
	private String pais;
	
	public int getIdaeropuerto() {
		return idaeropuerto;
	}
	public void setIdaeropuerto(int idaeropuerto) {
		this.idaeropuerto = idaeropuerto;
	}
	public String getNombreaeropuerto() {
		return nombreaeropuerto;
	}
	public void setNombreaeropuerto(String nombreaeropuerto) {
		this.nombreaeropuerto = nombreaeropuerto;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	

}

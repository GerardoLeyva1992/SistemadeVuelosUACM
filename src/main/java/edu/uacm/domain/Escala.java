package edu.uacm.domain;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name="escala")
@Entity
public class Escala {
	@Id
	@NotNull
	private int idescala;
	@NotNull
	private Timestamp horasalida;
	@NotNull
	private Timestamp horallegada;
	@NotNull
	private int aeropuerto_idaeropuerto;
	@NotNull
	private int aeropuerto_idaeropuerto2;
	@NotNull
	private int vuelo_idvuelo;
	public int getIdescala() {
		return idescala;
	}
	public void setIdescala(int idescala) {
		this.idescala = idescala;
	}
	public Timestamp getHorasalida() {
		return horasalida;
	}
	public void setHorasalida(Timestamp horasalida) {
		this.horasalida = horasalida;
	}
	public Timestamp getHorallegada() {
		return horallegada;
	}
	public void setHorallegada(Timestamp horallegada) {
		this.horallegada = horallegada;
	}
	public int getAeropuerto_idaeropuerto() {
		return aeropuerto_idaeropuerto;
	}
	public void setAeropuerto_idaeropuerto(int aeropuerto_idaeropuerto) {
		this.aeropuerto_idaeropuerto = aeropuerto_idaeropuerto;
	}
	public int getAeropuerto_idaeropuerto2() {
		return aeropuerto_idaeropuerto2;
	}
	public void setAeropuerto_idaeropuerto2(int aeropuerto_idaeropuerto2) {
		this.aeropuerto_idaeropuerto2 = aeropuerto_idaeropuerto2;
	}
	public int getVuelo_idvuelo() {
		return vuelo_idvuelo;
	}
	public void setVuelo_idvuelo(int vuelo_idvuelo) {
		this.vuelo_idvuelo = vuelo_idvuelo;
	}



}

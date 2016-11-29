package edu.uacm.domain;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Table(name="vuelo")
@Entity
public class Vuelo {
	@Id
	@NotNull
	private int idvuelo;
	@NotNull
	private Timestamp horasalida;
	@NotNull
	private Timestamp horallegada;
	@NotNull
	private int aeropuerto_idaeropuerto;
	@NotNull
	private int aeropuerto_idaeropuerto2;
	private int avion_idavion;
	public int getIdvuelo() {
		return idvuelo;
	}
	public void setIdvuelo(int idvuelo) {
		this.idvuelo = idvuelo;
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
	public int getAvion_idavion() {
		return avion_idavion;
	}
	public void setAvion_idavion(int avion_idavion) {
		this.avion_idavion = avion_idavion;
	}
}

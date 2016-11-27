package edu.uacm.domain;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Table(name="pasajero")
@Entity
public class Pasajero {
@Id
@NotNull
private int idpasajero;
@NotNull
private String nombre;
@NotNull
private String apellidopaterno;

private String apellidomaterno;
@NotNull
private String fechanacimiento;
@NotNull
private String nacionalidad;
@NotNull
private int vuelo_idvuelo;
public int getIdpasajero() {
	return idpasajero;
}
public void setIdpasajero(int idpasajero) {
	this.idpasajero = idpasajero;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidopaterno() {
	return apellidopaterno;
}
public void setApellidopaterno(String apellidopaterno) {
	this.apellidopaterno = apellidopaterno;
}
public String getApellidomaterno() {
	return apellidomaterno;
}
public void setApellidomaterno(String apellidomaterno) {
	this.apellidomaterno = apellidomaterno;
}
public String getFechanacimiento() {
	return fechanacimiento;
}
public void setFechanacimiento(String fechanacimiento) {
	this.fechanacimiento = fechanacimiento;
}
public String getNacionalidad() {
	return nacionalidad;
}
public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}
public int getVuelo_idvuelo() {
	return vuelo_idvuelo;
}
public void setVuelo_idvuelo(int vuelo_idvuelo) {
	this.vuelo_idvuelo = vuelo_idvuelo;
}

}

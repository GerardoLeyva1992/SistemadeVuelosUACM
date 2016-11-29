package edu.uacm.domain;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Table(name="empleado")
@Entity
public class Empleado {
	@Id
	@NotNull
	private int codigo;
	@NotNull
	private String nombre;
	@NotNull
	private String apellidopaterno;
	private String apellidomaterno;
	@NotNull
	private String nacionalidad;
	@NotNull
	private String fechanacimiento;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int i) {
		this.codigo = i;
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
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	
	
}

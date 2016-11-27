package edu.uacm.domain;




import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name="tripulacion")
@Entity @IdClass(Tripulacion.class)
public class Tripulacion implements Serializable {
	@Id
	private int vuelo_idvuelo;
	@Id
	private int empleado_codigo;
	@NotNull
	private String puesto;

	
	public int getVuelo_idvuelo() {
		return vuelo_idvuelo;
	}
	public void setVuelo_idvuelo(int vuelo_idvuelo) {
		this.vuelo_idvuelo = vuelo_idvuelo;
	}
	public int getEmpleado_codigo() {
		return empleado_codigo;
	}
	public void setEmpleado_codigo(int empleado_codigo) {
		this.empleado_codigo = empleado_codigo;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	

	
	

}

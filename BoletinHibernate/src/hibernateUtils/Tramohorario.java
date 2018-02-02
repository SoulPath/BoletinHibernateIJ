package hibernateUtils;
// Generated 01-feb-2018 12:24:01 by Hibernate Tools 5.2.8.Final

import java.util.Date;

/**
 * Tramohorario generated by hbm2java
 */
public class Tramohorario implements java.io.Serializable {

	private String codTramo;
	private Date horaInicio;
	private Date horaFin;
	private String dia;

	public Tramohorario() {
	}

	public Tramohorario(String codTramo) {
		this.codTramo = codTramo;
	}

	public Tramohorario(String codTramo, Date horaInicio, Date horaFin, String dia) {
		this.codTramo = codTramo;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.dia = dia;
	}

	public String getCodTramo() {
		return this.codTramo;
	}

	public void setCodTramo(String codTramo) {
		this.codTramo = codTramo;
	}

	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	public String getDia() {
		return this.dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

}

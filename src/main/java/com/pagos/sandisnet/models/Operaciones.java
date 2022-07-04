package com.pagos.sandisnet.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operaciones")
public class Operaciones {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, name = "cod_operacion")
	private int codOperacion;
	
	@Column(name = "imp_operacion")
	private double impOperacion;
	
	@Column(name = "des_operacion")
	private String desOperacion;
	
	@Column(name = "fec_operacion")
	private Date fecOperacion;
	
	@Column(name = "tipo_operacion")
	private String tipoOperacion;

	public Operaciones() {
		super();
	}

	public Operaciones(int codOperacion, double impOperacion, String desOperacion, Date fecOperacion,
			String tipoOperacion) {
		super();
		this.codOperacion = codOperacion;
		this.impOperacion = impOperacion;
		this.desOperacion = desOperacion;
		this.fecOperacion = fecOperacion;
		this.tipoOperacion = tipoOperacion;
	}

	public int getCodOperacion() {
		return codOperacion;
	}

	public void setCodOperacion(int codOperacion) {
		this.codOperacion = codOperacion;
	}

	public double getImpOperacion() {
		return impOperacion;
	}

	public void setImpOperacion(double impOperacion) {
		this.impOperacion = impOperacion;
	}

	public String getDesOperacion() {
		return desOperacion;
	}

	public void setDesOperacion(String desOperacion) {
		this.desOperacion = desOperacion;
	}

	public Date getFecOperacion() {
		return fecOperacion;
	}

	public void setFecOperacion(Date fecOperacion) {
		this.fecOperacion = fecOperacion;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}
}
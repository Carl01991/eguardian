package com.umg.usageapp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name ="evento")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_evento")
	private int idEvento; 
	@Column (name = "nombre")
	private String nombre;
	@Column (name = "fechaInicio")
	private Date fechaInicio;
	@Column (name = "duracion")
	private String duracion;
	@Column (name = "fechaFin")
	private Date fechaFin;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_estatus")
	@JsonBackReference
	private Estatus estatus;
	
	
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Estatus getEstatus() {
		return estatus;
	}
	public void setEstatus(Estatus estatus) {
		this.estatus = estatus;
	}
	public Evento(int idEvento, String nombre, Date fechaInicio, String duracion, Date fechaFin, Estatus estatus) {
		super();
		this.idEvento = idEvento;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.duracion = duracion;
		this.fechaFin = fechaFin;
		this.estatus = estatus;
	}
	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}

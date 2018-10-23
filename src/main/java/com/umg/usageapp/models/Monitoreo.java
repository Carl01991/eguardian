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
@Table(name ="monitoreo")
public class Monitoreo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_generales")
	private int idMonitoreo;
	@Column (name = "fecha")
	private Date fecha;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_aplicacion")
	@JsonBackReference
	private Aplicacion aplicacion;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_accion")
	@JsonBackReference
	private Accion accion;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_evento")
	@JsonBackReference
	private Evento evento;
	
	
	
	public int getIdMonitoreo() {
		return idMonitoreo;
	}
	public void setIdMonitoreo(int idMonitoreo) {
		this.idMonitoreo = idMonitoreo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Aplicacion getAplicacion() {
		return aplicacion;
	}
	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}
	public Accion getAccion() {
		return accion;
	}
	public void setAccion(Accion accion) {
		this.accion = accion;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public Monitoreo(int idMonitoreo, Date fecha, Aplicacion aplicacion, Accion accion, Evento evento) {
		super();
		this.idMonitoreo = idMonitoreo;
		this.fecha = fecha;
		this.aplicacion = aplicacion;
		this.accion = accion;
		this.evento = evento;
	}
	public Monitoreo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

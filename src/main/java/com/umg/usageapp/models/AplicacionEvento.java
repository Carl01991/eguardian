package com.umg.usageapp.models;

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
@Table(name ="aplicacion_evento")
public class AplicacionEvento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_aplicacion_evento")
	private int idAplicacionEvento;
	@Column (name = "id_accion_evento")
	private int idAccionEvento;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_aplicacion")
	@JsonBackReference
	private Aplicacion aplicacion;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_evento")
	@JsonBackReference
	private Evento evento;
	public int getIdAplicacionEvento() {
		return idAplicacionEvento;
	}
	public void setIdAplicacionEvento(int idAplicacionEvento) {
		this.idAplicacionEvento = idAplicacionEvento;
	}
	public int getIdAccionEvento() {
		return idAccionEvento;
	}
	public void setIdAccionEvento(int idAccionEvento) {
		this.idAccionEvento = idAccionEvento;
	}
	public Aplicacion getAplicacion() {
		return aplicacion;
	}
	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}

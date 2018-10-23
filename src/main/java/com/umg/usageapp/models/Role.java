package com.umg.usageapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="role")
public class Role {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_role")
	private int idRole;
	@Column (name = "nombre")
	private String nombre;
	public int getIdRole() {
		return idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Role(int idRole, String nombre) {
		super();
		this.idRole = idRole;
		this.nombre = nombre;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

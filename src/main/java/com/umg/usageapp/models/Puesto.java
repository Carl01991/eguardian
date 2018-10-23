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

import org.springframework.aop.aspectj.DeclareParentsAdvisor;

import com.fasterxml.jackson.annotation.JsonBackReference;

import antlr.debug.DebuggingParser;

@Entity
@Table(name ="puesto")
public class Puesto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_puesto")
	private int idPuesto;
	@Column (name = "nombre")
	private String nombre;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario")
	@JsonBackReference
	private Usuarios usuarios;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_empresa")
	@JsonBackReference
	private Empresa empresa;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_departamento")
	@JsonBackReference
	private Departamento departamento;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_role")
	@JsonBackReference
	private Role role;
	
	
	public int getIdPuesto() {
		return idPuesto;
	}
	public void setIdPuesto(int idPuesto) {
		this.idPuesto = idPuesto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Usuarios getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Puesto(int idPuesto, String nombre, Usuarios usuarios, Empresa empresa, Departamento departamento,
			Role role) {
		super();
		this.idPuesto = idPuesto;
		this.nombre = nombre;
		this.usuarios = usuarios;
		this.empresa = empresa;
		this.departamento = departamento;
		this.role = role;
	}
	public Puesto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

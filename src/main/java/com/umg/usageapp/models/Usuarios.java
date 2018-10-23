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
@Table(name ="usuarios")
public class Usuarios {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_usuarios")
	private int idUsuario;
	@Column (name = "nombre")
	private String nombre;
	@Column (name = "apellidos")
	private String apellidos;
	@Column (name = "cargo")
	private String cargo;
	@Column (name = "fechaNacimiento")
	private Date fechaNacimiento;
	@Column (name = "fechaConstratacion")
	private Date fechaConstratacion;
	@Column (name = "telefono")
	private String telefono;
	@Column (name = "contrasenia")
	private String contrasenia;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_estatus")
	@JsonBackReference
	private Estatus estatus;
	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Date getFechaConstratacion() {
		return fechaConstratacion;
	}
	public void setFechaConstratacion(Date fechaConstratacion) {
		this.fechaConstratacion = fechaConstratacion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public Usuarios(int idUsuario, String nombre, String apellidos, String cargo, Date fechaNacimiento,
			Date fechaConstratacion, String telefono, String contrasenia, Estatus estatus) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cargo = cargo;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaConstratacion = fechaConstratacion;
		this.telefono = telefono;
		this.contrasenia = contrasenia;
		this.estatus = estatus;
	}
	public Usuarios() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}

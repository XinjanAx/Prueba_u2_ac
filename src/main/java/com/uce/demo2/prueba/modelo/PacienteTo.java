package com.uce.demo2.prueba.modelo;

import java.time.LocalDateTime;

public class PacienteTo {
	
	private String cedula;
	private String nombre;
	private LocalDateTime fechaNacimiento;
	private String genero;
	
	public PacienteTo() {
	}

	public PacienteTo(String cedula, String nombre, LocalDateTime fechaNacimiento, String genero) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "\nPacienteTO cedula:" + cedula + ", " + nombre + ", fecha de Nacimiento: " + fechaNacimiento
				+ ", genero: " + genero;
	}

//set get
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}

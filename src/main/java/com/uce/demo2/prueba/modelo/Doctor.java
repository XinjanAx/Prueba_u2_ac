package com.uce.demo2.prueba.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	
	@Id
	@Column(name = "doc_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doc_seq_id")
	@SequenceGenerator(name = "doc_seq_id", sequenceName = "doc_seq_id", allocationSize = 1)
	private Integer id;
	
	@Column(name = "doc_cedula")
	private String cedula;
	
	@Column(name = "doc_nombre")
	private String nombre;
	
	@Column(name = "doc_apellido")
	private String apellido;
	
	@Column(name = "doc_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	
	@Column(name = "doc_numero_consultorio")
	private String numeroConsultorio;
	
	@Column(name = "doc_codigo_senecyt")
	private String cogidoSenecyt;
	
	@Column(name = "doc_genero")
	private String genero;
	
	@OneToMany(mappedBy = "doctor")
	private List<CitaMedica> citaMedicas;

	
// get set 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNumeroConsultorio() {
		return numeroConsultorio;
	}

	public void setNumeroConsultorio(String numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}

	public String getCogidoSenecyt() {
		return cogidoSenecyt;
	}

	public void setCogidoSenecyt(String cogidoSenecyt) {
		this.cogidoSenecyt = cogidoSenecyt;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<CitaMedica> getCitaMedicas() {
		return citaMedicas;
	}

	public void setCitaMedicas(List<CitaMedica> citaMedicas) {
		this.citaMedicas = citaMedicas;
	}	
}

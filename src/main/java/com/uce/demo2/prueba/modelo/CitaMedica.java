package com.uce.demo2.prueba.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cita_medica")
public class CitaMedica {

	
	@Id
	@Column(name = "cm_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cm_seq_id")
	@SequenceGenerator(name = "cm_seq_id", sequenceName = "cm_seq_id", allocationSize = 1)
	private Integer id;
	
	@Column(name = "cm_numero")
	private String numero;
	
	@Column(name = "cm_fecha_cita")
	private LocalDateTime fechaCita;
	
	@Column(name = "cm_valor_cita")
	private BigDecimal valorCita;
	
	@Column(name = "cm_lugar")
	private String lugar;
	
	@Column(name = "cm_diagnostico")
	private String diagnostico;
	
	@Column(name = "cm_receta")
	private String receta;
	
	@Column(name = "cm_prox_cita")
	private LocalDateTime fechaProximaCita;
	
	@ManyToOne
	@JoinColumn(name = "cm_id_paciente")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "cm_id_doctor")
	private Doctor doctor;
	
	
//set get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public BigDecimal getValorCita() {
		return valorCita;
	}

	public void setValorCita(BigDecimal valorCita) {
		this.valorCita = valorCita;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}

	public LocalDateTime getFechaProximaCita() {
		return fechaProximaCita;
	}

	public void setFechaProximaCita(LocalDateTime fechaProximaCita) {
		this.fechaProximaCita = fechaProximaCita;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}	
}

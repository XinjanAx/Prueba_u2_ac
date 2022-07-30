package com.uce.demo2.prueba.repository;

import java.time.LocalDateTime;

import com.uce.demo2.prueba.modelo.Paciente;

public interface IPacienteRepository {

	public void insertarPaciente(Paciente paciente);

	public Paciente buscarPaciente(Integer id);

	public void actualizarPaciente(Paciente paciente);

	public void borrarPaciente(Integer id);

	public Paciente buscarPacientePorCedula(String cedula);
	
	public void reportePaciente(LocalDateTime fecha, String genero);

}

package com.uce.demo2.prueba.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.demo2.prueba.modelo.Paciente;
import com.uce.demo2.prueba.modelo.PacienteTo;

public interface IPacienteService {

	public void insertarPaciente(Paciente paciente);

	public Paciente buscarPaciente(Integer id);

	public void actualizarPaciente(Paciente paciente);

	public void borrarPaciente(Integer id);

	public Paciente buscarPacientePorCedula(String cedula);
	
	public List<PacienteTo> reportePaciente(LocalDateTime fecha, String genero);

}

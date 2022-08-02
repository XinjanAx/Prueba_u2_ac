package com.uce.demo2.prueba.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.prueba.modelo.Paciente;
import com.uce.demo2.prueba.modelo.PacienteTo;
import com.uce.demo2.prueba.repository.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepository iPacienteRepository;
	@Override
	public void insertarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.insertarPaciente(paciente);
	}

	@Override
	public Paciente buscarPaciente(Integer id) {
		// TODO Auto-generated method stub
		return this.iPacienteRepository.buscarPaciente(id);
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.actualizarPaciente(paciente);
	}

	@Override
	public void borrarPaciente(Integer id) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.borrarPaciente(id);
	}

	@Override
	public Paciente buscarPacientePorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iPacienteRepository.buscarPacientePorCedula(cedula);
	}

	@Override
	public List<PacienteTo> reportePaciente(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		return this.iPacienteRepository.reportePaciente(fecha, genero);
	}

}

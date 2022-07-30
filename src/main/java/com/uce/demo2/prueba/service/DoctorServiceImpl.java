package com.uce.demo2.prueba.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.prueba.modelo.Doctor;
import com.uce.demo2.prueba.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService{

	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	
	@Autowired
	private IDoctorRepository doctorRepository;
	
	@Override
	public void insertarDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		Log.info("Conectado a la Base de Datos...");
		this.doctorRepository.insertarDoctor(doctor);
	}

	@Override
	public Doctor buscarDoctor(Integer id) {
		// TODO Auto-generated method stub
		Log.info("Conectado a la Base de Datos...");
		return this.doctorRepository.buscarDoctor(id);
	}

	@Override
	public void actualizarDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		Log.info("Conectado a la Base de Datos...");
		this.doctorRepository.actualizarDoctor(doctor);
	}

	@Override
	public void eliminarDoctor(Integer id) {
		// TODO Auto-generated method stub
		Log.info("Conectado a la Base de Datos...");
		this.doctorRepository.eliminarDoctor(id);
	}

	@Override
	public Doctor buscarDocPorCedula(String cedula) {
		// TODO Auto-generated method stub
		Log.info("Conectado a la Base de Datos...");
		return this.doctorRepository.buscarDocPorCedula(cedula);
	}

}

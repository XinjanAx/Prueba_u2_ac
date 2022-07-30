package com.uce.demo2.prueba.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.prueba.modelo.CitaMedica;
import com.uce.demo2.prueba.repository.ICitaMedicaRepository;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	
	@Override
	public void insertarCitaM(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		Log.info("Conectado a la Base de Datos...");
		this.citaMedicaRepository.insertarCitaM(citaMedica);
	}

	@Override
	public CitaMedica buscarCitaM(Integer id) {
		// TODO Auto-generated method stub
		Log.info("Conectado a la Base de Datos...");
		return this.citaMedicaRepository.buscarCitaM(id);
	}

	@Override
	public void actualizarCitaM(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		Log.info("Conectado a la Base de Datos...");
		this.citaMedicaRepository.actualizarCitaM(citaMedica);
	}

	@Override
	public void borrarCitaM(Integer id) {
		// TODO Auto-generated method stub
		Log.info("Conectado a la Base de Datos...");
		this.citaMedicaRepository.borrarCitaM(id);
	}

	@Override
	public CitaMedica buscarPorNuemro(String numero) {
		// TODO Auto-generated method stub
		Log.info("Conectado a la Base de Datos...");
		return this.citaMedicaRepository.buscarPorNuemro(numero);
	}

}

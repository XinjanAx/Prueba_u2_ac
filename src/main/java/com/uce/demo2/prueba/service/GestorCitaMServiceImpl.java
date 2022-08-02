package com.uce.demo2.prueba.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo2.prueba.modelo.CitaMedica;

@Service
public class GestorCitaMServiceImpl implements IGestorCitaMService{

	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Autowired
	private ICitaMedicaService citaMService;
	
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Override
	public void agendamientoCitaMedica(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita,
			String lugarCita, String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
		
			CitaMedica citaMedica = new CitaMedica();
			citaMedica.setNumero(numeroCita);
			citaMedica.setFechaCita(fechaCita);
			citaMedica.setValorCita(valorCita);
			citaMedica.setLugar(lugarCita);
			citaMedica.setDoctor(this.doctorService.buscarDocPorCedula(cedulaDoctor));
			citaMedica.setPaciente(this.pacienteService.buscarPacientePorCedula(cedulaPaciente));
			this.citaMService.insertarCitaM(citaMedica);
		
	}


	@Override
	public void actualizarCitaM(String numeroCitaM, String diagnopstico , LocalDateTime nuevaFecha){
		// TODO Auto-generated method stub
		CitaMedica cm = this.citaMService.buscarPorNuemro(numeroCitaM);
		cm.setDiagnostico(diagnopstico);
		cm.setFechaProximaCita(nuevaFecha);
		this.citaMService.actualizarCitaM(cm);
	}

	@Override
	public void reportePaciente(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		Log.info("\n"+this.pacienteService.reportePaciente(fecha, genero));
	}

}

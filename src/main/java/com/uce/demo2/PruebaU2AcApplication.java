package com.uce.demo2;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo2.prueba.modelo.Doctor;
import com.uce.demo2.prueba.modelo.Paciente;
import com.uce.demo2.prueba.service.IDoctorService;
import com.uce.demo2.prueba.service.IGestorCitaMService;
import com.uce.demo2.prueba.service.IPacienteService;

@SpringBootApplication
public class PruebaU2AcApplication implements CommandLineRunner {

	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Autowired
	private IGestorCitaMService citaMService;
	
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IPacienteService iPacienteService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaU2AcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//Ingresar 2 pacientes y 2 doctores
		Doctor d1 = new Doctor();
		d1.setCedula("1257448753");
		d1.setNombre("Juan");
		d1.setApellido("Veles");
		d1.setFechaNacimiento(LocalDateTime.of(1989, 9, 8, 12, 45));
		d1.setNumeroConsultorio("c1");
		d1.setCogidoSenecyt("jv14574-1");
		d1.setGenero("Masculino");
		
		this.doctorService.insertarDoctor(d1);
		
		Doctor d2 = new Doctor();
		d2.setCedula("0255841215");
		d2.setNombre("Shally");
		d2.setApellido("Gallegos");
		d2.setFechaNacimiento(LocalDateTime.of(1974, 12, 8, 12, 45));
		d2.setNumeroConsultorio("c7");
		d2.setCogidoSenecyt("sg845638-7");
		d2.setGenero("Femenino");
		
		this.doctorService.insertarDoctor(d2);
		
		Paciente p1 = new Paciente();
		p1.setCedula("1774641523");
		p1.setNombre("Dario");
		p1.setApellido("Sanchez");
		p1.setFechaNacimiento(LocalDateTime.of(2000, 2, 5, 12, 45));
		p1.setCodigoSeguro("_0471");
		p1.setEstatura(1.8);
		p1.setPeso(74.0);
		p1.setGenero("Masculino");
		
		this.iPacienteService.insertarPaciente(p1);
		
		Paciente p2 = new Paciente();
		p2.setCedula("1799564862");
		p2.setNombre("Ariel");
		p2.setApellido("Merixalde");
		p2.setFechaNacimiento(LocalDateTime.of(1990, 8, 8, 12, 45));
		p2.setCodigoSeguro("_0542");
		p2.setEstatura(1.5);
		p2.setPeso(51.0);
		p2.setGenero("Femenino");
	
		this.iPacienteService.insertarPaciente(p2);
		
		this.citaMService.agendamientoCitaMedica("_004", LocalDateTime.now(), new BigDecimal(33.5), "Quito", "1257448753", "1799564862");
		
		this.citaMService.actualizarCitaM("_004", "Covid-19", LocalDateTime.now());
		this.citaMService.reportePaciente(LocalDateTime.of(1990, 8, 8, 12, 45), "Femenino");

	}

}

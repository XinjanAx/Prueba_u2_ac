package com.uce.demo2.prueba.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorCitaMService {
	
	public void  agendamientoCitaMedica(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita, String cedulaDoctor, String cedulaPaciente);
	
	public void actualizarCitaM(String numeroCitaM, String diagnopstico , LocalDateTime nuevaFecha);

	public void reportePaciente(LocalDateTime fecha, String genero);
}

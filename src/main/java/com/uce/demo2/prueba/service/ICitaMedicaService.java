package com.uce.demo2.prueba.service;

import com.uce.demo2.prueba.modelo.CitaMedica;

public interface ICitaMedicaService {
	
	public void insertarCitaM(CitaMedica citaMedica);

	public CitaMedica buscarCitaM(Integer id);

	public void actualizarCitaM(CitaMedica citaMedica);

	public void borrarCitaM(Integer id);

	public CitaMedica buscarPorNuemro(String numero);

}

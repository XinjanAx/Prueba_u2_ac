package com.uce.demo2.prueba.service;

import com.uce.demo2.prueba.modelo.Doctor;

public interface IDoctorService {
	
	public void insertarDoctor(Doctor doctor);

	public Doctor buscarDoctor(Integer id);

	public void actualizarDoctor(Doctor doctor);

	public void eliminarDoctor(Integer id);

	public Doctor buscarDocPorCedula(String cedula);

}

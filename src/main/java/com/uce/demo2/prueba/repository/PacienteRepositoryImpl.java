package com.uce.demo2.prueba.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.demo2.prueba.modelo.Paciente;
import com.uce.demo2.prueba.modelo.PacienteTo;

@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository {


	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public Paciente buscarPaciente(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public void borrarPaciente(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarPaciente(id));
	}

	@Override
	public Paciente buscarPacientePorCedula(String cedula) {
		TypedQuery<Paciente> myQuery = this.entityManager
				.createQuery("SELECT p FROM Paciente p WHERE p.cedula =:cedula", Paciente.class);
		myQuery.setParameter("cedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public List<PacienteTo> reportePaciente(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		TypedQuery<PacienteTo> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.demo2.prueba.modelo.PacienteTo(p.cedula,p.nombre,p.fechaNacimiento,p.genero) FROM Paciente p JOIN p.citaMedicas c WHERE p.fechaNacimiento >:fecha AND p.genero =:genero",
				PacienteTo.class);
		myQuery.setParameter("fecha", fecha);
		myQuery.setParameter("genero", genero);
		return myQuery.getResultList();
	}
}

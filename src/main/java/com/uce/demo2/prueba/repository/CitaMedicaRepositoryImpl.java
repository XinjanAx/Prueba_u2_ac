package com.uce.demo2.prueba.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.demo2.prueba.modelo.CitaMedica;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarCitaM(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public CitaMedica buscarCitaM(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CitaMedica.class, id);
	}

	@Override
	public void actualizarCitaM(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

	@Override
	public void borrarCitaM(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarCitaM(id));
	}

	@Override
	public CitaMedica buscarPorNuemro(String numero) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT c FROM CitaMedica c WHERE c.numero =:numero");
		myQuery.setParameter("numero", numero);
		return (CitaMedica) myQuery.getSingleResult();
	}

}

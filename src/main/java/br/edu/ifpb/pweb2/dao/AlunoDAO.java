package br.edu.ifpb.pweb2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.edu.ifpb.pweb2.model.Aluno;

@Repository
public class AlunoDAO {

	@PersistenceContext
	private EntityManager manager;
	
	@Transactional
	public void gravar(Aluno produto) {
		manager.persist(produto);
	}


	public List<Aluno> findAll(){
		Query query = manager.createQuery("SELECT x FROM Aluno x");
		return  query.getResultList();
			
	};

}

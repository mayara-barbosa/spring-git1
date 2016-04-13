package pucpr.bsi.prog4.models;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Primary
@Repository
public class JpaClienteRepository implements ClienteRepository{

	@PersistenceContext(name="lojaPU")
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void inserir(Cliente cliente) {
		entityManager.persist(cliente);
		
	}

}

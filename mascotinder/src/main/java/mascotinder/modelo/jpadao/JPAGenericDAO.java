	package mascotinder.modelo.jpadao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import mascotinder.modelo.dao.GenericDAO;

public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID>{

	private Class<T> persistenceClass;
	protected EntityManager em;
	private EntityTransaction t;
	
	public JPAGenericDAO(Class<T> persistenceClass) {
		this.persistenceClass = persistenceClass;
		this.em = Persistence.createEntityManagerFactory("mascotinder").createEntityManager();
		this.t = em.getTransaction();
	}

	
	public boolean create(T p) {
		t.begin();
		em.persist(p);
		t.commit();
		
		return false;
	}

	
	public boolean update(T p) {
		t.begin();
		em.merge(p);
		t.commit();
		return false;
	}

	
	public void delete(T p) {
		em.getTransaction().begin();
		try {
			em.remove(p);
			em.getTransaction().commit();
		} catch (Exception ex) {
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
	}

	@Override
	public T getById(ID id) {
		return em.find(this.persistenceClass, id);
	}


	@Override
	public List<T> getAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(persistenceClass);
        Root<T> rootEntry = cq.from(persistenceClass);
        CriteriaQuery<T> all = cq.select(rootEntry);
        TypedQuery<T> allQuery = em.createQuery(all);
        return allQuery.getResultList();
	}

}

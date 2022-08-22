package mascotinder.modelo.jpadao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import mascotinder.modelo.dao.GenericDAO;

public class JPAGenericDAO<T> implements GenericDAO<T>{

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

	
	public void delete(int id) {
		T entidad = em.find(persistenceClass, id);
		t.begin();
		em.remove(entidad);
		t.commit();
	}

	
	public T getById(int id) {
		return em.find(this.persistenceClass, id);
	}

}

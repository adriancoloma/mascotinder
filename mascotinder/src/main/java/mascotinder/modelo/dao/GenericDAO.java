package mascotinder.modelo.dao;

import java.util.List;

public interface GenericDAO<T, ID> {
	public boolean create(T p);
	public boolean update(T p);
	public void delete(T p);
	public List<T> getAll();
	public T getById(ID id);
}

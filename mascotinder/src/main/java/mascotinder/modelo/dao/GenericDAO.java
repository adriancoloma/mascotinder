package mascotinder.modelo.dao;

public interface GenericDAO<T> {
	public boolean create(T p);
	public boolean update(T p);
	public void delete(int id);
	public T getById(int id);
}

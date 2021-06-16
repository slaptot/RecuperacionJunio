package dao;

import java.util.List;

public interface Dao <T>{

	T listar (int id);
	
	List<T> listarTodos();
	
	void guardar (T t);
	
	void actualizar (T t);
	
	void eliminar (T t);
}

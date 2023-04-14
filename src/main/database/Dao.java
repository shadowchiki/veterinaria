package main.database;

import java.util.List;

public interface Dao<T> {

    public void crear(T source);
    public void borrar(T source);
    public T detalle(int id);
    public List<T> obtenerTodos();

}

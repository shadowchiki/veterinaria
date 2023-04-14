package main;

import java.util.List;

public interface Dao<T> {

    public void crear(T source);
    public void borrar(T source);
    public Propietario detalle(int id);
    public List<Propietario> obtenerTodos();

}

package main.database.listas;

import main.database.Dao;
import main.model.Propietario;

import java.util.ArrayList;
import java.util.List;

public class PropietarioDao implements Dao<Propietario> {

    private static final List<Propietario> PROPIETARIOS = new ArrayList<>();

    @Override
    public void crear(Propietario source) {
        PROPIETARIOS.add(source);
    }

    @Override
    public void borrar(Propietario source) {
        PROPIETARIOS.remove(source);
    }

    @Override
    public Propietario detalle(int id) {

        boolean encontrado = false;
        Propietario propietarioConsultar = null;
        for(int i = 0; i < PROPIETARIOS.size() || !encontrado; i++){

            if(PROPIETARIOS.get(i).getId() == id){
                encontrado = true;
                propietarioConsultar = PROPIETARIOS.get(i);
            }

        }

        return propietarioConsultar;
    }

    @Override
    public List<Propietario> obtenerTodos() {
        return PROPIETARIOS;
    }

}

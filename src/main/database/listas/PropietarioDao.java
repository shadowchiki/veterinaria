package main.database;

import main.model.Propietario;

import java.util.ArrayList;
import java.util.List;

public class PropietarioDao implements Dao<Propietario>{

    private final List<Propietario> propietarios;

    public PropietarioDao(){
        this.propietarios = new ArrayList<>();
    }

    @Override
    public void crear(Propietario source) {
        propietarios.add(source);
    }

    @Override
    public void borrar(Propietario source) {
        propietarios.remove(source);
    }

    @Override
    public Propietario detalle(int id) {

        boolean encontrado = false;
        Propietario propietarioConsultar = null;
        for(int i = 0; i < propietarios.size() || !encontrado; i++){

            if(propietarios.get(i).getId() == id){
                encontrado = true;
                propietarioConsultar = propietarios.get(i);
            }

        }

        return propietarioConsultar;
    }

    @Override
    public List<Propietario> obtenerTodos() {
        return propietarios;
    }

}

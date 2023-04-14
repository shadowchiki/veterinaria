package main.database.listas;

import main.database.Dao;
import main.model.Consulta;

import java.util.ArrayList;
import java.util.List;

public class ConsultaDao implements Dao<Consulta> {

    private static final List<Consulta> CONSULTAS = new ArrayList<>();

    @Override
    public void crear(Consulta source) {
        CONSULTAS.add(source);
    }

    @Override
    public void borrar(Consulta source) {
        CONSULTAS.remove(source);
    }

    @Override
    public Consulta detalle(int id) {

        boolean encontrado = false;
        Consulta consulta = null;
        for(int i = 0; i < CONSULTAS.size() || !encontrado; i++){
            if(CONSULTAS.get(i).getSala() == id){
                encontrado = true;
                consulta = CONSULTAS.get(i);
            }
        }

        return consulta;

    }

    @Override
    public List<Consulta> obtenerTodos() {
        return CONSULTAS;
    }
}

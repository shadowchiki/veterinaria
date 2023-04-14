package main.database.listas;

import main.database.Dao;
import main.model.Veterinario;

import java.util.ArrayList;
import java.util.List;

public class VeterinarioDao implements Dao<Veterinario> {

    private static final List<Veterinario> VETERINARIOS = new ArrayList<>();

    @Override
    public void crear(Veterinario source) {
        VETERINARIOS.add(source);
    }

    @Override
    public void borrar(Veterinario source) {
        VETERINARIOS.remove(source);
    }

    @Override
    public Veterinario detalle(int id) {

        boolean encontrado = false;
        Veterinario veterinario = null;
        for(int i = 0; i < VETERINARIOS.size() || !encontrado; i++){
            if(VETERINARIOS.get(i).getId() == id){
                encontrado = true;
                veterinario = VETERINARIOS.get(i);
            }
        }

        return veterinario;
    }

    @Override
    public List<Veterinario> obtenerTodos() {
        return VETERINARIOS;
    }
}

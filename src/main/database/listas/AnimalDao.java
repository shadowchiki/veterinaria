package main.database.listas;

import main.database.Dao;
import main.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalDao implements Dao<Animal> {

    private static final List<Animal> ANIMALES = new ArrayList<>();

    @Override
    public void crear(Animal source) {
        ANIMALES.add(source);
    }

    @Override
    public void borrar(Animal source) {
        ANIMALES.remove(source);
    }

    @Override
    public Animal detalle(int id) {

        boolean animalEncontrado = false;
        Animal animal = null;
        for(int i = 0; i < ANIMALES.size() || !animalEncontrado; i++){
            if(ANIMALES.get(i).getId() == id){
                animalEncontrado = true;
                animal = ANIMALES.get(i);
            }
        }

        return animal;
    }

    @Override
    public List<Animal> obtenerTodos() {
        return ANIMALES;
    }
}

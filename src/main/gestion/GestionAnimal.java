package main.gestion;

import main.database.listas.AnimalDao;
import main.model.Animal;
import main.view.console.GestionarAnimalConsoleView;

import java.util.List;

public class GestionAnimal extends Gestion{

    public GestionAnimal(){
        super(new GestionarAnimalConsoleView(), new AnimalDao());
    }

    @Override
    protected void alta() {
        Animal animal = pedirAnimal();
        dao.crear(animal);
        view.mostrar("Añadido el Animal");
    }

    @Override
    protected void mostrarTodo() {
        List<Animal> animales = dao.obtenerTodos();
        for (Animal animal : animales) {
            view.mostrar(animal.toString());
        }
    }

    @Override
    protected void consultar() {
        Animal animal = encontrar();
        if(animal != null){
            view.mostrar(animal.toString());
        } else {
            view.mostrar("El animal no existe");
        }
    }

    @Override
    protected void borrar() {
        Animal animal = encontrar();
        if(animal != null){
            dao.borrar(animal);
        } else {
            view.mostrar("El animal no existe");
        }
    }

    @Override
    protected boolean salir() {
        view.mostrar("Saliendo de la gestion de Animales");
        return true;
    }

    //Pensar si poner esto en la vista
    private Animal pedirAnimal() {

        String nombre = view.pedirString("Introduce el nombre del animal");
        int id = view.pedirInt("Introduce el id del animal");
        int idPropietario = view.pedirInt("Introduce el id del propietario del animal");

        Animal animal = new Animal();
        animal.setId(id);
        animal.setNombre(nombre);
        animal.setIdPropietario(idPropietario);

        return animal;
    }

    public Animal encontrar() {
        mostrarTodo();
        int idPropietario = view.pedirInt("Introduce el ID del Animal");
        return (Animal) dao.detalle(idPropietario);
    }

}

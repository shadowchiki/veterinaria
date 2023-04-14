package main;

import java.util.List;

public class GestionAnimal {

    public void gestionar(Propietario propietarioGestionar){
        List<Animal> animales = propietarioGestionar.getAnimales();
        boolean gestionAnimalTerminado = false;
        do {
            menu.mostrarMenuGestionAnimal();
            ejecucion = console.pedirInt("Introduce la ejecución que quieres");
            switch (ejecucion){
                case 1:
                    Animal animal = pedirAnimal();
                    animales.add(animal);

                    System.out.println("Añadido el Animal");
                    break;
                case 2:
                    System.out.println("2 - Mostrar Animal");
                    for(int i = 0; i < animales.size(); i++){
                        System.out.println(animales.get(i));
                    }
                    break;
                case 3:
                    int idAnimal = console.pedirInt("Introduce el ID del animal");
                    boolean animalEsEncontrado = false;
                    Animal animalEncontrado = null;
                    for(int i = 0; i < animales.size() || !animalEsEncontrado; i++){
                        if(animales.get(i).getId() == idAnimal){
                            animalEsEncontrado = true;
                            animalEncontrado = animales.get(i);
                        }
                    }

                    if(animalEncontrado != null){
                        System.out.println(animalEncontrado);
                    } else {
                        System.out.println("El animal no existe");
                    }

                    break;
                case 4:
                    int idAnimalBorrado = console.pedirInt("Introduce el ID del animal");
                    boolean animalEsEncontradoBorrado = false;
                    Animal animalBorrado = null;

                    for(int i = 0; i < animales.size() || !animalEsEncontradoBorrado; i++){
                        if(animales.get(i).getId() == idAnimalBorrado){
                            animalEsEncontradoBorrado = true;
                            animalBorrado = animales.get(i);
                        }
                    }

                    if(animalBorrado != null){
                        animales.remove(animalBorrado);
                    } else {
                        System.out.println("El animal no existe");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de la gestion de Animales");
                    gestionAnimalTerminado = true;
                    break;
            }

        } while (!gestionAnimalTerminado);
        propietarioGestionar.setAnimales(animales);
    }

}

package main;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {

    private final List<Propietario> propietarios;
    private final List<Veterinario> veterinarios;
    private final List<Consulta> consultas;
    private final Console console;
    private final Menu menu;

    public Veterinaria(){
        this.propietarios = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
        this.consultas = new ArrayList<>();
        this.console = new Console();
        this.menu = new Menu();
    }

    public void run(){

        boolean finPrograma = false;

        do {

            menu.mostrarMenuPrincipal();
            int ejecucion = console.pedirInt("Introduce la ejecución que quieres");

            switch (ejecucion){
                case 1:

                    GestionPropietario gestionPropietario = new GestionPropietario(new GestionarPropietarioConsoleView(), new PropietarioDao());
                    gestionPropietario.gestionar();

                    break;
                case 2:

                    boolean gestionVeteriarioTerminado = false;

                    do {
                        menu.mostrarMenuGestionVeterianio();
                        ejecucion = console.pedirInt("Introduce la ejecución que quieres");
                        switch (ejecucion){
                            case 1:

                                Veterinario veterinario = pedirVeterinario();
                                veterinarios.add(veterinario);
                                System.out.println("Se ha añadido el Veterinario");
                                break;
                            case 2:

                                for(int i = 0; i < veterinarios.size(); i++){
                                    System.out.println(veterinarios.get(i));
                                }

                                break;
                            case 3:

                                for(int i = 0; i < veterinarios.size(); i++){
                                    System.out.println(veterinarios.get(i));
                                }

                                int idVeterinario = console.pedirInt("Introduce el ID del veterinario");

                                Veterinario vetenarioEncontrado = null;
                                boolean veterinarioEncontrado = false;
                                for(int i = 0; i < veterinarios.size() || !veterinarioEncontrado; i++){
                                    if(veterinarios.get(i).getId() == idVeterinario){
                                        veterinarioEncontrado = true;
                                        vetenarioEncontrado = veterinarios.get(i);
                                    }
                                }

                                if(vetenarioEncontrado != null){
                                    System.out.println(vetenarioEncontrado);
                                } else {
                                    System.err.println("No existe el veterinario");
                                }

                                break;
                            case 4:

                                for(int i = 0; i < veterinarios.size(); i++){
                                    System.out.println(veterinarios.get(i));
                                }

                                int idVeterinarioBorrado = console.pedirInt("Introduce el ID del veterinario");

                                Veterinario vetenarioBorrado = null;
                                boolean veterinarioBorrado = false;
                                for(int i = 0; i < veterinarios.size() || !veterinarioBorrado; i++){
                                    if(veterinarios.get(i).getId() == idVeterinarioBorrado){
                                        veterinarioBorrado = true;
                                        vetenarioBorrado = veterinarios.get(i);
                                    }
                                }

                                if(vetenarioBorrado != null){
                                    veterinarios.remove(vetenarioBorrado);
                                } else {
                                    System.err.println("No existe el veterinario");
                                }

                                break;
                            case 5:
                                System.out.println("Saliendo de la gestion de Veterinarios");
                                gestionVeteriarioTerminado = true;
                                break;
                        }



                    } while (!gestionVeteriarioTerminado);

                    break;
                case 3:

                    int idVeterinario = console.pedirInt("Introduce el ID del veterinario");
                    Veterinario vetenarioEncontrado = null;
                    boolean veterinarioEncontrado = false;
                    for(int i = 0; i < veterinarios.size() || !veterinarioEncontrado; i++){
                        if(veterinarios.get(i).getId() == idVeterinario){
                            veterinarioEncontrado = true;
                            vetenarioEncontrado = veterinarios.get(i);
                        }
                    }

                    if(vetenarioEncontrado != null){
                        System.out.println(veterinarioEncontrado);
                    } else {
                        System.err.println("No existe el veterinario");
                    }

                    int idPropietario = console.pedirInt("Introduce el ID del propietario");
                    boolean encontrado = false;
                    Propietario propietarioConsultar = null;
                    for(int i = 0; i < propietarios.size() || !encontrado; i++){

                        if(propietarios.get(i).getId() == idPropietario){
                            encontrado = true;
                            propietarioConsultar = propietarios.get(i);
                        }

                    }

                    Animal animalEncontrado = null;
                    if(propietarioConsultar != null){
                        System.out.println(propietarioConsultar);
                        List<Animal> animales = propietarioConsultar.getAnimales();

                        int idAnimal = console.pedirInt("Introduce el ID del veterinario");
                        boolean animalEsEncontrado = false;
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

                    } else {
                        System.err.println("No existe el Propietario");
                    }

                    Consulta nuevaConsulta = new Consulta(consultas.size(), animalEncontrado, vetenarioEncontrado, propietarioConsultar);
                    consultas.add(nuevaConsulta);


                    break;
                case 4:

                    for(int i = 0; i < consultas.size(); i++){
                        System.out.println(consultas.get(i));
                    }

                    break;
                case 5:

                    for(int i = 0; i < consultas.size(); i++){
                        System.out.println(consultas.get(i));
                    }
                    
                    int salaConsulta = console.pedirInt("Introduce la sala de consulta");
                    boolean consultaEsEncontrada = false;
                    Consulta consultaEncontrada = null;
                    for(int i = 0; i < consultas.size() || !consultaEsEncontrada; i++){
                        if(consultas.get(i).getSala() == salaConsulta){
                            consultaEsEncontrada = true;
                            consultaEncontrada = consultas.get(i);
                        }
                    }

                    if(consultaEncontrada != null){
                        consultaEncontrada.vacunar();
                    } else {
                        System.out.println("No existe la consulta");
                    }

                    break;
                case 6:
                    System.out.println("Programa finalizado");
                    finPrograma = true;
                    break;
            }

        } while(!finPrograma);

    }

    private Animal pedirAnimal() {

        Animal animal = new Animal();
        return animal;

    }

    private Veterinario pedirVeterinario() {
        System.out.println("Introduce el nombre del Veterinario");
        String nombre = console.pedirString("Introduce el nombre del Veterinario");

        int idVeterinario = console.pedirInt("Introduce el id del Veterinario");

        Veterinario veterinario = new Veterinario();
        veterinario.setId(idVeterinario);
        veterinario.setNombre(nombre);

        return veterinario;
    }

}

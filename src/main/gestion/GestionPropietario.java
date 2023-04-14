package main;

import java.util.List;

public class GestionPropietario {

    //TODO hacer una clase abstracta llamada Gestion que tenga los atributos y el metodo gestionar que tenga los metodos del swtich abstractos
    //y que cada clase GestionX implemente los metodos abstractos

    //Sacar de aqui la gestion de animales
    private final View view;
    private final Dao<Propietario> dao;

    public GestionPropietario(View view, Dao<Propietario> dao){
        this.view = view;
        this.dao = dao;
    }

    public void gestionar(){

        boolean gestionPropietarioTerminado = false;

        do {
            view.mostrar();

            int ejecucion = view.pedirInt("Introduce la ejecución que quieres");

            switch (ejecucion) {
                case 1 -> darAlta();
                case 2 -> mostrarPropietarios();
                case 3 -> consultar();
                case 4 -> borrar();
                case 5 -> {
                    System.out.println("Saliendo de la gestion de Propietarios");
                    gestionPropietarioTerminado = true;
                }
            }

        } while (!gestionPropietarioTerminado);

    }

    private void gestionAnimales() {
        Propietario propietarioConsultar = encontrarPropietario();

        if(propietarioConsultar != null){

            GestionAnimal gestionAnimal = new GestionAnimal();
            gestionAnimal.gestionar(propietarioConsultar);

        } else {
            System.err.println("No existe el Propietario");
        }
    }

    private void borrar() {
        Propietario propietarioConsultar = encontrarPropietario();

        if(propietarioConsultar != null){
            dao.borrar(propietarioConsultar);
        } else {
            System.err.println("No existe el Propietario");
        }
    }

    private void consultar() {
        Propietario propietarioConsultar = encontrarPropietario();

        if(propietarioConsultar != null){
            System.out.println(propietarioConsultar);
        } else {
            System.err.println("No existe el Propietario");
        }
    }

    private void darAlta() {
        Propietario propietario = pedirPropietario();
        dao.crear(propietario);
        System.out.println("Se ha añadido el Propietario");
    }

    private Propietario encontrarPropietario() {

        mostrarPropietarios();

        int idPropietario = view.pedirInt("Introduce el ID del propietario");

        return dao.detalle(idPropietario);
    }

    private void mostrarPropietarios() {
        List<Propietario> propietarios = dao.obtenerTodos();
        for (Propietario propietario : propietarios) {
            System.out.println(propietario);
        }
    }

    private Propietario pedirPropietario() {

        String nombre = view.pedirString("Introduce el nombre del Propietario");
        int idPropietario = view.pedirInt("Introduce el id del propietario");

        Propietario propietario = new Propietario();
        propietario.setNombre(nombre);
        propietario.setId(idPropietario);

        return propietario;
    }

}

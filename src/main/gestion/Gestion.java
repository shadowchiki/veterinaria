package main.gestion;

import main.database.Dao;
import main.view.View;

abstract class Gestion {

    protected View view;
    protected Dao dao;

    Gestion(View view, Dao dao){
        this.view = view;
        this.dao = dao;
    }

    public void gestionar(){

        boolean terminarGestion = false;

        do {
            view.mostrarMenu();

            int ejecucion = view.pedirInt("Introduce la ejecución que quieres");

            switch (ejecucion) {
                case 1 -> alta();
                case 2 -> mostrarTodo();
                case 3 -> consultar();
                case 4 -> borrar();
                case 5 -> terminarGestion = salir();
                default -> view.mostrar("Te has equivocado introduce el valor correcto del Menu");
            }

        } while (!terminarGestion);

    }

    protected abstract void alta();

    protected abstract void mostrarTodo();

    protected abstract void consultar();

    protected abstract void borrar();

    protected abstract boolean salir();
}

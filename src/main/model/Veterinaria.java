package main.model;

import main.gestion.GestionAnimal;
import main.gestion.GestionConsulta;
import main.gestion.GestionPropietario;
import main.gestion.GestionVeterinario;
import main.view.View;
import main.view.console.VeterinariaView;

public class Veterinaria {

    private View view;

    public Veterinaria(){
        this.view = new VeterinariaView();
    }

    public void run(){
        boolean finPrograma = false;
        GestionConsulta gestionConsulta = new GestionConsulta();

        do {
            view.mostrarMenu();
            int ejecucion = view.pedirInt("Introduce la ejecución que quieres");
            switch (ejecucion){
                case 1 -> new GestionPropietario().gestionar();
                case 2 -> new GestionAnimal().gestionar();
                case 3 -> new GestionVeterinario().gestionar();
                case 4 -> gestionConsulta.gestionar();
                case 5 -> gestionConsulta.vacunar();
                case 6 -> finPrograma = salir();
                default -> view.mostrar("Te has equivocado introduce el valor correcto del Menu");
            }
        } while(!finPrograma);
    }

    private boolean salir() {
        view.mostrar("Programa finalizado");
        return true;
    }

    public static void main(String[] args) {
        new Veterinaria().run();
    }

}

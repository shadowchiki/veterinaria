package main.gestion;

import main.model.Animal;
import main.model.Consulta;
import main.model.Propietario;
import main.model.Veterinario;
import main.view.View;

public class ConsultaDarAlta {

    private GestionAnimal gestionAnimal;
    private GestionPropietario gestionPropietario;
    private GestionVeterinario gestionVeterinario;
    private View view;

    public ConsultaDarAlta(View view){
        this.view = view;
        this.gestionAnimal = new GestionAnimal();
        this.gestionPropietario = new GestionPropietario();
        this.gestionVeterinario = new GestionVeterinario();
    }

    public Consulta darAlta(){

        Animal animal = gestionAnimal.encontrar();
        Propietario propietario = gestionPropietario.encontrar();
        Veterinario veterinario = gestionVeterinario.encontrar();

        int numeroSala = view.pedirInt("Introduce el número de la sala");
        return new Consulta(numeroSala, animal, veterinario, propietario);

    }

}

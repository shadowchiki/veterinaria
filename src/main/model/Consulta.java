package main.model;

public class Consulta {

    private int sala;
    private Animal animal;
    private Veterinario veterinario;
    private Propietario propietario;

    public Consulta(int sala, Animal animal, Veterinario veterinario, Propietario propietario) {
        this.sala = sala;
        this.animal = animal;
        this.veterinario = veterinario;
        this.propietario = propietario;
    }

    public int getSala() {
        return sala;
    }

    public void vacunar(){

        animal.vacunar();

    }

    @Override
    public String toString() {
        return "Consulta:" +
                "sala:" + sala +
                ", animal:" + animal +
                ", veterinario:" + veterinario +
                ", propietario:" + propietario;
    }
}

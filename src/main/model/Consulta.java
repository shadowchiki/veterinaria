package main;

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

    public void setSala(int sala) {
        this.sala = sala;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void vacunar(){

        System.out.println("Se realiza la consulta del animal " + getAnimal().getNombre());

        if(propietario.getVacunaciones() != propietario.getAnimales().size()){
            if(getAnimal().isVacunado()){
                System.out.println("El animal ya se ha vacunado");
            } else {
                System.out.println("Se vacuna al animal");
                getAnimal().setVacunado(true);
                propietario.setVacunaciones(propietario.getVacunaciones()+1);
            }
        } else {
            System.out.println("El propietario tiene vacunados todos los animales");
        }

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

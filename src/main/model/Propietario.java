package main;

import java.util.ArrayList;
import java.util.List;

public class Propietario {

    public Propietario(){
        this.animales = new ArrayList<>();
    }

    private int id;
    private String nombre;
    private List<Animal> animales;
    private int vacunaciones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public int getVacunaciones() {
        return vacunaciones;
    }

    public void setVacunaciones(int vacunaciones) {
        this.vacunaciones = vacunaciones;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", animales=" + animales +
                ", vacunaciones=" + vacunaciones +
                '}';
    }
}

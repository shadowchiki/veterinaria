package main.model;

public class Animal {

    private int id;
    private String nombre;
    private boolean vacunado;
    private int idPropietario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", vacunado=" + vacunado +
                ", idPropietario=" + idPropietario +
                '}';
    }

    public void vacunar() {
        System.out.println("Se realiza la consulta del animal " + this.nombre);
        if(this.vacunado){
            System.out.println("El animal ya se ha vacunado");
        } else {
            System.out.println("Se vacuna al animal");
            this.vacunado = true;
        }
    }
}

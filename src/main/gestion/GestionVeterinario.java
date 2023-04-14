package main.gestion;

import main.database.listas.VeterinarioDao;
import main.model.Veterinario;
import main.view.console.GestionarVeterinarioConsoleView;

import java.util.List;

public class GestionVeterinario extends Gestion{

    public GestionVeterinario() {
        super(new GestionarVeterinarioConsoleView(), new VeterinarioDao());
    }

    @Override
    protected void alta() {
        dao.crear(pedirVeterinario());
    }

    @Override
    protected void mostrarTodo() {
        List<Veterinario> veterinarios = dao.obtenerTodos();
        for(Veterinario veterinario : veterinarios){
            view.mostrar(veterinario.toString());
        }
    }

    @Override
    protected void consultar() {
        Veterinario veterinario = encontrar();

        if(veterinario != null){
            view.mostrar(veterinario.toString());
        } else {
            view.mostrar("No existe el veterinario");
        }

    }

    @Override
    protected void borrar() {
        Veterinario veterinario = encontrar();
        if(veterinario != null){
            dao.borrar(veterinario);
        } else {
            view.mostrar("No existe el veterinario");
        }
    }

    @Override
    protected boolean salir() {
        return true;
    }

    public Veterinario encontrar(){
        mostrarTodo();
        int idVeterinario = view.pedirInt("Introduce el id del Veterinario");
        return (Veterinario) dao.detalle(idVeterinario);
    }

    private Veterinario pedirVeterinario() {
        String nombre = view.pedirString("Introduce el nombre del Veterinario");
        int idVeterinario = view.pedirInt("Introduce el id del Veterinario");

        Veterinario veterinario = new Veterinario();
        veterinario.setId(idVeterinario);
        veterinario.setNombre(nombre);

        return veterinario;
    }

}

package main.gestion;

import main.database.listas.PropietarioDao;
import main.model.Propietario;
import main.view.console.GestionarPropietarioConsoleView;

import java.util.List;

public class GestionPropietario extends Gestion{

    public GestionPropietario(){
        super(new GestionarPropietarioConsoleView(), new PropietarioDao());
    }

    @Override
    protected void alta() {
        Propietario propietario = pedirPropietario();
        dao.crear(propietario);
        view.mostrar("Se ha añadido el Propietario");
    }

    @Override
    protected void mostrarTodo() {
        List<Propietario> propietarios = dao.obtenerTodos();
        for (Propietario propietario : propietarios) {
            view.mostrar(propietario.toString());
        }
    }

    @Override
    protected void consultar() {
        Propietario propietario = encontrar();
        if(propietario != null){
            view.mostrar(propietario.toString());
        } else {
            view.mostrar("No existe el Propietario");
        }
    }

    @Override
    protected void borrar() {
        Propietario propietarioConsultar = encontrar();
        if(propietarioConsultar != null){
            dao.borrar(propietarioConsultar);
        } else {
            view.mostrar("No existe el Propietario");
        }
    }

    @Override
    protected boolean salir() {
        view.mostrar("Saliendo de la gestion de Propietarios");
        return true;
    }

    private Propietario pedirPropietario() {

        String nombre = view.pedirString("Introduce el nombre del Propietario");
        int idPropietario = view.pedirInt("Introduce el id del propietario");

        Propietario propietario = new Propietario();
        propietario.setNombre(nombre);
        propietario.setId(idPropietario);

        return propietario;
    }

    public Propietario encontrar() {
        mostrarTodo();
        int idPropietario = view.pedirInt("Introduce el ID del propietario");
        return (Propietario) dao.detalle(idPropietario);
    }

}

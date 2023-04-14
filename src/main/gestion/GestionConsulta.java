package main.gestion;

import main.database.listas.ConsultaDao;
import main.model.*;
import main.view.console.GestionarConsultaConsoleView;

import java.util.List;

public class GestionConsulta extends Gestion{

    private ConsultaDarAlta consultaDarAlta;

    public GestionConsulta() {
        super(new GestionarConsultaConsoleView(), new ConsultaDao());
        this.consultaDarAlta = new ConsultaDarAlta(view);
    }

    @Override
    protected void alta() {
        dao.crear(consultaDarAlta.darAlta());
    }

    @Override
    protected void mostrarTodo() {
        List<Consulta> consultas = dao.obtenerTodos();
        for(Consulta consulta : consultas){
            view.mostrar(consulta.toString());
        }
    }

    @Override
    protected void consultar() {
        Consulta consulta = encontrar();
        view.mostrar(consulta.toString());
    }

    @Override
    protected void borrar() {
        Consulta consulta = encontrar();
        dao.borrar(consulta);
    }

    @Override
    protected boolean salir() {
        return true;
    }

    private Consulta encontrar() {
        mostrarTodo();
        int idConsulta = view.pedirInt("Introduce la sala de la Consulta");
        return (Consulta) dao.detalle(idConsulta);
    }

    public void vacunar(){
        mostrarTodo();
        Consulta consulta = encontrar();
        if(consulta != null){
            consulta.vacunar();
        } else {
            view.mostrar("No existe la consulta");
        }
        dao.borrar(consulta);
    }

}

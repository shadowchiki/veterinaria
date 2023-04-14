package main;

import main.database.listas.AnimalDao;
import main.model.Consulta;
import main.view.View;

public class ConsultaDarAlta {

    private AnimalDao animalDao;
    private View view;

    public ConsultaDarAlta(View view){
        this.view = view;
    }

    public Consulta darAlta(){
        animalDao.obtenerTodos();

        return new Consulta();
    }

}

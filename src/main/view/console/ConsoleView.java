package main.view.console;

import main.model.Console;
import main.view.View;

abstract class ConsoleView implements View {

    protected Console console;

    ConsoleView(){
        this.console = new Console();
    }

    @Override
    public int pedirInt(String texto) {
        return console.pedirInt(texto);
    }

    @Override
    public String pedirString(String texto) {
        return console.pedirString(texto);
    }

    @Override
    public void mostrar(String texto) {
        System.out.println(texto);
    }

}

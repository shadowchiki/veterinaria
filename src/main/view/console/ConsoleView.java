package main.view;

import main.model.Console;

abstract class ConsoleView implements View {

    protected Console console;

    ConsoleView(){
        this.console = new Console();
    }

}

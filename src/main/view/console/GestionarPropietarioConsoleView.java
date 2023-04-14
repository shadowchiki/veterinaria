package main.view.console;

public class GestionarPropietarioConsoleView extends ConsoleView {

    @Override
    public void mostrarMenu() {
        mostrar("----- Menu Propietario -----");
        mostrar("1 - Dar de alta Propietario");
        mostrar("2 - Mostrar Propietarios");
        mostrar("3 - Consultar Propietario");
        mostrar("4 - Eliminar Propietario");
        mostrar("5 - Salir");
    }

}

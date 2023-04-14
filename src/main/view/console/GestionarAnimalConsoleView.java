package main.view.console;

public class GestionarAnimalConsoleView extends ConsoleView {

    @Override
    public void mostrarMenu() {
        mostrar("----- Menu Animal -----");
        mostrar("1 - Dar de alta Animal");
        mostrar("2 - Mostrar Animal");
        mostrar("3 - Consultar Animal");
        mostrar("4 - Eliminar Animal");
        mostrar("5 - Salir");
    }

}

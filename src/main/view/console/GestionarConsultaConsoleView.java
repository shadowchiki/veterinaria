package main.view.console;

public class GestionarConsultaConsoleView extends ConsoleView{
    @Override
    public void mostrarMenu() {
        mostrar("----- Menu Consulta -----");
        mostrar("1 - Dar de alta Consulta");
        mostrar("2 - Mostrar Consulta");
        mostrar("3 - Consultar Consulta");
        mostrar("4 - Eliminar Consulta");
        mostrar("5 - Salir");
    }

}

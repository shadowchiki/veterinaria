package main.view.console;

public class GestionarVeterinarioConsoleView extends ConsoleView{
    @Override
    public void mostrarMenu() {
        mostrar("----- Menu Veterinario -----");
        mostrar("1 - Dar de alta Veterinario");
        mostrar("2 - Mostrar Veterinario");
        mostrar("3 - Consultar Veterinario");
        mostrar("4 - Borrar Veterinario");
        mostrar("5 - Salir");
    }

}

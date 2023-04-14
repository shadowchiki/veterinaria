package main.view.console;

public class GestionarVeterinario extends ConsoleView{
    @Override
    public void mostrar() {
        System.out.println("----- Menu Veterinario -----");
        System.out.println("1 - Dar de alta Veterinario");
        System.out.println("2 - Mostrar Veterinario");
        System.out.println("3 - Consultar Veterinario");
        System.out.println("4 - Borrar Veterinario");
        System.out.println("5 - Salir");
    }
}

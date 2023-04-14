package main.view.console;

public class VeterinariaView extends ConsoleView {
    @Override
    public void mostrarMenu() {
        mostrar("----- Menu Principal -----");
        mostrar("1 - Gestionar Propietarios");
        mostrar("2 - Gestionar Animales");
        mostrar("3 - Gestionar Veterinarios");
        mostrar("4 - Gestionar Consulta");
        mostrar("5 - Vacunar");
        mostrar("6 - Salir");
    }

}

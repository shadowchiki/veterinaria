package main.view;

public class GestionarPropietarioConsoleView extends ConsoleView {

    @Override
    public void mostrar() {
        System.out.println("----- Menu Propietario -----");
        System.out.println("1 - Dar de alta Propietario");
        System.out.println("2 - Mostrar Propietarios");
        System.out.println("3 - Consultar Propietario");
        System.out.println("4 - Eliminar Propietario");
        System.out.println("5 - Salir");
    }

    @Override
    public int pedirInt(String texto) {
        return console.pedirInt(texto);
    }

    @Override
    public String pedirString(String texto) {
        return console.pedirString(texto);
    }
}

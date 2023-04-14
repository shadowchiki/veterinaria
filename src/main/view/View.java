package main.view;

public interface View {

    void mostrarMenu();
    void mostrar(String texto);
    int pedirInt(String texto);
    String pedirString(String texto);

}

package main;

import java.util.Scanner;

public class Console {

    private final Scanner scanner;

    public Console(){
        scanner = new Scanner(System.in);
    }

    public int pedirInt(String texto){
        System.out.println(texto);
        return Integer.parseInt(scanner.nextLine());
    }

    public String pedirString(String texto){
        System.out.println(texto);
        return scanner.nextLine();
    }

}

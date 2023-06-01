package ExercicioUmListaOito;

import java.util.Scanner;
public class Main1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bola bola = new Bola();

        System.out.println(bola.mostraCor());
        bola.trocaCor("Vermelho");
        System.out.println(bola.mostraCor());

        scanner.close();
    }
}

package ExercicioDoisListaOito;

import java.util.Scanner;
public class Main2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();

        System.out.println(quadrado.retornarValorDoLado());
        System.out.println("A área do quadrado é: " + quadrado.calcularArea());
        quadrado.mudarValorDoLado(8);
        System.out.println(quadrado.retornarValorDoLado());
        System.out.println("A área do quadrado é: " + quadrado.calcularArea());

        scanner.close();
    }
}

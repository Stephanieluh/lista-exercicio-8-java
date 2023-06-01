package ExercicioSeteListaOito;

import java.util.Scanner;
public class Main8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BichinhoVirtual tamagushi = new BichinhoVirtual();

        System.out.println("Olá, sou o Tamagushi, seu bichinho virtual. \nQuer saber como estou? ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {

            System.out.println("Nome: " + tamagushi.getNome());
            System.out.println("Idade: " + tamagushi.getIdade());
            System.out.println("Fome: " + tamagushi.getFome());
            System.out.println("Saúde: " + tamagushi.getSaude());
            System.out.println("Humor: " + tamagushi.calcularHumor());
        } else {
            System.out.println("Okay, então até a próxima!");
            scanner.close();
        }
    }
    
}

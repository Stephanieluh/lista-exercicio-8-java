package ExercicioTresListaOito;

import java.util.Scanner;
public class Main3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo= new Retangulo();

        System.out.println("Informe a base do local que deseja calcular: ");
        retangulo.setBase(scanner.nextDouble());
        System.out.println("Informe a altura do local que deseja calcular: ");
        retangulo.setAltura(scanner.nextDouble());

        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        
        System.out.printf("\nÁrea do local é: %.2f" , area);
        System.out.printf("\nPerímetro do local é: %.2f" , perimetro);
        

        // Calcula a quantidade de pisos necessários
        double areaPiso = 1.5; // área de cada piso em metros quadrados
        int quantidadePisos = (int) (area / areaPiso);

        // Calcula a quantidade de rodapés necessários
        double comprimentoRodape = 0.5; // comprimento de cada rodapé em metros
        int quantidadeRodapes = (int) (perimetro / comprimentoRodape);

        System.out.println("\nQuantidade de pisos necessários: " + quantidadePisos);
        System.out.println("Quantidade de rodapés necessários: " + quantidadeRodapes);

        scanner.close();
    }
}

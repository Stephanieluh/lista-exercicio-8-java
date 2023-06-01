package ExercicioQuatroListaOito;

public class Main4 {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Altura: " + pessoa.getAltura());
    
        pessoa.envelhecer(pessoa.getIdade());
        pessoa.engordar(pessoa.getPeso());
        pessoa.emagrecer(pessoa.getPeso());
        pessoa.crescer(pessoa.getAltura());
        System.out.println("Nova idade: " + pessoa.getIdade());
        System.out.println("Novo peso: " + pessoa.getPeso());
        System.out.println("Nova altura: " + pessoa.getAltura());
        
    }
} 

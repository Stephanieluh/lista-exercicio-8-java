package ExercicioQuatroListaOito;

public class Pessoa {

    private String nome = "João";
    private int idade = 70;
    private double peso = 70;
    private double altura = 1.70;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void envelhecer(int idade) {
        idade++;
        if (idade >= 21) {
            crescer(0);
        }else if(idade < 21){
            crescer(0.5);
        }else;
    }
    public void engordar(double pesoGanho) {
        peso += pesoGanho;
    }
    public void emagrecer(double pesoPerdido) {
        peso -= pesoPerdido;
    }
    public void crescer(double alturaGanha) {
        altura = alturaGanha;
    }
}
    


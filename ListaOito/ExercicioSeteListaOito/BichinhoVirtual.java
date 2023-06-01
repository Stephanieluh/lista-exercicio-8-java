package ExercicioSeteListaOito;

public class BichinhoVirtual {
    
    private String nome = "Pluto";
    private int fome = 2;
    private int idade = 5;
    private int saude = 10;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getFome() {
        return fome;
    }
    public void setFome(int fome) {
        this.fome = fome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getSaude() {
        return saude;
    }
    public void setSaude(int saude) {
        this.saude = saude;
    }


    public void alterarNome(String nome) {
        this.nome = nome;
    }
    public void alterarFome(int fome) {
        this.fome = fome;
    }
    public void alterarSaude(int saude) {
        this.saude = saude;
    }
    public void alterarIdade(int idade) {
        this.idade = idade;
    }
    public String calcularHumor() {
        if (fome <= 7 && saude >= 7) {
            return "Feliz :)";
        } else if (fome <= 5 && saude < 7) {
            return "Neutro :/";
        } else {
            return "Triste :(";
        }
    }
}


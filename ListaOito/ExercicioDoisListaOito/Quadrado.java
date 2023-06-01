package ExercicioDoisListaOito;

public class Quadrado {

    private double tamanhoDoLado = 10;

    public double getTamanhoDoLado() {
        return tamanhoDoLado;
    }
    public void setTamanhoDoLado(double tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public double mudarValorDoLado(double novoValor){
        return tamanhoDoLado = novoValor;
    }
    public String retornarValorDoLado(){
        return ("O tamanho do lado é: " + tamanhoDoLado);
    }
    public double calcularArea(){
        return (Math.pow(tamanhoDoLado,2));
    }

    
}

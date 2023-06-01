package ExercicioCincoListaOito;

public class ContaCorrente {
    
    private int numeroConta = 456987;
    private String nomeCorrentista = "Maria";
    private double saldo = 1000;

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getNomeCorrentista() {
        return nomeCorrentista;
    }
    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void alterarNome(String novoNome) {
        nomeCorrentista = novoNome;
    }
    public void deposito(double valor) {
        saldo += valor;
    }
    public void saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}


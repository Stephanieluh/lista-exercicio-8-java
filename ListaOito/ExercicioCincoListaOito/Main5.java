package ExercicioCincoListaOito;

public class Main5 {
    
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Nome do correntista: " + conta.getNomeCorrentista());
        System.out.println("Saldo: " + conta.getSaldo());

        conta.alterarNome("Maria Clara");
        System.out.println("Novo nome do correntista: " + conta.getNomeCorrentista());

        conta.deposito(100.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        conta.saque(50.0);
        System.out.println("Saldo após saque: " + conta.getSaldo());

        conta.saque(100.0);
    }
}


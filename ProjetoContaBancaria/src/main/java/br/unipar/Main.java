package br.unipar;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(1000d);
        System.out.println("O SALDO É:" + contaCorrente.obterSaldo());
        System.out.println("Numero da conta é:" + contaCorrente.retornarNumeroConta());
    }
}

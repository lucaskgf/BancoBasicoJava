package banco;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        conta1.setnConta(123456);
        System.out.println("O numero da conta: " + conta1.getnConta());
        System.out.println("Saldo atual: " + conta1.getSaldo());
        conta1.depositar(200.0);
        System.out.println("########################");
        System.out.println("O valor depositado foi de: " + conta1.getSaldo());
        System.out.println("O numero da conta: " + conta1.getnConta());
        System.out.println("Saldo atual: " + conta1.getSaldo());
        conta1.sacar(45.0);
        System.out.println("########################");
        System.out.println("O numero da conta: " + conta1.getnConta());
        System.out.println("O saque foi de: " + conta1.getSaldo());
        System.out.println("########################");
        System.out.println("O saldo atual é de: " + conta1.getSaldo());
    }
}

package banco;

public class ContaCorrente {
    private int nConta;
    private double saldo;

    public ContaCorrente() {
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0.0) {
            this.saldo += valorDeposito;
        } else {
            System.out.println("O deposito tem que ser maior que zero!!");
        }

    }

    public void sacar(double valorSaque) {
        if (valorSaque <= this.saldo) {
            this.saldo -= valorSaque;
        } else {
            System.out.println("Sua conta precisa de saldo");
        }

    }

    public int getnConta() {
        return this.nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

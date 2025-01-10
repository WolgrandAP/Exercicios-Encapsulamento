package exercicio1;

public class ContaBancaria {
    private int conta;
    private float saldo;

    public ContaBancaria(int conta, float saldo) {
        this.setConta(conta);
        this.setSaldo(saldo);
    }

    public void setConta(int c) {
        this.conta = c;
    }
    public int getConta() {
        return this.conta;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }
    public float getSaldo() {
        return this.saldo;
    }

    public void depositar(float valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void sacar(float valor) {
        if (this.getSaldo()<valor || this.getSaldo() == 0) {
            float ce = valor - this.getSaldo();

            this.setSaldo(0);
            System.out.println("Valor descontado do cheque especial e emréstimo de R$" + ce);

        } else {

            this.setSaldo(this.getSaldo() - valor);
        }
    }

    public String verificarSaldo() {
        return "O saldo atual da conta " + this.getConta() + " é de R$" + this.getSaldo();
    }
}

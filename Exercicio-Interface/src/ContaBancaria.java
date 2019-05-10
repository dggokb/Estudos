public abstract class ContaBancaria {
    private String conta;
    private double saldo;

    public ContaBancaria(String conta, double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    public void transferir(double valor,ContaBancaria contaDestinatario) {
        sacar(valor);
        contaDestinatario.depositar(valor);
    }

    public abstract void sacar(double valorSacado);

    public abstract void depositar(double valorDeposito);


    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}

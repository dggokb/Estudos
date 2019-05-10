public class ContaCorrente implements Conta {
    private double saldo;

    private double taxaOperacao = 0.45;

    @Override
    public void depositar(double valor) {
        this.saldo += valor - taxaOperacao;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor + taxaOperacao;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaOperacao() {
        return taxaOperacao;
    }

    public void setTaxaOperacao(double taxaOperacao) {
        this.taxaOperacao = taxaOperacao;
    }
}

public class ContaCorrente extends ContaBancaria implements Imprimivel{

    private double taxaDeOperacao = 8.00;


    public ContaCorrente(String conta, double saldo) {
        super(conta, saldo);
    }

    @Override
    public void sacar(double valorSacado) {
        if (valorSacado > getSaldo()){
            System.out.println("Nao há limite!");
        }else{
            double valorFinal = getSaldo() - (valorSacado + getTaxaDeOperacao());
            setSaldo(valorFinal);
        }
    }

    @Override
    public void depositar(double valorDeposito) {
        double valorFinal = (valorDeposito - getTaxaDeOperacao()) + getSaldo();
        setSaldo(valorFinal);
    }

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public String mostrarDados() {
        return "O saldo é: "+ getSaldo();
    }

}

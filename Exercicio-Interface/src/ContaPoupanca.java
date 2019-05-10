public class ContaPoupanca extends ContaBancaria implements Imprimivel{

    private double limite = 2000;

    public ContaPoupanca(String conta, double saldo) {
        super(conta, saldo);
    }

    @Override
    public void sacar(double valorSacado) {
        if(valorSacado > getSaldo()){
            double valorFinal = (getSaldo() - valorSacado) - limite;
            setSaldo(valorFinal);
        }else {
            double valorFinal = getSaldo() - valorSacado;
            setSaldo(valorFinal);
        }
    }

    @Override
    public void depositar(double valorDeposito) {
        double valorFinal = valorDeposito + getSaldo();
        setSaldo(valorFinal);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String mostrarDados() {
        return "O saldo é: "+ getSaldo();
    }
}

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;


    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(){
        return getValorCredito() - getValorDivida();
    }

    @Override
    public String toString(){
        return "Valor da divida do: " + getNome() + " é de: " +
                getValorDivida() + " seu crédito final é de: " + obterSaldo();
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}

public class Vendedor extends Empregado {

    private double valorDeVendas;
    private double comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor,
                    double salarioBase, double imposto, double valorDeVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorDeVendas = valorDeVendas;
        this.comissao = comissao;
    }

    public double calculaComissao() {
        return getComissao() * getValorDeVendas();
    }

    @Override
    public double calculaSalario() {
        double diferenca = getSalarioBase() - (getSalarioBase() * getImposto());
        System.out.println(diferenca);
        return diferenca + calculaComissao();
    }


    public double getValorDeVendas() {
        return valorDeVendas;
    }

    public void setValorDeVendas(double valorDeVendas) {
        this.valorDeVendas = valorDeVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}

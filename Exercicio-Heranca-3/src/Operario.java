public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor,
                    double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double calculaComissao() {
        return getComissao() * getValorProducao();
    }

    @Override
    public double calculaSalario() {
        double diferenca = getSalarioBase() - (getSalarioBase() * getImposto());
        return diferenca + calculaComissao();
    }

    @Override
    public String toString() {
        return "O Operario: " + getNome() + " tem o salário base: " +
                getSalarioBase() + " seu salário final é de: " + calculaSalario();
    }


    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}

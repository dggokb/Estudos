public class Administrador extends Empregado {

    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calculaSalario() {
        double diferenca = getSalarioBase() - (getSalarioBase() * getImposto());
        return diferenca + getAjudaDeCusto();
    }

    @Override
    public String toString() {
        return "O Empregado: " + getNome() + " tem o salário base: " + getSalarioBase() +
                " retirando o imposto de 10% e adicionado a ajuda de custo, seu salário é de: " + calculaSalario();
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}

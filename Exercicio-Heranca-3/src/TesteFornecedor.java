public class TesteFornecedor {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Diego", "Rua", "777-777", 2000, 250);

        System.out.println("Valor da divida do: " + fornecedor.getNome() + " é de: " +
                fornecedor.getValorDivida() + " seu crédito final é de: " + fornecedor.obterSaldo());

        Fornecedor fornecedor2 = new Fornecedor("Diego", "Rua", "777-777", 1000, 250);

        System.out.println("Valor da divida do: " + fornecedor2.getNome() + " é de: " +
                fornecedor2.getValorDivida() + " seu crédito final é de: " + fornecedor2.obterSaldo());

        Empregado empregado = new Empregado("Maria", "Rua blala", "22-22",
                10, 3000.00, 0.10);

        System.out.println("O Empregado: " + empregado.getNome() + " tem o salário base: " +
                empregado.getSalarioBase() + " retirando o imposto de 10% seu salário é de: " + empregado.calculaSalario());

        Administrador administrador = new Administrador("Laura", "Rua blala",
                "22-22", 10, 4000.00, 0.10, 1500);

        System.out.println("O Empregado: " + administrador.getNome() +
                " tem o salário base: " + administrador.getSalarioBase() +
                " retirando o imposto de 10% e adicionado a ajuda de custo, seu salário é de: " + administrador.calculaSalario());

        Operario operario = new Operario("Max", "Rua blala", "22-22",
                10, 1000.00, 0.10, 2000, 0.20);

        System.out.println("O Operario: " + operario.getNome() + " tem o salário base: " +
                operario.getSalarioBase() + " seu salário final é de: " + operario.calculaSalario());

        Vendedor vendedor = new Vendedor("Dunhas", "Rua blala", "22-22",
                10, 5000.00, 0.10, 1000, 0.25);

        System.out.println("O Vendedor: " + vendedor.getNome() + " tem o salário base: " +
                vendedor.getSalarioBase() + " seu salário final é de: " + vendedor.calculaSalario());
    }
}

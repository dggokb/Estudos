public class TestandoAClasse {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Diego", 33, "Masculino", 2000, "123456", "Sarandi");

        gerente.saidaGerentes();

        Vendedor vendedor = new Vendedor("Joao", 22, "Masculino", 3000, "12312", 150,230);

        vendedor.saidaVendedor();

        Cliente cliente = new Cliente("Lucas", 30, "Masculino", 1500,1985);

        cliente.saidaCliente();
    }
}

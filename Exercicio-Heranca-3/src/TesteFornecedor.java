public class TesteFornecedor {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Diego", "Rua", "777-777", 2000, 250);

        System.out.println(fornecedor);

        Fornecedor fornecedor2 = new Fornecedor("Dunha", "Rua", "777-777", 1000, 250);

        System.out.println(fornecedor2);

        Empregado empregado = new Empregado("Maria", "Rua blala", "22-22",
                10, 3000.00, 0.10);

        System.out.println(empregado);

        Administrador administrador = new Administrador("Laura", "Rua blala",
                "22-22", 10, 4000.00, 0.10, 1500);

        System.out.println(administrador);

        Operario operario = new Operario("Max", "Rua blala", "22-22",
                10, 1000.00, 0.10, 2000, 0.20);

        System.out.println(operario);

        Vendedor vendedor = new Vendedor("Dunhas", "Rua blala", "22-22",
                10, 5000.00, 0.10, 1000, 0.25);

        System.out.println();
    }
}

public class TestandoConta {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente("111", 2300);
        ContaCorrente contaCorrente2 = new ContaCorrente("333", 2300);
        ContaPoupanca contaPoupanca = new ContaPoupanca("222", 2500);
        Banco banco = new Banco();

//        contaCorrente.sacar(150);
//        contaPoupanca.sacar(3000);

        contaCorrente.transferir(2000,contaPoupanca);

        Relatorio relatorio = new Relatorio();
//        System.out.println(relatorio.gerarRelatorio(contaCorrente));
//        System.out.println(relatorio.gerarRelatorio(contaPoupanca));

        banco.inserirConta(contaCorrente);
        banco.inserirConta(contaCorrente2);
        banco.inserirConta(contaPoupanca);
        banco.procurarConta(222);


    }
}


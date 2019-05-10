public class TesteContas {

    public static void main (String[] args){
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(100);
        cc.sacar(10);

        GeradoExtratos geradoExtratos = new GeradoExtratos();
        geradoExtratos.geradorConta(cc);

    }
}

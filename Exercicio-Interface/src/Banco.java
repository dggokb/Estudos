import java.util.ArrayList;

public class Banco {

    ArrayList<String> bancoDeContasBancarias = new ArrayList<String>();

    public void inserirConta(ContaBancaria conta) {
        bancoDeContasBancarias.add(conta.getConta());
    }

    public void removerConta(ContaBancaria conta) {
        bancoDeContasBancarias.remove(conta.getConta());
    }

    public String procurarConta(int contaAProcurar) {
        for (Object oRef : bancoDeContasBancarias) {
            if (Integer.parseInt(String.valueOf(oRef)) == contaAProcurar) {
               return String.valueOf(oRef);
            }
        }
        return null;
    }

}

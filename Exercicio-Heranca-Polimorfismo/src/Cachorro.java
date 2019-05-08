public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void saidaCachorro (){
        System.out.println("O nome do animal: "+ getNome() + " Peso: " + getPeso() + " Habitat: "+ getRaca());
    }
}

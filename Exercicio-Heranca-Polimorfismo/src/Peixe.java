public class Peixe extends Animal {

    private String tipoHabitat;

    public Peixe(String nome, double peso, String tipoHabitat) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public void saidaPeixe (){
        System.out.println("O nome do animal: "+ getNome() + " Peso: " + getPeso() + " Habitat: "+ getTipoHabitat());
    }
}

public class TesteAnimal {

    public  static  void main (String[] args) {
        Peixe peixe = new Peixe("Lambari", 150, "Agua doce");
        Cachorro cachorro = new Cachorro("Max", 35, "Boxer");

        peixe.saidaPeixe();
        cachorro.saidaCachorro();
    }

}

public class TesteAnimal {

    public  static  void main (String[] args) {
        Peixe peixe2 = new Peixe("Sambanga", 250);
        Peixe peixe = new Peixe("Lambari", 150, "Agua doce");
        Cachorro cachorro = new Cachorro("Max", 35, "Boxer");

        System.out.println(peixe2);
        System.out.println(peixe);
        System.out.println(cachorro);
    }

}

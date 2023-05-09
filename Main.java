
public class Main {
    public static void main(String[] args) {
        Carro carro = new Gol();
        carro.setModelo("Gol");
        carro.setCor("Branco");
        carro.setMarca("Fiat");
        System.out.println( carro.getMarca()+" "+ carro.getModelo() +" "+ carro.getCor() );
    }
}
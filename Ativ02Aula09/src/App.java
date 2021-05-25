public class App {
    public static void main(String[] args) {
        Carro carro = new Carro();
        ControleRemoto c1 = new ControleRemoto(carro);
        c1.mover();
    }
}

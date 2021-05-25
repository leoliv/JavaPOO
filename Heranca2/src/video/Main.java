package video;
public class Main {
    public static void main(String[] args) {
        
        Automovel carro = new Automovel();
        int n = carro.CalculaNumPneusReserva();
        System.out.println("Num steps: " + n);
    }
}

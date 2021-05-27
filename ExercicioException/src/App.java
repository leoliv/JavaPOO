import cores.Cores;
import exep.ExcecaoCor;

public class App {
    public static void main(String[] args) {

        Cores cor = new Cores();
        
        try {
            cor.acertarCor("vermelho");
        } catch (ExcecaoCor ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
    }
}

package aulainterface;

public class Main {
    
    public static void main(String[] args) {
        
        Robo r = new Robo();
        Trator t = new Trator();
        ControleRemoto cr = new ControleRemoto();
        cr.moverObjetoParaFrente(r);
        cr.dobrarADireita(r);
        cr.moverObjetoParaTras(t);
    }
}

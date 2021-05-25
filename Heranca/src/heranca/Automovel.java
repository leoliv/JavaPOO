package heranca;

public class Automovel extends Terrestre {
    private String cor;
    private int numPorta;
    private String placa;

    public void status() {
        System.out.println("--------------------");        
        System.out.println("Cor: " + getCor());
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Número de rodas: " + getNumeroDeRodas());
        System.out.println("Número de portas: " + getNumPorta());
        System.out.println("Placa: " + getPlaca());
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPorta() {
        return numPorta;
    }

    public void setNumPorta(int numPorta) {
        this.numPorta = numPorta;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}

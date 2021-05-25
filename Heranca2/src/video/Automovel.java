package video;

public class Automovel extends Terrestre {
    // Atributos
    private String cor;
    private int numPortas;
    private String placa;

    // Métodos
    public void imprimeDadosAutomovel() {
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Números de rodas: " + numRodas);
        System.out.println("Cor: " + cor);
    }

    
    public Automovel() {
        super(4, 10);
    }

    // Método construtor com a palavra reservada 'super'
    public Automovel(int capacidade, int numRodas, String cor, int numPortas, String placa) {
        
        super(capacidade, numRodas);
        this.cor = cor;
        this.numPortas = numPortas;
        this.placa = placa;
    }

    // Métodos especiais
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

}

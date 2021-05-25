package video;

public class Terrestre extends Transporte {
    // Atributos
    protected int numRodas;

    // Método construtor com a palavra reservada 'super'
    public Terrestre(int capacidade, int numRodas) {
        super(capacidade);
        this.numRodas = numRodas;
    }

    public void status() {
        System.out.println("Númeor de rodas: " + this.numRodas);
    }

    // Métodos especiais
    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }
    public int CalculaNumPneusReserva() {
        return numRodas - 4; // Numeros de rodas será sempre numRodas = numRodas - 4;
    }
    
}

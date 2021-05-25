package video;

public class Transporte {
    // Atributos
    protected int capacidade;

    // Método Construtor com a palavra reservada 'super'.
    public Transporte(int capacidade) {
        // Apenas comentários podem vim antes da palavra 'super'.
        super();
        this.capacidade = capacidade;
    }

    // Métodos especiais
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

}

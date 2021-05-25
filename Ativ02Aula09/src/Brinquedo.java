public class Brinquedo {
    private String nome;
    private double velocidade;
    private double aceleracao;

    public void detalhe() {
        System.out.println("Nome do brinquedo: " + this.nome);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Aceleração: " + this.aceleracao);
    }

    public Brinquedo() {

    }
    public Brinquedo(String nome) {
        this.nome = nome;
    }
    public void mover() {
        System.out.println("O brinquedo está se movendo!");
    }
    public void velocidade(int vel) {
        this.velocidade = vel;
    }
    public void velocidade(double vel) {
        this.velocidade = vel;
    }
    public void velocidade(float vel, double ac) {
        this.aceleracao = ac;
        this.velocidade = vel + ac;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public double getAceleracao() {
        return aceleracao;
    }
    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }
        
}

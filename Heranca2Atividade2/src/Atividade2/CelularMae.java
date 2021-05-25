package atividade2;

public class CelularMae {
    protected boolean ligado;
    protected int chamada;
    
    protected void telaCelularMae() {
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Fazer chamada para o número : " + this.getChamada());
    }

    // Métodos especiais
    public CelularMae(boolean ligado, int chamada) {
        super();
        this.ligado = ligado;
        this.chamada = chamada;
    }
    
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public int getChamada() {
        return chamada;
    }
    public void setChamada(int chamada) {
        this.chamada = chamada;
    }

    
}

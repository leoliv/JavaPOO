package myjava;

public class Motor {
    private int potencia;
    
    //Métodos especiais
    public Motor() {
        this.potencia = 1000;
    }
    
    public Motor(int potencia) {
        this.potencia = potencia;
    }
    
    public int getPotencia() {
        return this.potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
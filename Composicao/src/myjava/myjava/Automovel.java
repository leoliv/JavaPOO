package myjava;

public class Automovel {
    private Motor motor;
	//private Direcao direcao;
    
    public void status() {
        System.out.println("Potencia do motor é: " + this.getMotor().getPotencia());
    }
    
    //1º Caso: O construtor Automovel chama o construtor Motor
    /*public Automovel() {
        motor = new Motor();
    }
    
    public Automovel(int potencia) {
        motor = new Motor(potencia);
    }*/
    
    // 2º Caso: O método da classe Automovel chama o construtor Motor
    /*public void ligarPrimeiraVez() {
        motor = new Motor();
    }
    
    public void ligarPrimeiraVez(int potencia) {
        motor = new Motor(potencia);
    }*/
    
    //3º caso O objeto Motor não será definido no construtor, e nem em um método, mas sim na classe principal
   
    public Motor getMotor() {
        return this.motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    /*public Direcao getDirecao() {
        return this.Derecao;
    }
    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }*/
}
    
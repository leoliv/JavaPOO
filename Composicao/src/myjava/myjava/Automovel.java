package myjava;

public class Automovel {
    private Motor motor;
	//private Direcao direcao;
    
    public void status() {
        System.out.println("Potencia do motor �: " + this.getMotor().getPotencia());
    }
    
    //1� Caso: O construtor Automovel chama o construtor Motor
    /*public Automovel() {
        motor = new Motor();
    }
    
    public Automovel(int potencia) {
        motor = new Motor(potencia);
    }*/
    
    // 2� Caso: O m�todo da classe Automovel chama o construtor Motor
    /*public void ligarPrimeiraVez() {
        motor = new Motor();
    }
    
    public void ligarPrimeiraVez(int potencia) {
        motor = new Motor(potencia);
    }*/
    
    //3� caso O objeto Motor n�o ser� definido no construtor, e nem em um m�todo, mas sim na classe principal
   
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
    
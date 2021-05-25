package myjava;

public class Main {
    public static void main(String[] args) {
        Automovel automovel = new Automovel();
        
        //automovel.ligarPrimeiraVez(10); //2º caso.
        
        //3º caso
        // Constroi o objeto Motor e Automovel e depois chama um método da classe Automovel e passamos o objeto motor no parâmetro do método chamado.
        Motor motor = new Motor();
        automovel.setMotor(motor);
        automovel.status();
    }
}
package myjava;

public class Main {
    public static void main(String[] args) {
        Automovel automovel = new Automovel();
        
        //automovel.ligarPrimeiraVez(10); //2� caso.
        
        //3� caso
        // Constroi o objeto Motor e Automovel e depois chama um m�todo da classe Automovel e passamos o objeto motor no par�metro do m�todo chamado.
        Motor motor = new Motor();
        automovel.setMotor(motor);
        automovel.status();
    }
}
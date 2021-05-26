package pacote1;

import java.util.Scanner;

public class DivisaoPorZero {
    public static int quociente(int numerador, int denominador) throws ArithmeticException {
        return numerador/denominador;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite o numerador: ");
            int numerador = input.nextInt();
            System.out.print("Digite o denominador: ");
            int denominador = input.nextInt();
            double resultado = quociente(numerador, denominador);
            System.out.println("O resultado da divisão é: " + resultado);
            input.close();
        } catch (ArithmeticException erro) {
            System.err.println("Erro: " + erro); // Significa que tamos exibindo um erro e essa mensagem será exibida em vermelho
            System.out.println("Zero não é um denominador válido!");
        }
    }
}
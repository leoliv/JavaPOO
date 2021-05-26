package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); // Para considerar o pontinho "." como separador de decimais não a virgula ","
        Scanner input = new Scanner(System.in);


        System.out.println("Informe os dados da conta");
        System.out.print("Numero: ");
        int number = input.nextInt();
        System.out.print("Titular: ");
        input.nextLine();
        String holder = input.nextLine();
        System.out.print("Saldo inicial: ");
        double balance = input.nextDouble();
        System.out.print("Limite de saque: ");
        double withdrawLimit = input.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amount = input.nextDouble();

        // Esse código abaixo não tem uma boa delegação.
        // Eu tenho de delegar o código de uma certa logica ele tem que está na classe correspondente aquela lógica

        //Se esse código é para verificar as regras da conta bancária ele tinha que está lá na classe da conta bancária não no programa principal
        /* if (amount > acc.getWithdrawLimit()) {
            System.out.println("Erro de saque: A quantia exede o limite do saque");
        } else if (amount > acc.getBalance()) {
            System.out.println("Erro de saque: Saldo insuficiente");
        } */ 

        // Gambiarra abaixo
        // A maneira certa é mexer com exceção
        /* String error = acc.validateWithDraw(amount);
        if (error != null) {
            System.out.println(error);
        } */ 

        // ESSA É A MELHOR SOLUÇÃO, NO CASO, CHAMAR EXCEÇÕES.
        // Deixar o código com uma melhor MANUTENÇÃO/CÓDIGO LIMPO
        try {
            acc.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        } catch (BusinessException ex) {
            System.out.println(ex.getMessage());
        }

        
        
        input.close();
    }
}

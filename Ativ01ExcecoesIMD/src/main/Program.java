package main;

import java.util.Scanner;

import exceptioncarro.Carro;
import exceptions.CarroException;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Marca do carro: ");
        String marca = input.nextLine();
        System.out.print("Quantas portas: ");
        int quantPortas = input.nextInt();
        System.out.print("Dono do carro: ");
        input.nextLine();
        String dono = input.nextLine();

        Carro carro = new Carro(marca, quantPortas, dono);
        

        try {
            carro.verificar(dono);
            carro.ligar();
            System.out.println("O dono do carro " + carro.getDono() + " está muito feliz.");
        } catch (CarroException ex) {
            System.out.println(ex.getMessage());
        } finally {
            carro.desligar();
        }

        input.close();
    }
}

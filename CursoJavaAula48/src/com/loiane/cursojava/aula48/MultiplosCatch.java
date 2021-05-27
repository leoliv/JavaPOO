package com.loiane.cursojava.aula48;

public class MultiplosCatch {
    
    public static void main(String[] args) {
        
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denomid = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denomid[i] + " = " + (numeros[i]/denomid[i]));
            } catch (ArithmeticException e) {
                System.err.println("Erro ao dividir por zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Posição do array inválida!");
            }
        }
    }
}

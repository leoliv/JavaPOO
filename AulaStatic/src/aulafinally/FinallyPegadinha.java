package aulafinally;

public class FinallyPegadinha {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero");
                System.exit(0); //Ao terminar execução do programa dentro do try ou catch, finally NÃO é executado.
            } catch (ArrayIndexOutOfBoundsException e) {
                System.exit(0); // Essa linha simplesmente termina a execução do programa. É como se puxa-se o cabo da tomada.
                System.out.println("Posição do array inválido");
            } finally { // De acordo com esse exemplo o finally sempre será execultado.
                System.out.println("Essa linha é impressa sempre após o try ou catch");
                System.out.println();
            }
        }
    }
}

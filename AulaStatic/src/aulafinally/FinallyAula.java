package aulafinally;

public class FinallyAula {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for (int i : numeros) {
            try {
                System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição do array inválido");
            } finally { // De acordo com esse exemplo o finally sempre será executado.
                System.out.println("Essa linha é impressa sempre após o try ou catch");
            }
        }
    }
}

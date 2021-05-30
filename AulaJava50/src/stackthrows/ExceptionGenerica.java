package stackthrows;

public class ExceptionGenerica {
    public static void main(String[] args) {
        
        int[] number = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + "/" + denom[i] + " = " + (number[i]/denom[i]));
            } catch (Exception e) {
                // System.out.println("Aconteceu um erro"); // Não se coloca a mensagem assim, porque não é uma boa prática. Se coloca em logs. Existe bibliotecas muito famosas no java como "Log4j" , que são bibliotecas utilizadas pra criar arquivos de log.

                // System.out.println(e.getMessage()); // Pode colocar desse jeito, mas ainda não é muito útil para os programadores colocando apenas desse jeito.

                // Usando esses dois em conjuntos é muito mais útil para um desemvolvedor.
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}

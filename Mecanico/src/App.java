import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ferramentas[] = new String[5];
        for (int i = 0; i <= 4; i++) {
            System.out.print("Escreva a " + (i+1) + "ª ferramenta de um mecânico: ");
            ferramentas[i] = input.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("ferramenta: " + ferramentas[i]);
        }
        input.close();
    }
}

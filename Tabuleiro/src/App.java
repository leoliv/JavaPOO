public class App {
    public static void main(String[] args) {
        String casa[][] = new String[64][64];
        String x;
        String y = "PRETO ";
        String z = "BRANCO ";
        for (int i = 0; i < casa.length; i++) {
            for (int j = 0; j < casa.length; j++) {
                x = z;
                y = x;
                casa[i][j] = y;
                if (y == "BRANCO ") {
                    z = "PRETO ";
                } else {
                    z = "BRANCO ";
                    x = "PRETO ";
                }
            }
            if (z == "BRANCO ") {
                z = "PRETO ";

            } else {
                z="BRANCO ";
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(casa[i][j]);       
            }
            System.out.println();
        }
    }
}
